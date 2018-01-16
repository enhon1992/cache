package com.bbkj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.Cache;
import org.springframework.cache.CacheManager;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cache.concurrent.ConcurrentMapCache;
import org.springframework.cache.concurrent.ConcurrentMapCacheManager;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.serializer.JdkSerializationRedisSerializer;

/**
 * Hello world!
 *
 */
@SpringBootApplication
@EnableCaching
public class App 
{
    public static void main( String[] args )
    {
        JdkSerializationRedisSerializer defaultSerializer = new JdkSerializationRedisSerializer(App.class.getClassLoader());
        //ConfigurableApplicationContext context = SpringApplication.run(App.class, args);
        System.out.println(defaultSerializer.serialize(2));
    }
}
