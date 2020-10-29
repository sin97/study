package com.ljq.study.core.advice;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * @author lijq
 * @date 2020/10/23 14:58
 * @desc
 **/
@RestControllerAdvice
public class ControllerAdviceT {

    @ExceptionHandler(value = ArithmeticException.class)
    public String x(){
        return "全局异常处理";
    }

}
