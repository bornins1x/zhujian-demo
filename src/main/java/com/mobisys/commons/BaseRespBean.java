package com.mobisys.commons;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * @author zf
 * @date 2022/5/11 1:52 PM
 * @description:
 */
public class BaseRespBean {
    private int code; // 状态码
    private String msg; // 信息，如错误详情信息
    private Object data; // 返回的数据对象或者无对象时null

    public BaseRespBean() {
    }

    public BaseRespBean(int code, String msg, Object data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    @JsonIgnore
    public boolean isSuccess() {
        return code == RespStateCode.CODE_SUCCEED.getCode();
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

}
