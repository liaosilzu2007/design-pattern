package com.ddcx.designpattern.decorator;

/**
 * Created by liaosi on 2017/9/15.
 */
public class RedShapeDecorator extends ShapeDecorator {


    public RedShapeDecorator(Shape shape) {
        super(shape);
    }

    public void draw() {
        shape.draw();
        addRedBorder();
    }

    public void addRedBorder() {
        System.out.println("add border: RED");
    }
}
