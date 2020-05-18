package com.study.dxbm.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.hibernate.validator.constraints.Length;

/**
 * @Author 古陵逝烟
 * @Date 2020/5/18 13:43
 * @Description
 * @Version V1.0
 **/
@ApiModel("用户添加 DTO")
public class UserAddDTO {
    @ApiModelProperty(value = "账号", required = true, example = "yudaoyuanma")
    @Length(min = 5, max = 16, message = "账号长度为 5-16 位")
    private String username;
    @ApiModelProperty(value = "密码", required = true, example = "nicai")
    private String password;

    public String getUsername() {
        return username;
    }

    public UserAddDTO setUsername(String username) {
        this.username = username;
        return this;
    }

    public String getPassword() {
        return password;
    }

    public UserAddDTO setPassword(String password) {
        this.password = password;
        return this;
    }
}
