package com.ljq.study.factory;

import org.springframework.beans.BeansException;
import org.springframework.beans.MutablePropertyValues;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.stereotype.Component;

/**
 * @author lijq
 * @date 2020/10/17 10:00
 * @desc
 **/
@Component
public class FactoryPostProcessor implements BeanFactoryPostProcessor {
    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory configurableListableBeanFactory) throws BeansException {
        String[] beanDefinitionNames = configurableListableBeanFactory.getBeanDefinitionNames();

        for (String beanDefinitionName : beanDefinitionNames) {
            if("computerProduct".equals(beanDefinitionName)){
                BeanDefinition beanDefinition = configurableListableBeanFactory.getBeanDefinition(beanDefinitionName);
                MutablePropertyValues propertyValues = beanDefinition.getPropertyValues();

                System.out.println(beanDefinition);
            }
        }

    }
}
