package com.ddcx.designpattern.decorator;

/**
 * Created by liaosi on 2017/9/15.
 * 装饰器类，是一个抽象类，具体要进行怎么样的装饰，要有它的子类去实现
 */
public abstract class ShapeDecorator implements Shape {

    //属性能被子类继承
    protected Shape shape;

    public ShapeDecorator(Shape shape) {
        this.shape = shape;
    }

    @Override
    public void draw() {
        shape.draw();
    }
}
