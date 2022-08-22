package com.arpit24.restfulwebservices.helloworld;

public class HelloWorldBean {

    @Override
    public String toString() {
        return "HelloWorldBean{" +
                "msg='" + msg + '\'' +
                '}';
    }

    public String getMsg() {
        return msg;
    }

    private String msg;

    public HelloWorldBean(String text) {
        this.msg = text;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
