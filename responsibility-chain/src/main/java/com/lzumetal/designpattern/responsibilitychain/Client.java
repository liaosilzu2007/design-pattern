package com.lzumetal.designpattern.responsibilitychain;

import com.lzumetal.designpattern.responsibilitychain.impl.Congress;
import com.lzumetal.designpattern.responsibilitychain.impl.Director;
import com.lzumetal.designpattern.responsibilitychain.impl.President;
import com.lzumetal.designpattern.responsibilitychain.impl.VicePresident;

public class Client {
    public static void main(String[] args) {
        Approver director,vicePresident,president,congress;
        director = new Director();
        vicePresident = new VicePresident();
        president = new President();
        congress = new Congress();

        //创建责任链
        director.setNextApprover(vicePresident);
        vicePresident.setNextApprover(president);
        president.setNextApprover(congress);

        //创建采购单，并从主任开始处理
        PurchaseRequest pr1 = new PurchaseRequest(45000,10001,"购买倚天剑");
        director.processRequest(pr1);

        PurchaseRequest pr2 = new PurchaseRequest(60000,10002,"购买《葵花宝典》");
        director.processRequest(pr2);

        PurchaseRequest pr3 = new PurchaseRequest(160000,10003,"购买《金刚经》");
        director.processRequest(pr3);

        PurchaseRequest pr4 = new PurchaseRequest(800000,10004,"购买桃花岛");
        director.processRequest(pr4);
    }
}
