package com.nk.springboot.config;

import com.baomidou.mybatisplus.extension.plugins.PaginationInterceptor;
import org.springframework.context.annotation.Configuration;

/**
 * mybatis-plus分页插件
 */
@Configuration
public class MybatisPlusConfig {
    /**
     * 分页插件
     * @return
     */
    public PaginationInterceptor paginationInterceptor(){
        return new PaginationInterceptor();
    }
}
