package com.nk.springboot.utils.redis;

import com.nk.springboot.exception.BusinessException;
import javafx.util.Builder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/**
 * redis工具类
 * 交给spring容器实例化
 */
@Component
public class RedisUtil {
    @Autowired
    private RedisTemplate<String,Object> redisTemplate;
    /**======================================================Common==================================================**/

    /**
     * 设置缓存失效时间
     * @param key 键
     * @param time 时间（秒）
     * @return
     */
    public boolean expire(String key,long time){
        try{
            if(time>0){
                redisTemplate.expire(key,time, TimeUnit.SECONDS);
            }
            return true;
        }catch (Exception e){
            throw new BusinessException("redis设置缓存时间失败："+e.getMessage());
        }
    }

    /**
     * 根据key获取过期时间
     * @param key 键 不为空
     * @return 时间（秒） 0代表永久有效
     */
    public long getExpire(String key){
        return redisTemplate.getExpire(key,TimeUnit.SECONDS);
    }

    /**
     * 判断key是否存在
     * @param key 键
     * @return
     */
    public boolean hasKey(String key){
        try {
            return redisTemplate.hasKey(key);
        }catch(Exception e){
            throw new BusinessException("redis判断key是否存在失败："+e.getMessage());
        }
    }

    /**
     * 删除缓存
     * @param key 键可以传一个或多个
     */
    @SuppressWarnings("unchecked")
    public void del(String... key){
        if(key!=null&&key.length>0){
            if(key.length==1){
                redisTemplate.delete(key[0]);
            }else{
                redisTemplate.delete((Collection<String>) CollectionUtils.arrayToList(key));
            }
        }
    }
/**======================================================String==================================================**/
    /**
     * 获取普通缓存
     * @param key
     * @return
     */
    public Object get(String key){
        return key == null ? null : redisTemplate.opsForValue().get(key);
    }

    /**
     * 存放缓存
     * @param key 键
     * @param value 值
     * @return
     */
    public boolean set(String key,Object value){
        try{
            redisTemplate.opsForValue().set(key,value);
            return true;
        }catch (Exception e){
            throw new BusinessException("redis存放："+key+"失败"+e.getMessage());
        }
    }

    /**
     * 放入缓存并设置时间
     * @param key 键
     * @param value 值
     * @param time 有效时长
     * @return
     */
    public boolean set(String key,Object value,long time){
        try {
            if(time>0){
                redisTemplate.opsForValue().set(key,value,time);
            }else{
                redisTemplate.opsForValue().set(key,value);
            }
            return true;
        }catch (Exception e){
            throw new BusinessException("redis存放带有有效时长的缓存"+key+"时失败，"+e.getMessage());
        }
    }

    /**
     * 递增
     * @param key 键
     * @param delta 步长值
     * @return
     */
    public long increment(String key,long delta){
        if(delta<0){
            throw new BusinessException(key+"的步长值必须大于零！");
        }else{
            return redisTemplate.opsForValue().increment(key,delta);
        }
    }

    /**
     * 递减
     * @param key 键
     * @param delta 步长值
     * @return
     */
    public long decr(String key,long delta){
        if(delta<0){
            throw new BusinessException(key +"的步长值必须大于零！");
        }else{
            return redisTemplate.opsForValue().decrement(key,-delta);
        }
    }
/**======================================================Map==================================================**/
    /**
     * hashget 获取hashkey对应的单个键值
     * @param key 键
     * @param item 值
     * @return 键值非空
     */
    public Object hget(String key,String item){
        return redisTemplate.opsForHash().get(key,item);
    }

    /**
     * 获取hashkey对应的多个键值
     * @param key 键
     * @return
     */
    public Map<Object,Object> hmget(String key){
        return redisTemplate.opsForHash().entries(key);
    }

