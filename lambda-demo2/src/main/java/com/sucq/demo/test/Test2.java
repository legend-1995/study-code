package com.sucq.demo.test;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Java 8 方法引用
 * 方法引用通过方法的名字来指向一个方法。
 * 方法引用可以使语言的构造更紧凑简洁，减少冗余代码。
 * 方法引用使用一对冒号 :: 。
 */
public class Test2 {

    @Test
    public void test1() {
        //构造器引用：它的语法是Class::new，或者更一般的Class< T >::new实例如下：
        Test2 t = Test2.create(Test2::new);
        Test2 t1 = Test2.create(Test2::new);
        Test2 t2 = Test2.create(Test2::new);
        Test2 t3 = new Test2();
        List<Test2> cars = Arrays.asList(t, t1, t2, t3);
        cars.forEach(System.out::println);
        System.out.println("===================构造器引用========================");
        //静态方法引用：它的语法是Class::static_method，实例如下：
        cars.forEach(Test2::collide);
        System.out.println("===================静态方法引用========================");
        //特定类的任意对象的方法引用：它的语法是Class::method实例如下：
        cars.forEach(Test2::repair);
        System.out.println("==============特定类的任意对象的方法引用================");
        //特定对象的方法引用：它的语法是instance::method实例如下：
        final Test2 police = Test2.create(Test2::new);
        cars.forEach(police::follow);
        System.out.println("===================特定对象的方法引用===================");
    }

    @Test
    public void test2(){
        List names = new ArrayList();
        names.add("Google");
        names.add("Runoob");
        names.add("Taobao");
        names.add("Baidu");
        names.add("Sina");
        names.forEach(System.out::println);
    }

    @FunctionalInterface
    public interface Supplier<T> {
        T get();
    }

    //Supplier是jdk1.8的接口，这里和lamda一起使用了
    public static Test2 create(final Supplier<Test2> supplier) {
        return supplier.get();
    }

    public static void collide(final Test2 car) {
        System.out.println("Collided " + car.toString());
    }

    public void follow(final Test2 another) {
        System.out.println("Following the " + another.toString());
    }

    public void repair() {
        System.out.println("Repaired " + this.toString());
    }

}
