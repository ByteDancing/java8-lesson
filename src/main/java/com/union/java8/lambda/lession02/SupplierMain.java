package com.union.java8.lambda.lession02;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Supplier;

/**
 * description
 * 供给型接口示例
 *
 * @author Mr.Cheng
 * @date 2020/4/24
 */
public class SupplierMain {
    public static void main(String[] args) {
        List<Integer> integerList = supply(10, () -> (int) (Math.random() * 100));
        integerList.forEach(System.out::println);

    }

    private static List<Integer> supply(Integer num, Supplier<Integer> supplier) {
        List<Integer> resultList = new ArrayList<Integer>();
        for (int i = 0; i < num; i++) {
            resultList.add(supplier.get());
        }
        return resultList;

    }
}