    /**
     * hashset
     * @param key 键
     * @param map 键对应的多个值
     * @return
     */
    public boolean hmset(String key,Map<String,Object> map){
        try {
            redisTemplate.opsForHash().putAll(key,map);
            return true;
        }catch (Exception e){
            throw new BusinessException("redis存放map集合："+key+"时失败："+e.getMessage());
        }
    }

    /**
     * 存放的map集合设置有效时长
     * @param key 键
     * @param map 值（map集合）
     * @param time 有效时长
     * @return
     */
    public boolean hmset(String key,Map<String,Object> map,long time){
        try {
            redisTemplate.opsForHash().putAll(key,map);
            if(time>0){
                expire(key,time);
            }
            return true;
        }catch (Exception e){
            throw new BusinessException("redis存放带有效时长的map集合："+key+"失败:"+e.getMessage());
        }
    }

    /**
     * 向hash表放数据，不存在则创建
     * @param key 键
     * @param item 项
     * @param map map集合
     * @return
     */
    public boolean hset(String key,String item,Object map){
        try{
            redisTemplate.opsForHash().put(key,item,map);
            return true;
        }catch (Exception e){
            throw new BusinessException("redis存放"+key+"失败："+e.getMessage());
        }
    }

    /**
     * 向hash表存放数据，不存在则创建，并且，设置有效时长
     * @param key 键
     * @param item 项
     * @param value 值
     * @param time 有效时长,如果hash表内存在时间则覆盖
     * @return
     */
    public boolean hset(String key,String item,Object value,long time){
        try{
            redisTemplate.opsForHash().put(key,item,value);
            if(time<0){
                expire(key,time);
            }
            return true;
        }catch (Exception e){
            throw new BusinessException("redis存放数据"+key+"并设置有效时长失败："+e.getMessage());
        }
    }

    /**
     * 删除hash值
     * @param key 键
     * @param value 值可为多个
     */
    public void hdel(String key,String... value){
        redisTemplate.opsForHash().delete(key,value);
    }

    /**
     * 判断hash表内是否存在该项的值
     * @param key 键
     * @param item 项
     * @return
     */
    public boolean hHashKey(String key,String item){
        return redisTemplate.opsForHash().hasKey(key,item);
    }

    /**
     * hash递增，不存在则创建，并且，返回递增后的值
     * @param key 键
     * @param item 项
     * @param by 步长值
     * @return
     */
    public double hincr(String key,String item,double by){
        return redisTemplate.opsForHash().increment(key,item,by);
    }

    /**
     * hash递减，
     * @param key 键
     * @param item 项
     * @param by 步长值
     * @return
     */
    public double hdecr(String key,String item,double by){
        return redisTemplate.opsForHash().increment(key,item,-by);
    }
    /**======================================================Map==================================================**/
    /**
     * 获取set集合的所有制
     * @param key
     * @return
     */
    public Set<Object> sGet(String key){
        try{
            return redisTemplate.opsForSet().members(key);
        }catch (Exception e){
            throw new BusinessException("redis获取set集合元素失败："+e.getMessage());
        }
    }

    /**
     * 根据value判断set集合内是否存在
     * @param key 键
     * @param value 值
     * @return
     */
    public boolean sHasKey(String key,Object value){
        try {
            return redisTemplate.opsForSet().isMember(key, value);
        }catch (Exception e){
            throw new BusinessException("redis判断set集合内是否存在元素"+key+"失败："+e.getMessage());
        }
    }

    /**
     * 项set集合存放数据
     * @param key 键
     * @param values 值
     * @return 返回存放成功的个数
     */
    public long sSet(String key,Object... values){
        try{
            return redisTemplate.opsForSet().add(key, values);
        }catch (Exception e){
            throw new BusinessException("redis向set集合存放数据："+key+"失败："+e.getMessage());
        }
    }

    /**
     * 向set集合存放数据并设置有效时长
     * @param key 键
     * @param time 有效时长
     * @param values 值
     * @return 返回存放成功的个数
     */
    public long sSet(String key,long time,Object... values){

    }
}
