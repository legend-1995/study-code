package com.sucq.demo.test;

import com.sucq.demo.bean.Item;

import java.util.ArrayList;

/**
 * 删除集合中的某个元素
 * 我们通过public boolean removeIf(Predicate<? super E> filter)方法来删除集合中的某个元素，Predicate 也是 jdk 为我们提供的一个函数式接口，可以简化程序的编写。
 */
public class Test7 {

    public static void main(String[] args) {
        ArrayList<Item> items = new ArrayList<>();
        items.add(new Item(11, "小牙刷", 12.05 ));
        items.add(new Item(5, "日本马桶盖", 999.05 ));
        items.add(new Item(7, "格力空调", 888.88 ));
        items.add(new Item(17, "肥皂", 2.00 ));
        items.add(new Item(9, "冰箱", 4200.00 ));

        items.removeIf(ele -> ele.getId() == 7);

        //通过 foreach 遍历，查看是否已经删除
        items.forEach(System.out::println);

    }

}
