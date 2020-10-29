package com.ljq.study.config.yml;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author lijq
 * @date 2020/10/28 15:30
 * @desc
 **/
@Data
@Component
@ConfigurationProperties(prefix = "netty")
public class NettyConfigProperties {
    private String host;
    private Integer port;
}
