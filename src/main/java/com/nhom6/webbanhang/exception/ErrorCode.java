package com.nhom6.webbanhang.exception;

public enum ErrorCode {
    UNCATEGORIZED_EXCEPTION(9999,"uncategorized error"),
    KEY_INVALID(1001,"invalid message key"),
    USER_EXISTED(1002, "user already existed"),
    USERNAME_INVALID(1003, "username must be max 10 characters"),
    PASSWORD_INVALID(1004, "password must be aleast 6 characters"),
    EMAIL_INVALID(1005, "email must be a valid email address"),
    USER_NOT_EXISTED(1006, "user not existed"),
    UNAUTHENTICATED(1007, "unauthenticated"),
    ;

    private int code;
    private String message;

    ErrorCode(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}
