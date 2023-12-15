package com.xh.example;

import org.springframework.stereotype.Component;

import javax.annotation.PreDestroy;

/**
 * @author H.Yang
 * @date 2023/12/15
 */
@Component
public class PreDestroyExample {

    @PreDestroy
    public void destroy() {
        // 在项目结束时执行的清理工作
        System.out.println("PreDestroyExample");
    }


}
