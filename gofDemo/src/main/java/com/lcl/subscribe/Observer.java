package com.lcl.subscribe;

/**
 * @ClassName: Observer
 * @Description:
 * @Author: lichenglong
 * @Date: 2019/4/2 16:52
 */
public class Observer {
    private String name;
    private String age;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    /**
     * 回调之后的方法
     */
    public void doSomething(){
        System.out.println(name+"收到被观察者的方法回调...");
    }
}
