package com.sucq.demo.test;

import com.sucq.demo.bean.Item;

import java.util.ArrayList;

/**
 * 集合内元素的排序
 * 在以前我们若要为集合内的元素排序，就必须调用 sort 方法，传入比较器匿名内部类重写 compare 方法，我们现在可以使用 lambda 表达式来简化代码。
 */
public class Test8 {

    public static void main(String[] args) {
        ArrayList<Item> list = new ArrayList<>();
        list.add(new Item(13, "背心", 7.80));
        list.add(new Item(11, "半袖", 37.80));
        list.add(new Item(14, "风衣", 139.80));
        list.add(new Item(12, "秋裤", 55.33));

        /*
        list.sort(new Comparator<Item>() {
            @Override
            public int compare(Item o1, Item o2) {
                return o1.getId()  - o2.getId();
            }
        });
        */

        list.sort((o1, o2) -> o1.getId() - o2.getId());

        System.out.println(list);
    }

}
