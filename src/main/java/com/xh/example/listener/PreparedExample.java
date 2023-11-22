package com.xh.example.listener;

import org.springframework.boot.context.event.ApplicationPreparedEvent;
import org.springframework.context.ApplicationListener;

/**
 * 上下文创建完成，注入的bean还没加载完成
 *
 * @author H.Yang
 * @date 2023/8/30
 */
public class PreparedExample implements ApplicationListener<ApplicationPreparedEvent> {
    @Override
    public void onApplicationEvent(ApplicationPreparedEvent applicationPreparedEvent) {
        System.out.println("PreparedExample");
    }
}
