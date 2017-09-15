package com.ddcx.designpattern.adapter;

/**
 * Created by liaosi on 2017/9/15.
 * 已经存在的接口，此（实现）类中本来有一个方法可以处理客户端的特殊请求
 */
public class Adaptee {

    public void dealSpecialReques() {
        System.out.println("处理客户端的特殊请求++++++++");
    }
}
