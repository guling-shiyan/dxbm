package com.study.dxbm.global;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import org.springframework.util.Assert;

import java.io.Serializable;

/**
 * @Author 古陵逝烟
 * @Date 2020/5/14 16:36
 * @Description 统一返回
 * @Version V1.0
 **/
@Data
public class CommonResult <T> implements Serializable{

    public static Integer CODE_SUCCESS = 0;

    /**
     * 错误码
     */
    private Integer code;
    /**
     * 错误提示
     */
    private String message;
    /**
     * 返回数据
     */
    private T data;

    /**
     * 将传入的 result 对象，转换成另外一个泛型结果的对象
     */
    public static <T> CommonResult<T> error(CommonResult<?> result) {
        return error(result.getCode(), result.getMessage());
    }

    public static <T> CommonResult<T> error(Integer code, String message) {
        Assert.isTrue(!CODE_SUCCESS.equals(code), "code 必须是错误的！");
        CommonResult<T> result = new CommonResult<>();
        result.code = code;
        result.message = message;
        return result;
    }

    public static <T> CommonResult<T> success(T data) {
        CommonResult<T> result = new CommonResult<>();
        result.code = CODE_SUCCESS;
        result.data = data;
        result.message = "";
        return result;
    }

    @JsonIgnore // 忽略，避免 jackson 序列化给前端
    public boolean isSuccess() { // 方便判断是否成功
        return CODE_SUCCESS.equals(code);
    }

    @JsonIgnore // 忽略，避免 jackson 序列化给前端
    public boolean isError() { // 方便判断是否失败
        return !isSuccess();
    }
}
