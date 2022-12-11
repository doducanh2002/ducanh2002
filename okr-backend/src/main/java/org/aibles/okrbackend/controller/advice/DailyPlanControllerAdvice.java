package org.aibles.okrbackend.controller.advice;

import lombok.extern.slf4j.Slf4j;
import org.aibles.okrbackend.exception.common.DailyPlanServiceException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@Slf4j
@RestControllerAdvice
public class DailyPlanControllerAdvice {

    @ExceptionHandler(value = DailyPlanServiceException.class)
    public ResponseEntity<String> DailyPlanServiceExceptionHandle(DailyPlanServiceException e){
        return new ResponseEntity<>(
                e.getDailyPlanServiceError().getErrorMessage(),
                HttpStatus.valueOf(e.getDailyPlanServiceError().getErrorCode())
        );
    }
}
