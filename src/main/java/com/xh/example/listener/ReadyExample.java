package com.xh.example.listener;

import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ApplicationListener;

/**
 * 启动成功的时候执行
 *
 * @author H.Yang
 * @date 2023/8/30
 */
public class ReadyExample implements ApplicationListener<ApplicationReadyEvent> {
    @Override
    public void onApplicationEvent(ApplicationReadyEvent applicationReadyEvent) {
        System.out.println("ReadyExample");
    }
}
