package com.xh.example;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

/**
 * @author H.Yang
 * @date 2023/8/30
 */
@Component
public class InitializingExample implements InitializingBean {
    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("InitializingExample");
    }
}
