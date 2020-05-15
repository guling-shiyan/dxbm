package com.study.dxbm.handler;

import com.alibaba.fastjson.JSON;
import com.study.dxbm.global.CommonResult;
import org.springframework.core.MethodParameter;
import org.springframework.http.MediaType;
import org.springframework.http.server.ServerHttpRequest;
import org.springframework.http.server.ServerHttpResponse;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseBodyAdvice;

/**
 * @Author 古陵逝烟
 * @Date 2020/5/14 16:43
 * @Description 只拦截 Controller 所在包，避免其它类似 swagger 提供的 API 被切面拦截
 * @Version V1.0
 **/
@ControllerAdvice(basePackages = "com.study.dxbm.controller")
public class GlobalResponseBodyHandler implements ResponseBodyAdvice <Object> {
    @Override
    public boolean supports(MethodParameter methodParameter, Class aClass) {
        return true;//true表示拦截 Controller 所有 API 接口的返回结果。
    }

    @Override
    public Object beforeBodyWrite(Object body, MethodParameter methodParameter, MediaType mediaType, Class aClass, ServerHttpRequest serverHttpRequest, ServerHttpResponse serverHttpResponse) {
        // 如果已经是 CommonResult 类型，则直接返回
        if (body instanceof CommonResult) {
            return body;
        }
        //若controller返回的是String，则这里需要单独处理
        if(body instanceof String){
            return JSON.toJSONString(CommonResult.success(body));
        }
        // 如果不是，则包装成 CommonResult 类型
        return CommonResult.success(body);
    }
}
