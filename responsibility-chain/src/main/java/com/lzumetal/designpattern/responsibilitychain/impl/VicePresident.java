package com.lzumetal.designpattern.responsibilitychain.impl;

import com.lzumetal.designpattern.responsibilitychain.Approver;
import com.lzumetal.designpattern.responsibilitychain.PurchaseRequest;

//副董事长类：具体处理者
public class VicePresident extends Approver {

    //具体请求处理方法
    public void processRequest(PurchaseRequest request) {
        if (request.getAmount() < 100000) {
            System.out.println("副董事长" + "审批采购单：" + request.getNumber() + "，金额：" + request.getAmount() + "元，采购目的：" + request.getPurpose() + "。");  // 处理请求
        }else {
            this.nextApprover.processRequest(request);  // 转发请求
        }
    }
}