package com.lcl.subscribe;

import java.util.LinkedList;
import java.util.List;

/**
 * @ClassName: ObserverAbleImpl
 * @Description: 主要实现被观察者的功能
 * @Author: lichenglong
 * @Date: 2019/4/2 16:54
 */
public class ObserverAbleImpl implements Observerable {

    private List<Observer> list = new LinkedList<>();

    /**
     * 这里需要写某些服务端的方法，然后对观察者进行回调，demo主动调用下
     * @param a
     */

    @Override
    public void addObserver(Observer a) {
        list.add(a);
    }

    @Override
    public void deleteObserver(Observer b) {
        list.remove(b);
    }

    @Override
    public void notifyObserver() {
        for(Observer observer : list){
            //对于服务端而言，中间有一部分网络交互部分，需要将消息传递给客户端
            observer.doSomething();
        }
    }
}
