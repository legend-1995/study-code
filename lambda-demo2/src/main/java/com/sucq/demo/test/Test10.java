package com.sucq.demo.test;

import org.junit.Test;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class Test10 {

    @Test
    public void test1(){
        List<String> strings = Arrays.asList("abc", "", "bc", "efg", "abcd", "", "jkl");
        List<String> filtered = strings.stream().filter(s -> !s.isEmpty()).collect(Collectors.toList());
        filtered.forEach(System.out::println);
    }

    @Test
    public void test2(){
        //Stream 提供了新的方法 'forEach' 来迭代流中的每个数据。以下代码片段使用forEach 输出了10个随机数：
        Random random = new Random();
        //limit 方法用于获取指定数量的流。以下代码片段使用 limit 方法打印出 10 条数据：
        //sorted 方法用于对流进行排序。以下代码片段使用 sorted 方法对输出的 10 个随机数进行排序：
        random.ints().limit(10).sorted().forEach(System.out::println);

    }

    @Test
    public void test3(){
        //map 方法用于映射每个元素到对应的结果，以下代码片段使用 map 输出了元素对应的平方数：
        List<Integer> numbers = Arrays.asList(3, 2, 2, 3, 7, 3, 5);
        // 获取对应的平方数
        //Collectors 类实现了很多归约操作，例如将流转换成集合和聚合元素。Collectors可用于返回列表或字符串：
        //distinct() 去重
        List<Integer> squaresList = numbers.stream().map(integer -> integer * integer).distinct().collect(Collectors.toList());
        squaresList.forEach(System.out::println);
    }

    @Test
    public void test4(){
        //filter 方法用于通过设置条件过滤出元素。以下代码片段使用filter 方法过滤出空字符串：
        List<String>strings = Arrays.asList("abc", "", "bc", "efg", "abcd","", "jkl");
        // 获取空字符串的数量
        int count = (int) strings.stream().filter(string -> string.isEmpty()).count();
        System.out.println(count);
    }

    @Test
    public void test5(){
        //parallelStream 是流并行处理程序的代替方法。以下实例我们使用parallelStream 来输出空字符串的数量：
        List<String>strings = Arrays.asList("abc", "", "bc", "efg", "abcd","", "jkl");
        // 获取空字符串的数量
        int count = (int) strings.parallelStream().filter(string -> string.isEmpty()).count();
        System.out.println(count);
    }

    @Test
    public void test6(){
        //统计：另外，一些产生统计结果的收集器也非常有用。它们主要用于int、double、long等基本类型上，它们可以用来产生类似如下的统计结果。
        List<Integer> numbers = Arrays.asList(3, 2, 2, 3, 7, 3, 5);
        IntSummaryStatistics stats = numbers.stream().mapToInt((x) -> x).summaryStatistics();
        System.out.println("列表中最大的数 : " + stats.getMax());
        System.out.println("列表中最小的数 : " + stats.getMin());
        System.out.println("所有数之和 : " + stats.getSum());
        System.out.println("平均数 : " + stats.getAverage());
    }

}
