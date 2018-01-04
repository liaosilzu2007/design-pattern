package com.lzumetal.designpattern.singleton;

/**
 * 类描述：懒汉式的双重校验锁方式
 * 实现了延迟加载，又解决了线程并发问题，同时还解决了执行效率问题。
 * volatile的一个语义是禁止指令重排序优化，也就保证了instance变量被赋值的时候对象已经是初始化过的
 *
 * 创建人：liaosi
 * 创建时间：2018年01月02日
 */
public class LazySingleton {

    private static volatile LazySingleton instance;

    private LazySingleton() {

    }

    private static LazySingleton getInstance() {
        if (instance == null) {
            synchronized (LazySingleton.class) {
                if (instance == null) {
                    instance = new LazySingleton();
                }
            }
        }
        return instance;
    }

}
