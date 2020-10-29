package com.ljq.study.factory;

import lombok.Data;
import org.springframework.stereotype.Component;

/**
 * @author lijq
 * @date 2020/10/16 17:46
 * @desc
 **/
@Component
@Data
public class ComputerProduct implements IBrandFactory {

    private String name;

    public String getSupportProductType() {
        return "computer";
    }


    public String product() {
        return "我负责生产电脑";
    }

}
