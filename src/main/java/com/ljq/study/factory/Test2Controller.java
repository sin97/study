//package com.ljq.study.factory;
//
//import org.springframework.web.bind.annotation.RestController;
//
//import java.util.HashMap;
//import java.util.List;
//import java.util.Map;
//
///**
// * @author lijq
// * @date 2020/10/17 9:38
// * @desc
// **/
//@RestController
//public class Test2Controller {
//
//    Map<String,IBrandFactory> map = new HashMap<>();
//    public Test2Controller(List<IBrandFactory>brandFactories){
//        brandFactories.forEach((k)->{
//            map.put(k.getSupportProductType(),k);
//        });
//    }
//
//}
