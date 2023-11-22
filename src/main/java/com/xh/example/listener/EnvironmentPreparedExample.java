package com.xh.example.listener;

import org.springframework.boot.context.event.ApplicationEnvironmentPreparedEvent;
import org.springframework.context.ApplicationListener;

/**
 * 上下文创建之前运行的事件
 *
 * @author H.Yang
 * @date 2023/8/30
 */
public class EnvironmentPreparedExample implements ApplicationListener<ApplicationEnvironmentPreparedEvent> {
    @Override
    public void onApplicationEvent(ApplicationEnvironmentPreparedEvent applicationEnvironmentPreparedEvent) {
        System.out.println("EnvironmentPreparedExample");
    }
}
