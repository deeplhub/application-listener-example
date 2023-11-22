package com.xh.example.listener;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;

/**
 * 上下文刷新
 *
 * @author H.Yang
 * @date 2023/8/30
 */
public class ContextRefreshedExample implements ApplicationListener<ContextRefreshedEvent> {
    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
        System.out.println("ContextRefreshedEvent");
    }
}
