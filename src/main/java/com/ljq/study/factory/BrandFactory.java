package com.ljq.study.factory;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

/**
 * @author lijq
 * @date 2020/10/17 9:23
 * @desc
 **/
@Component
public class BrandFactory implements ApplicationContextAware {

    private static Map<String, IBrandFactory> map;

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {


        Map<String, IBrandFactory> beanMap = applicationContext.getBeansOfType(IBrandFactory.class);

        map = new HashMap<>();

        beanMap.forEach((k, v) -> {
            map.put(v.getSupportProductType(), v);
        });
    }

    public  static <T extends IBrandFactory> T getProduct(String key){

        return (T)map.get(key);
    }

}
