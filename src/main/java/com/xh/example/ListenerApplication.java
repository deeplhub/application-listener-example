package com.xh.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author H.Yang
 * @date 2023/8/30
 */
@SpringBootApplication
public class ListenerApplication {
    public static void main(String[] args) {
        SpringApplication.run(ListenerApplication.class, args);
        System.out.println("启动成功");
    }
}
