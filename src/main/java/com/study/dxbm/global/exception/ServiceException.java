package com.study.dxbm.global.exception;

import lombok.Data;

/**
 * @Author 古陵逝烟
 * @Date 2020/5/16 11:20
 * @Description 系统服务异常
 * @Version V1.0
 **/
@Data
public class ServiceException extends RuntimeException{
    /**
     * 错误码
     */
    private final Integer code;

    public ServiceException(ServiceExceptionEnum serviceExceptionEnum) {
        // 使用父类的 message 字段
        super(serviceExceptionEnum.getMessage());
        // 设置错误码
        this.code = serviceExceptionEnum.getCode();
    }
}
