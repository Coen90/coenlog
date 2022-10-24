package com.coen.coenlog.exception;

public class BusinessException extends RuntimeException {

    public BusinessException(ErrorCode errorCode) {
        super(errorCode.getErrorMessage());
    }
}
