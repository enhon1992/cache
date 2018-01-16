package com.bbkj.controller;

import com.bbkj.dao.impl.TestServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.Cache;
import org.springframework.cache.concurrent.ConcurrentMapCache;
import org.springframework.cache.concurrent.ConcurrentMapCacheManager;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @Autowired
    private TestServiceImpl testServiceImpl;

    @Autowired
    private ConfigurableApplicationContext context;

    @GetMapping("/aaa")
    public String test1(){
        return this.testServiceImpl.test1("kobe");
    }

    @GetMapping("/bbb")
    public String test2(){
        return this.testServiceImpl.test2(2);
    }

    @GetMapping("/ccc")
    public String test3(){
        return this.testServiceImpl.test3(2);
    }


    @GetMapping("/test")
    public String test4(){
        ConcurrentMapCacheManager bean = (ConcurrentMapCacheManager)context.getBean(ConcurrentMapCacheManager.class);
        return null;
    }
}
