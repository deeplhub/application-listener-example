package com.xh.example;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.stereotype.Component;

/**
 * @author H.Yang
 * @date 2023/12/15
 */
@Component
public class DisposableExample implements DisposableBean {

    @Override
    public void destroy() {
        // 在项目结束时执行的清理工作
        System.out.println("DisposableExample");
    }

}
