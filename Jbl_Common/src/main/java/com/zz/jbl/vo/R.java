package com.zz.jbl.vo;

import com.zz.jbl.result.ResultCode;
import lombok.Data;

/**
 * @author zz
 * @version 1.0
 * @date 2020/1/18 20:55
 */

@Data
public class R {


    private int code;
    private String msg;
    private Object data;

    public static R setResult(boolean issucc, String data) {
        if(issucc) {
            return R.ok(data);
        } else {
            return R.fail(data);
        }
    }

    public static R setR(int code, String msg, Object data) {
        R r = new R();
        r.setCode(code);
        r.setMsg(msg);
        r.setData(data);
        return r;
    }

    public static R ok(Object data) {
        return setR(ResultCode.OK.getVal(), "OK", data);
    }

    public static R ok() {
        return setR(ResultCode.OK.getVal(), "OK", null);
    }

    public static R fail() {
        return setR(ResultCode.ERROR.getVal(), "ERROR", null);
    }


    public static R fail(String msg) {
        return setR(ResultCode.ERROR.getVal(), msg, null);
    }
}
