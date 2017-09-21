package com.ddcx.designpattern.factory.abstractfactory;

/**
 * Created by liaosi on 2017/9/20.
 */
public class AbstractFactoryTest2 {

    public static void main(String[] args) throws Exception {
        ImprovedCarFactoryImpl improvedCarFactory = new ImprovedCarFactoryImpl();
        AudiCar audiCar = improvedCarFactory.createAudiCar(AudiBusinessCar.class);
        audiCar.info();
    }
}

interface ImprovedCarFactory {

    public abstract BenzCar createBenzCar(Class<? extends BenzCar> clazz) throws Exception ;
    public abstract BMWCar createBMWCar(Class<? extends BMWCar> clazz) throws Exception;
    public abstract AudiCar createAudiCar(Class<? extends AudiCar> clazz) throws Exception;

}

class ImprovedCarFactoryImpl implements ImprovedCarFactory {

    @Override
    public BenzCar createBenzCar(Class<? extends BenzCar> clazz) throws Exception {
        return (BenzCar)Class.forName(clazz.getName()).newInstance();
    }

    @Override
    public BMWCar createBMWCar(Class<? extends BMWCar> clazz) throws Exception {
        return (BMWCar)Class.forName(clazz.getName()).newInstance();
    }

    @Override
    public AudiCar createAudiCar(Class<? extends AudiCar> clazz) throws Exception {
        return (AudiCar)Class.forName(clazz.getName()).newInstance();
    }
}


