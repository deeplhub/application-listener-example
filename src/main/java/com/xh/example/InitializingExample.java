package com.xh.example;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

/**
 * 初始化时执行
 *
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
