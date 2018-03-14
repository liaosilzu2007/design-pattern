package com.lzumetal.designpattern.responsibilitychain;

/**
 * 采购单处理类
 * 此种方式存在的问题：
 *      1.PurchaseRequestHandler 类较为庞大，各个级别的审批方法都集中在一个类中，违反了“单一职责原则”，测试和维护难度大；
 *      2.当需要增加一个新的审批级别或调整任何一级的审批金额和审批细节（例如将董事长的审批额度改为 60 万元）时，都必须修改源代码并进行严格测试；
 *        此外，如果需要移除某一级别（例如金额为 10 万元及以上的采购单直接由董事长审批，不再设副董事长一职）时也必须对源代码进行修改，违反了“开闭原则”；
 *      3.审批流程的设置缺乏灵活性，现在的审批流程是“主任–>副董事长–>董事长–>董事会”，
 *        如果需要改为“主任–>董事长–>董事会”，在此方案中只能通过修改源代码来实现，客户端无法定制审批流程。
 *
 */
public class PurchaseRequestHandler {


    //递交采购单给主任
    public void handlePurchaseRequest(PurchaseRequest request) {
        if (request.getAmount() < 50000) {
            //由主任审批该采购单
            this.handleByDirector(request);
        }
        else if (request.getAmount() < 100000) {
            //由副董事长审批该采购单
            this.handleByVicePresident(request);
        }
        else if (request.getAmount() < 500000) {
            //由董事长审批该采购单
            this.handleByPresident(request);
        }
        else {
            //由董事会审批该采购单
            this.handleByCongress(request);
        }
    }

    //主任审批采购单
    public void handleByDirector(PurchaseRequest request) {
        //...
    }

    //副董事长审批采购单
    public void handleByVicePresident(PurchaseRequest request) {
        //...
    }

    //董事长审批采购单
    public void handleByPresident(PurchaseRequest request) {
        //...
    }

    //董事会审批采购单
    public void handleByCongress(PurchaseRequest request) {
        //...
    }

}
