package com.ddcx.designpattern.adapter;

/**
 * Created by liaosi on 2017/9/15.
 * 客户端请求的目标接口
 */
public interface Target {

    /**
     * 此方法处理客户端的请求，由目标接口的实现类实现
     */
    public void dealRequest();
}
