package com.example.twotablesprv4.advice;

import com.example.twotablesprv4.exeption.UserNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.HashMap;
import java.util.Map;

//Trình xử lý ngoại lệ ứng dụng
@RestControllerAdvice
@ResponseStatus(HttpStatus.BAD_REQUEST)
public class ApplicationExceptionHandler {
//Bạn có thể định nghĩa các method
// xử lý lỗi bằng cách thêm annotation
// @ExceptionHandler trước method đó để chỉ dẫn
// rằng method đó sẽ xử lý cho exception nào
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public Map<String, String> handlerValidArgument(MethodArgumentNotValidException ex){
        Map<String, String> errorMap = new HashMap<>();
        ex.getBindingResult().getFieldErrors().forEach(error ->{
            errorMap.put(error.getField(), error.getDefaultMessage());
        });
        return errorMap;
    }

    @ExceptionHandler(UserNotFoundException.class)
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR) //Lỗi máy chủ nội bộ
    public Map<String, String> handlerBusinessException(UserNotFoundException ex){
        Map<String, String> errorMap = new HashMap<>();
        errorMap.put("errorMessage", ex.getMessage());
        return errorMap;
    }
}
