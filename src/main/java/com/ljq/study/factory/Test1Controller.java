//package com.ljq.study.factory;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.RestController;
//
//import java.util.List;
//
///**
// * @author lijq
// * @date 2020/10/16 17:47
// * @desc
// **/
//@RestController
//public class Test1Controller {
//
//    @Autowired
//    private List<IBrandFactory> brandFactorys;
//
////    @Autowired
////    private IBrandFactory brand;
//
//    public IBrandFactory get(String type) {
//        IBrandFactory brandFactory = null;
//
//        for (IBrandFactory tmpFactory : brandFactorys) {
//            if (tmpFactory.getSupportProductType().equals(type)) {
//                brandFactory = tmpFactory;
//                break;
//            }
//        }
//
//        return brandFactory;
//    }
//
//
//    @RequestMapping(value = "/qq", method = RequestMethod.GET)
//    ResponseEntity<Object> findBlockDataByBlockId() {
//        IBrandFactory bf = get("mobilePhone");
//        return new ResponseEntity<Object>(bf.product(), HttpStatus.OK);
//
//    }
//}
