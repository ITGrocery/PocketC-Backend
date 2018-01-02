package cn.itgrocery.pocketc.controller;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * @ author chenxl
 * @ date 2017/12/29 15:34
 * @ describe 统一异常处理
 */
@RestControllerAdvice
public class RestfulExceptionHandler {

    @ExceptionHandler(Exception.class)
    public String handleException(Exception exception){

        return "有异常喔！";
    }
}
