package com.lcl.subscribe;

/**
 * @ClassName: Observerable
 * @Description: 被观察者维护观察者的关系
 * @Author: lichenglong
 * @Date: 2019/4/2 16:51
 */
public interface Observerable {
       void addObserver(Observer a);
       void deleteObserver(Observer b);
       void notifyObserver();
}
