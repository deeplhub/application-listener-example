package com.xh.example.listener;

import org.springframework.boot.context.event.ApplicationContextInitializedEvent;
import org.springframework.context.ApplicationListener;

/**
 * 上下文初始化的时候执行的事件
 *
 * @author H.Yang
 * @date 2023/8/30
 */
public class ContextInitializedExample implements ApplicationListener<ApplicationContextInitializedEvent> {
    @Override
    public void onApplicationEvent(ApplicationContextInitializedEvent applicationContextInitializedEvent) {
        System.out.println("ContextInitializedExample");
    }
}
