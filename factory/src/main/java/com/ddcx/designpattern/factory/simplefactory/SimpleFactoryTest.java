package com.ddcx.designpattern.factory.simplefactory;

/**
 * Created by liaosi on 2017/9/19.
 */
public class SimpleFactoryTest {

    public static void main(String[] args) {
        Car car = CarFactory.createCar("Benz");
        car.getProduceInfo();
    }
}

abstract class Car {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    protected abstract void getProduceInfo();

}

class Benz extends Car {

    @Override
    protected void getProduceInfo() {
        System.out.println("制造了一辆Benz汽车");
    }
}


class BMW extends Car {

    @Override
    protected void getProduceInfo() {
        System.out.println("制造了一辆BMW汽车");
    }
}

class CarFactory {

    //简单工厂模式：一个具体工厂类，工厂方法为静态方法
    public static Car createCar(String carName) {

        Car car = null;
        if ("Benz".equalsIgnoreCase(carName)) {
            car = new Benz();
        } else if ("BMW".equalsIgnoreCase(carName)) {
            car = new BMW();
        }
        return car;
    }

}
