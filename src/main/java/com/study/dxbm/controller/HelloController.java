package com.study.dxbm.controller;

import com.study.dxbm.global.exception.ServiceException;
import com.study.dxbm.global.exception.ServiceExceptionEnum;
import com.study.dxbm.pojo.User;
import io.swagger.annotations.Api;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.Date;

/**
 * @Author 古陵逝烟
 * @Date 2020/5/14 9:27
 * @Description
 * @Version V1.0
 **/
@RestController
@Slf4j
@Api(hidden = true)
public class HelloController {
//    private Logger log = LoggerFactory.getLogger(HelloController.class);

    @RequestMapping("/hello")
    public String hello(){
        log.info("hello world....");
        return "world";
    }

    /**
     * description: 测试 fastJson
     * date: 2020/5/15 17:24 
     * author: 古陵逝烟 
     **/
    @RequestMapping("/user")
    public User user(){
        return User.builder()
                .name("zhangsan")
                .aget("18")
                .birthDay(new Date())
                .qqList(Arrays.asList("111","222"))
                .build();
    }

    /**
     * description: 测试非自定义异常
     * date: 2020/5/16 11:43
     * author: 古陵逝烟
     **/
    @RequestMapping("/exception1")
    public void exception1(){
        throw  new NullPointerException("空指针异常");
    }

    /**
     * description: 测试自定义异常
     * date: 2020/5/16 11:43
     * author: 古陵逝烟
     **/
    @RequestMapping("/exception2")
    public void exception2(){
        throw  new ServiceException(ServiceExceptionEnum.USER_NOT_FOUND);
    }
}
