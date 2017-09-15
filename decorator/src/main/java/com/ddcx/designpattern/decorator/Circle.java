package com.ddcx.designpattern.decorator;

/**
 * Created by liaosi on 2017/9/15.
 */
public class Circle implements Shape {

    //调用此方法可以画出一个圆
    @Override
    public void draw() {
        System.out.println("draw circle");
    }
}
