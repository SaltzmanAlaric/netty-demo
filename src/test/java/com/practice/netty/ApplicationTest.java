package com.practice.netty;

import com.practice.netty.client.NettyClient;
import com.practice.netty.server.NettyServer;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)
public class ApplicationTest {

    @Resource
    private NettyServer server;
    @Resource
    private NettyClient client;

    @Test
    public void send() throws Exception {
        //启动服务端
        server.start();
    }

    @Test
    public void receive() throws Exception {
        //启动netty客户端
        client.start();
    }

}
