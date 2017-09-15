package com.ddcx.designpattern.adapter;

/**
 * Created by liaosi on 2017/9/15.
 * 适配器类。实现处理请求的目标接口
 */
public class Adapter implements Target {

    private Adaptee adaptee;

    public Adapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void dealRequest() {
        adaptee.dealSpecialReques();
    }
}
