package com.ddcx.designpattern.decorator;

/**
 * Created by liaosi on 2017/9/15.
 */
public class Rectangle implements Shape {

    //调用此方法可以画出一个长方形
    @Override
    public void draw() {
        System.out.println("draw rectangle");
    }
}
