package com.study.dxbm.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * @Author 古陵逝烟
 * @Date 2020/5/18 13:46
 * @Description
 * @Version V1.0
 **/
@ApiModel("用户 VO")
public class UserVO {
    @ApiModelProperty(value = "用户编号", required = true, example = "1024")
    private Integer id;
    @ApiModelProperty(value = "账号", required = true, example = "yudaoyuanma")
    private String username;

    public Integer getId() {
        return id;
    }

    public UserVO setId(Integer id) {
        this.id = id;
        return this;
    }

    public String getUsername() {
        return username;
    }

    public UserVO setUsername(String username) {
        this.username = username;
        return this;
    }
}
