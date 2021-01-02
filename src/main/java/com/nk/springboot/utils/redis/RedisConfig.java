package com.nk.springboot.utils.redis;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.PropertyAccessor;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisConnection;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.Jackson2JsonRedisSerializer;
import org.springframework.data.redis.serializer.StringRedisSerializer;

/**
 * redis配置类---重新配置RedisTemplate
 */
@Configuration
public class RedisConfig {
        @Bean
        @SuppressWarnings("all")
        public RedisTemplate<String,Object> redisTemplate(RedisConnectionFactory redisConnectionFactory){
            RedisTemplate<String,Object> template = new RedisTemplate<>();
            template.setConnectionFactory(redisConnectionFactory);

            Jackson2JsonRedisSerializer jackson2JsonRedisSerializer = new Jackson2JsonRedisSerializer(Object.class);

            ObjectMapper objectMapper = new ObjectMapper();
            objectMapper.setVisibility(PropertyAccessor.ALL, JsonAutoDetect.Visibility.ANY);
            objectMapper.enableDefaultTyping(ObjectMapper.DefaultTyping.NON_FINAL);
            jackson2JsonRedisSerializer.setObjectMapper(objectMapper);

            StringRedisSerializer stringRedisSerializer = new StringRedisSerializer();
            //key采用String序列化的方式
            template.setKeySerializer(stringRedisSerializer);
            //hash的key也采用String的序列化
            template.setHashKeySerializer(stringRedisSerializer);
            //value的序列化方式采用jackson
            template.setValueSerializer(jackson2JsonRedisSerializer);
            //hash的value也采用Jackson
            template.setHashKeySerializer(jackson2JsonRedisSerializer);
            template.afterPropertiesSet();
            return template;
        }
}
