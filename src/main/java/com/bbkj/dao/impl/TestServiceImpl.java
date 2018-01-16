package com.bbkj.dao.impl;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
public class TestServiceImpl {

    @Cacheable("bbb")
    public String test1(String n){
        String a="aaa";
        return  a;
    }
    @Cacheable("bbb")
    public String test2(Integer n){
        String a="bbb";
        return  a;
    }
    @Cacheable("ccc")
    public String test3(Integer n){
        String a="ccc";
        return  a;
    }
}
