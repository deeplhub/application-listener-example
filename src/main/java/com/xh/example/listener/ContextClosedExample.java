package com.xh.example.listener;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextClosedEvent;

/**
 * 应用程序关闭时执行相应的操作
 *
 * @author H.Yang
 * @date 2023/8/30
 */
public class ContextClosedExample implements ApplicationListener<ContextClosedEvent> {
    @Override
    public void onApplicationEvent(ContextClosedEvent contextClosedEvent) {
        System.out.println("ContextClosedExample");
    }
}
