package com.house.sell.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by fengli on 2018/4/26.
 * springboot的异常处理器定义
 */
@ControllerAdvice
@Slf4j
public class ErrorHandler {
    //异常处理器在什么场景下触发，即遇到哪些异常时触发这个类
    @ExceptionHandler(value = {Exception.class,RuntimeException.class})
    public String error500(HttpServletRequest request,Exception e){
        log.error(e.getMessage(),e);
        log.error(request.getRequestURL()+"encouter 500");
        return "error/500";

    }
}
