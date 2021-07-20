package com.L4G.echo.server.impl;

import com.alibaba.dubbo.rpc.RpcContext;
import com.L4G.echo.api.echoService;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Author Yang Dashu
 * @Email waryangfang@gmail.com
 * @Date 2021/7/19 10:51 下午
 * @Description
 */
public class echoServiceImpl implements echoService {

    @Override
    public String echo(String message) {
        String now = new SimpleDateFormat("HH:mm:ss").format(new Date());
        System.out.println("[" + now + "] Hello, request from " + RpcContext.getContext().getRemoteAddress());
        return message;
    }
}
