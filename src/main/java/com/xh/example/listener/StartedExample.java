package com.xh.example.listener;

import org.springframework.boot.context.event.ApplicationStartedEvent;
import org.springframework.context.ApplicationListener;

/**
 * 应用程序启动事件
 *
 * @author H.Yang
 * @date 2023/8/30
 */
public class StartedExample implements ApplicationListener<ApplicationStartedEvent> {
    @Override
    public void onApplicationEvent(ApplicationStartedEvent applicationStartedEvent) {
        System.out.println("StartedExample");
    }
}
