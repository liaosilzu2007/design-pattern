package com.lzumetal.designpattern.responsibilitychain;

// 抽象处理者（审批者类）
public abstract class Approver {

    protected Approver nextApprover;  //定义后继处理对象

    //设置后继者
    public void setNextApprover(Approver approver) {
        this.nextApprover = approver;
    }

    //抽象请求处理方法
    public abstract void processRequest(PurchaseRequest request);
}
