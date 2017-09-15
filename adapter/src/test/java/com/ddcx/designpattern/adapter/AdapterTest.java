package com.ddcx.designpattern.adapter;

/**
 * Created by liaosi on 2017/9/15.
 */
public class AdapterTest {

    public static void main(String[] args) {
        Target target = previousDealWay();
       // Target target = currentDealWay();
        target.dealRequest();
    }

    public static Target previousDealWay() {
        Target target = new TargetImpl();
        return target;
    }

    public static Target currentDealWay() {
        Adaptee adaptee = new Adaptee();
        Target target = new Adapter(adaptee);
        return target;
    }
}
