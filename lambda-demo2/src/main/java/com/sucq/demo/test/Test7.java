package com.sucq.demo.test;

/**
 * 第二种解决方案可以使用 super 来调用指定接口的默认方法：
 */
public class Test7 implements Test4, Test5 {
    @Override
    public void print() {
        Test4.super.print();
    }
}
