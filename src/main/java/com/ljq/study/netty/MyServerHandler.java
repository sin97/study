package com.ljq.study.netty;

import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;
import io.netty.channel.socket.SocketChannel;
import lombok.extern.slf4j.Slf4j;

import java.text.SimpleDateFormat;
import java.util.Date;


/**
 * @author lijq
 * @date 2020/10/28 15:09
 * @desc
 **/
@Slf4j
public class MyServerHandler extends ChannelInboundHandlerAdapter {
    @Override
    public void channelRegistered(ChannelHandlerContext ctx) throws Exception {
        SocketChannel channel = (SocketChannel) ctx.channel();
        log.info("{}, {} 建立连接", channel.remoteAddress().getAddress(), channel.remoteAddress().getPort());
    }

    @Override
    public void channelActive(ChannelHandlerContext ctx) throws Exception {
        String str = "通知客户端建立连接成功 " + new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()) + "\r\n";
        ctx.writeAndFlush(str);
    }

    @Override
    public void channelInactive(ChannelHandlerContext ctx) throws Exception {
        log.info("客户端断开链接{}", ctx.channel().remoteAddress().toString());
    }


    @Override
    public void channelRead(ChannelHandlerContext ctx, Object msg) throws Exception {
        log.info(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()) + " 服务端收到消息 :" + msg);

        String s = "服务端收到 " + new Date() + " " + msg + "\r\n";
        ctx.writeAndFlush(s);
    }

    @Override
    public void channelReadComplete(ChannelHandlerContext ctx) throws Exception {
        //断开连接时也会走这个方法?????
        log.info("=====");
    }

    @Override
    public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) throws Exception {
        ctx.close();
        log.info("异常信息：\r\n" + cause.getMessage());
    }
}
