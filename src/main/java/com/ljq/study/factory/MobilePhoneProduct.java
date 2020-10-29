package com.ljq.study.factory;

import org.springframework.stereotype.Component;

/**
 * @author lijq
 * @date 2020/10/16 17:47
 * @desc
 **/
@Component
public class MobilePhoneProduct implements IBrandFactory {

    public String getSupportProductType() {
        return "mobilePhone";
    }

    public String product() {
        return "我负责生产手机";
    }

}
