package com.sucq.demo.test;

/**
 * 多个默认方法
 * 一个接口有默认方法，考虑这样的情况，一个类实现了多个接口，且这些接口有相同的默认方法，以下实例说明了这种情况的解决方法
 * 第一个解决方案是创建自己的默认方法，来覆盖重写接口的默认方法：
 */
public class Test6 implements Test4, Test5 {
    @Override
    public void print() {
        System.out.println("a");
    }
}
