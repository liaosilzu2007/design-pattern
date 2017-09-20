package com.ddcx.designpattern.factory.abstractfactory;


/**
 * Created by liaosi on 2017/9/19.
 */
public class AbstractFactoryTest {

    public static void main(String[] args) {

        /*
         * 制造汽车的过程很复杂，可能需要先制造它的组成部分，使用工厂模式可以将这些准备步骤隐藏起来，
         * 我们只需要去调用制造汽车的方法来制造汽车就行。
         */
        BenzCarFactory benzCarFactory = new BenzCarFactory();
        Car car = benzCarFactory.createCar();
        car.getProduceInfo();

        System.out.println("-------------------");

        BMWCarFactory bmwCarFactory = new BMWCarFactory();
        Car car1 = bmwCarFactory.createCar();
        car1.getProduceInfo();
    }
}

interface CarFactory {

    public abstract Car createCar();
}

class BenzCarFactory implements CarFactory {


    @Override
    public Car createCar() {
        Engine engine = new Engine();
        Light light = new Light();
        Conditioner conditioner = new Conditioner();
        return new Benz(engine, light, conditioner);
    }
}

class BMWCarFactory implements CarFactory {


    @Override
    public Car createCar() {
        Engine engine = new Engine();
        Light light = new Light();
        Conditioner conditioner = new Conditioner();
        return new BMW(engine, light, conditioner);
    }
}

abstract class Car {

    private Engine engine;
    private Light light;
    private Conditioner conditioner;

    public Car(Engine engine, Light light, Conditioner conditioner) {
        this.engine = engine;
        this.light = light;
        this.conditioner = conditioner;
    }

    protected abstract void getProduceInfo();

}

class Benz extends Car {

    public Benz(Engine engine, Light light, Conditioner conditioner) {
        super(engine, light, conditioner);
    }

    @Override
    protected void getProduceInfo() {
        System.out.println("制造了一辆Benz汽车");
    }
}


class BMW extends Car {

    public BMW(Engine engine, Light light, Conditioner conditioner) {
        super(engine, light, conditioner);
    }

    @Override
    protected void getProduceInfo() {
        System.out.println("制造了一辆BMW汽车");
    }
}

/**
 * 汽车引擎系统
 */
class Engine {

}

/**
 * 汽车灯光系统
 */
class Light {

}

/**
 * 汽车空调系统
 */
class Conditioner {

}

