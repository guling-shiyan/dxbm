package com.study.dxbm.lombok;

import lombok.Builder;
import lombok.Data;
import lombok.NonNull;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;

/**
 * @Author 古陵逝烟
 * @Date 2020/5/14 12:00
 * @Description
 * @Version V1.0
 **/
@Data
@Slf4j
@Builder
public class Person {

    private String name;
    private String age;

    public static void main(String[] args) {
        Person wangwu = Person.builder().name("wangwu")
                .age("19")
                .build();
        log.info("Person:{}",wangwu.toString());
        tryCatch("zhangsan","18");
    }

    @SneakyThrows
    public static void tryCatch(@NonNull String name, @NonNull String age) {

    }

}
