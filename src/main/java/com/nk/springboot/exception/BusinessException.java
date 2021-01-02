package com.nk.springboot.exception;

/**
 * @ClassName BussinessException
 * @Description 自定义异常类
 * @Author 武永超
 * @Date 2021/1/1 17:25
 * Version 1.0
 **/
public class BusinessException extends RuntimeException{
    private static final long serialVersionUID = 1L;
    protected String message;
    @Override
    public String getMessage(){
        return message;
    }
    public BusinessException(String message){
        this.message = message;
    }
    public BusinessException(String message,Throwable throwable){
        super(message,throwable);
        this.message = message;
    }
}
