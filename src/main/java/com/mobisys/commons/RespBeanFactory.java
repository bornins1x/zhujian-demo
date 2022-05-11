package com.mobisys.commons;

/**
 * @author zf
 * @date 2022/5/11 2:01 PM
 * @description:
 */
public class RespBeanFactory {

    public static BaseRespBean succeed(Object data) {
        BaseRespBean baseBean = new BaseRespBean();
        baseBean.setCode(RespStateCode.CODE_SUCCEED.getCode());
        baseBean.setMsg(RespStateCode.CODE_SUCCEED.getMsg());
        baseBean.setData(data);
        return baseBean;
    }

    public static BaseRespBean error(int code, String msg) {
        BaseRespBean b = new BaseRespBean();
        b.setCode(code);
        b.setMsg(msg);
        return b;
    }


    public static BaseRespBean error(int code, String msg, Object data) {
        BaseRespBean b = new BaseRespBean();
        b.setCode(code);
        b.setMsg(msg);
        b.setData(data);
        return b;
    }
}
