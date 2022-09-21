package com.hhm.test.util;

/**
 * @author hhmstart
 * @create 2022-09-13 18:44
 */
public class ReturnJson {

    private boolean flag;

    private String msg;

    public ReturnJson() {
    }

    public ReturnJson(String msg) {
        this.msg = msg;
    }

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
