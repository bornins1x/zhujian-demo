package com.mobisys.commons;

/**
 * @author zf
 * @date 2022/5/11 1:53 PM
 * @description:
 */
public enum RespStateCode {

    INTERVAL_ERROR(500, "系统内部错误"),
    UNAUTHORIZED_ERROR(401, "token或apiKey无效"),
    BAD_REQUEST(400, "Bad Request"),
    CODE_SUCCEED(200, "OK");

    private Integer code;
    private String msg;

    RespStateCode(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public Integer getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }

    @Override
    public String toString() {
        return "ResultEnums{" +
                "code=" + code +
                ", msg='" + msg + '\'' +
                '}';
    }
}
