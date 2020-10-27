package com.sucq.demo.test;

/**
 * 默认方法实例
 * 我们可以通过以下代码来了解关于默认方法的使用
 */
public class Test9 {

    public static void main(String[] args) {
        Vehicle vehicle = new Car();
        vehicle.print();
    }

}

interface Vehicle {
    default void print() {
        System.out.println("我是一辆车!");
    }

    static void blowHorn() {
        System.out.println("按喇叭!!!");
    }
}

interface FourWheeler {
    default void print() {
        System.out.println("我是一辆四轮车!");
    }
}

class Car implements Vehicle, FourWheeler {
    public void print() {
        Vehicle.super.print();
        FourWheeler.super.print();
        Vehicle.blowHorn();
        System.out.println("我是一辆汽车!");
    }
}
