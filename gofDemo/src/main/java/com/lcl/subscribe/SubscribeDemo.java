package com.lcl.subscribe;

/**
 * @ClassName: SubscribeDemo
 * @Description: 观察者对象demo
 * 草稿：发布订阅接口-对于设计模式来说，是观察者模式
 * 里面有两个对象，一个是观察者对象，客户端，负责等待被观察者的通知；主动调用（在redis里面，zk里面意味着长链接？）
 * 一个是被观察对象，服务端对象，负责主动通知，里面的事件变更，然后进行通知
 *
 * 涉及到俩对象：服务端维护客户端列表，客户端主动订阅，有消息变动时会通知客户端
 * 观察者模式和发布订阅模式的区别 :  观察者模式，当观察事件触发的时候，被观察者直接调用观察者方法
 *      发布订阅不一样，被观察者调用观察者的方法，交给调度中心（代理），由调度去处理。优势在于可以包装一些其他方法，比如加日志等
 *
 * @Author: lichenglong
 * @Date: 2019/4/2 16:31
 */
public class SubscribeDemo {

    public static void main(String[] args) {

        Observer observer = new Observer();
        observer.setName("aaa");
        Observer observer1 = new Observer();
        observer1.setName("bbb");

        Observerable observerable = new ObserverAbleImpl();
        observerable.addObserver(observer);
        observerable.addObserver(observer1);
        /**
         * 服务端执行完了某些方法后
         */
        observerable.notifyObserver();
        /**
         * 由失效机制来判定是否去掉观察者
         */
        observerable.deleteObserver(observer1);
    }


}
