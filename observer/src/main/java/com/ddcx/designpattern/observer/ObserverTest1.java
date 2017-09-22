package com.ddcx.designpattern.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by liaosi on 2017/9/22.
 */
public class ObserverTest1 {

    public static void main(String[] args) {
        Transporter transporter = new Transporter();
        transporter.addObserver(new Guard());
        transporter.addObserver(new Police());
        transporter.notifyObserver();
    }

}

/**
 * 抽象的观察者
 */
interface Observer {
    public void update();
}

class Guard implements Observer {

    @Override
    public void update() {
        System.out.println("保镖开始进行保卫工作...");
    }
}

class Police implements Observer {

    @Override
    public void update() {
        System.out.println("警察开始出动进行保卫工作...");
    }
}

/**
 * 抽象的被观察者
 */
interface Subject {

    public void addObserver(Observer observer);
    public void removeObserver(Observer observer);
    public void notifyObserver();

}

class Transporter implements Subject {

    private List<Observer> observerList;

    public Transporter() {
        this.observerList = new ArrayList<>();
    }

    @Override
    public void addObserver(Observer observer) {
        observerList.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        int i = observerList.indexOf(observer);
        if (i > 0) {
            observerList.remove(observer);
        }
    }

    @Override
    public void notifyObserver() {
        System.out.println("运输队出发了!!!");
        for (Observer observer : observerList) {
            observer.update();
        }
    }
}
