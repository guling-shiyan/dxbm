package com.study.dxbm.controller;

import com.study.dxbm.pojo.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.Arrays;
import java.util.Date;

/**
 * @Author 古陵逝烟
 * @Date 2020/5/18 17:30
 * @Description
 * @Version V1.0
 **/

@RestController
@RequestMapping("/valid")
public class ValidController {

    @RequestMapping("/add")
    public User user(@Valid User user){

        return User.builder()
                .name("zhangsan")
                .aget("18")
                .birthDay(new Date())
                .qqList(Arrays.asList("111","222"))
                .build();
    }
}
