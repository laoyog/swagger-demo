package com.alibaba.bean;

public class Result<T> {

    private boolean isSuccess;
    private String code;
    private String msg;
    private T detail;

    public Result() {
    }


    public boolean isSuccess() {
        return isSuccess;
    }

    public void setSuccess(boolean success) {
        isSuccess = success;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getDetail() {
        return detail;
    }

    public void setDetail(T detail) {
        this.detail = detail;
    }

    public Result(boolean isSuccess, String code, String msg, T detail) {
        this.isSuccess = isSuccess;
        this.code = code;
        this.msg = msg;
        this.detail = detail;
    }
}
