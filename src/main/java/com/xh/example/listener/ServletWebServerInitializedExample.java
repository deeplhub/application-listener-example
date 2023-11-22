package com.xh.example.listener;

import org.springframework.boot.web.servlet.context.ServletWebServerInitializedEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * @author H.Yang
 * @date 2023/8/30
 */
public class ServletWebServerInitializedExample implements ApplicationListener<ServletWebServerInitializedEvent> {
    @Override
    public void onApplicationEvent(ServletWebServerInitializedEvent servletWebServerInitializedEvent) {
        System.out.println("ServletWebServerInitializedEvent");
    }
}
