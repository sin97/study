package com.ljq.study.spring.factorybean;

import lombok.Data;
import org.springframework.beans.factory.FactoryBean;

/**
 * @author lijq
 * @date 2020/10/28 17:41
 * @desc
 **/
@Data
public class CarFactoryBean implements FactoryBean<Car> {
    private String carString;
    public CarFactoryBean(String carString) {
        this.carString = carString;
    }


    @Override
    public Car getObject() {
        String[] split = carString.split(",");
        Car car = new Car();
        car.setBrand(split[0]);
        car.setPrice(Integer.parseInt(split[1]));
        return car;
    }

    @Override
    public Class<?> getObjectType() {
        return Car.class;
    }

}
