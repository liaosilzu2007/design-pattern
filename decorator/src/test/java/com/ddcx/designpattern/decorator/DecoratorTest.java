package com.ddcx.designpattern.decorator;

/**
 * Created by liaosi on 2017/9/15.
 */
public class DecoratorTest {

    public static void main(String[] args) {

        Shape circle = new Circle();
        circle.draw();

        System.out.println("------------------");

        RedShapeDecorator redCircleeDecorator = new RedShapeDecorator(circle);
        redCircleeDecorator.draw();

        System.out.println("------------------");

        RedShapeDecorator redRectangleDecorator = new RedShapeDecorator(new Rectangle());
        redRectangleDecorator.draw();
    }


}
