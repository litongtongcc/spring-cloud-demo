package com.tong;

import org.springframework.stereotype.Component;

/**
 * Created by Tong on 2018/8/6.
 */
@Component
public class SchedualServiceHiHystric implements SchedualServiceHi{
    @Override
    public String sayHiFromClientOne(String name) {
        return "sorry "+name;
    }
}
