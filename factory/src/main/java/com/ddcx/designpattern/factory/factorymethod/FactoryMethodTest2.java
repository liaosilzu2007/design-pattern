package com.ddcx.designpattern.factory.factorymethod;

/**
 * Created by liaosi on 2017/9/20.
 */
public class FactoryMethodTest2 {

    public static void main(String[] args) {
        Object car = CarFactoryImpl.createCar(Benz.class);
        System.out.println(car);
        if (car != null && car instanceof Benz) {
            Benz benz = (Benz) car;
            benz.getProduceInfo();
        }
    }
}


class CarFactoryImpl{

    public static Object createCar(Class<? extends Car> clazz) {
        Object obj = null;
        try {
            obj = Class.forName(clazz.getName()).newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return obj;
    }
}