package com.ljq.study.netty;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lijq
 * @date 2020/10/28 15:34
 * @desc
 **/
@RestController
@RequestMapping("/netty")
@Slf4j
public class NettyController {

    @Autowired
    private NettyServer nettyServer;

    @GetMapping("/address")
    public String getAddress() {
        log.info(nettyServer.getChannel().isOpen() + "");
        int i = 10/0;
        return nettyServer.getChannel().localAddress().toString();
    }

}



