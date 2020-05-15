package com.study.dxbm.pojo;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Builder;
import lombok.Data;

import java.util.Date;
import java.util.List;

/**
 * @Author 古陵逝烟
 * @Date 2020/5/15 16:55
 * @Description
 * @Version V1.0
 **/
@Data
@Builder
public class User {

    private String name;
    private String aget;
    @JSONField(format = "yyyy年MM月dd日")
    private Date birthDay;
    private List<String> qqList;
}
