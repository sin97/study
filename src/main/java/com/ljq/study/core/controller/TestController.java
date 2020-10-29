package com.ljq.study.core.controller;

import com.ljq.study.core.entity.User;
import lombok.SneakyThrows;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * @author lijq
 * @date 2020/9/8 10:37
 * @desc 测试
 **/
@RestController
public class TestController {


    @GetMapping("/test")
    @SneakyThrows
    public String test() {
        List<User> users =new ArrayList<>();
        for (int i = 0; i <1000; i++) {
            User user = new User();
            user.setAge(i);
            users.add(user);
        }
        TimeUnit.SECONDS.sleep(2);
        return "test";
    }

}
