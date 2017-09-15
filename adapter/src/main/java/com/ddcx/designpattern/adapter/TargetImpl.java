package com.ddcx.designpattern.adapter;

/**
 * Created by liaosi on 2017/9/15.
 */
public class TargetImpl implements Target {

    @Override
    public void dealRequest() {
        System.out.println("处理来自客户端的请求-------");
    }

}
