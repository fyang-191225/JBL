package com.zz.jbl.result;

/**
 * @author zz
 * @version 1.0
 * @date 2020/1/18 20:55
 */
public enum  ResultCode {
    OK(200), ERROR(400);

    private int val;
    private ResultCode(int v) {
        val = v;
    }

    public int getVal() {
        return val;
    }

}
