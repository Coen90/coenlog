package com.coen.coenlog.exception;

import lombok.Getter;

@Getter
public enum ErrorCode {

    // Post Error Code
    POST_NOT_EXIST(400, "찾으시는 포스트가 사라졌어요."),
    POSTS_NOT_EXIST(400, "포스트가 하나도 없어요.")
    ;

    // Member ErrorCode


    ErrorCode(int errorCode, String errorMessage) {
        this.errorCode = errorCode;
        this.errorMessage = errorMessage;
    }

    private int errorCode;
    private String errorMessage;

}
