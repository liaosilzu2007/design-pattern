package com.ddcx.designpattern.factory.abstractfactory;


/**
 * Created by liaosi on 2017/9/19.
 */
public class AbstractFactoryTest {

    public static void main(String[] args) {

        SportCarFactory sportCarFactory = new SportCarFactory();
        BMWCar bmwCar = sportCarFactory.createBMWCar();
        bmwCar.info();
    }
}

interface CarFactory {
    public abstract BenzCar createBenzCar();
    public abstract BMWCar createBMWCar();
    public abstract AudiCar createAudizCar();
}

class SportCarFactory implements CarFactory {

    @Override
    public BenzCar createBenzCar() {
        return new BenzSportCar();
    }

    @Override
    public BMWCar createBMWCar() {
        return new BMWSportCar();
    }

    @Override
    public AudiCar createAudizCar() {
        return new AudiSportCar();
    }
}

class BusinessCarFactory implements CarFactory {

    @Override
    public BenzCar createBenzCar() {
        return new BenzBusinessCar();
    }

    @Override
    public BMWCar createBMWCar() {
        return new BMWBusinessCar();
    }

    @Override
    public AudiCar createAudizCar() {
        return new AudiBusinessCar();
    }
}

interface Car {
    public abstract void info();
}

abstract class BenzCar implements Car {

}

abstract class BMWCar implements Car {

}

abstract class AudiCar implements Car {

}

class BenzSportCar extends BenzCar {

    @Override
    public void info() {
        System.out.println("这是一辆Benz跑车");
    }
}

class BenzBusinessCar extends BenzCar {

    @Override
    public void info() {
        System.out.println("这是一辆Beaz商务车");
    }
}

class BMWSportCar extends BMWCar {

    @Override
    public void info() {
        System.out.println("这是一辆BMW跑车");
    }
}

class BMWBusinessCar extends BMWCar {

    @Override
    public void info() {
        System.out.println("这是一辆BMW商务车");
    }
}

class AudiSportCar extends AudiCar {

    @Override
    public void info() {
        System.out.println("这是一辆Audi跑车");
    }
}

class AudiBusinessCar extends AudiCar {

    @Override
    public void info() {
        System.out.println("这是一辆Audi商务车");
    }
}

