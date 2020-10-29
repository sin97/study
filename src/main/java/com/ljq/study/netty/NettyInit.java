package com.ljq.study.netty;

import com.ljq.study.config.yml.NettyConfigProperties;
import io.netty.channel.ChannelFuture;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

import java.net.InetSocketAddress;

/**
 * @author lijq
 * @date 2020/10/28 15:27
 * @desc
 **/
@Component
@ComponentScan("com.ljq.study.netty")
public class NettyInit implements CommandLineRunner {

    @Autowired
    private NettyServer nettyServer;

    @Autowired
    private NettyConfigProperties properties;

    @Override
    public void run(String... args) {
        InetSocketAddress address = new InetSocketAddress(properties.getHost(), properties.getPort());
        ChannelFuture channelFuture = nettyServer.init(address);
        Runtime.getRuntime().addShutdownHook(new Thread(() -> nettyServer.destroy()));
        channelFuture.channel().closeFuture().syncUninterruptibly();
    }
}
