package com.wit.unifesta.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;

@ControllerAdvice
@RestController
public class UnifestaExceptionHandler {

    // 애플리케이션에서 발생한 모든 예외를 받아서 HTML 메시지로 반환함.
    @ExceptionHandler(value = Exception.class)
    public String globalExceptionHandler(Exception e){
        return "<h1>" + e.getMessage() + "</h1>";
    }
}
