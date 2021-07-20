package com.L4G.echo.server;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author Yang Dashu
 * @Email waryangfang@gmail.com
 * @Date 2021/7/19 10:49 下午
 * @Description
 */
public class EchoProvider {

    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"echo-provider.xml"});
        context.start();

        System.in.read();
    }
}
