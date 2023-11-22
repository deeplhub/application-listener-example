package com.xh.example.listener;

import org.springframework.boot.context.event.ApplicationStartingEvent;
import org.springframework.context.ApplicationListener;

/**
 * 启动开始的时候执行的事件
 *
 * @author H.Yang
 * @date 2023/8/30
 */
public class StartingExample implements ApplicationListener<ApplicationStartingEvent> {

    @Override
    public void onApplicationEvent(ApplicationStartingEvent applicationStartingEvent) {
        System.out.println("StartingExample");
    }
}
