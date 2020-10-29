package com.ljq.study;

import com.ljq.study.spring.factorybean.CarFactoryBean;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class StudyApplication {

    public static void main(String[] args) {
        SpringApplication.run(StudyApplication.class, args);
    }

    @Bean(name = "car")
    public CarFactoryBean carFactoryBean(){
        return new CarFactoryBean("1,1");
    }
}
