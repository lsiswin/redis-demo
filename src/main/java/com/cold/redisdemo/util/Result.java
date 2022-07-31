package com.cold.redisdemo.util;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Result {

    private Boolean success;

    private Integer code;

    private String msg;

    private Object data;

    public static Result error(ResultCode resultCode) {
        Result res = new Result();
        res.setCode(resultCode.getCode());
        res.setMsg(resultCode.getMessage());
        res.setSuccess(resultCode.getSuccess());
        return res;
    }

    public static Result success() {
        Result res = new Result();
        res.setCode(ResultCode.SUCCESS.getCode());
        res.setMsg(ResultCode.SUCCESS.getMessage());
        res.setSuccess(ResultCode.SUCCESS.getSuccess());
        return res;
    }

    public static Result error() {
        Result res = new Result();
        res.setSuccess(ResultCode.COMMON_FAIL.getSuccess());
        res.setMsg(ResultCode.COMMON_FAIL.getMessage());
        res.setCode(ResultCode.COMMON_FAIL.getCode());
        return res;
    }

    public Result success(Boolean success){
        this.setSuccess(success);
        return this;
    }
    public Result code(Integer code) {
        this.setCode(code);
        return this;
    }

    public Result msg(String msg) {
        this.setMsg(msg);
        return this;
    }

    public Result data(Object data) {
        this.setData(data);
        return this;
    }
}

