package com.union.java8.lambda.lession02;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

/**
 * description
 *  消费型接口示例
 * @author Mr.Cheng
 * @date 2020/4/24
 */
public class ConsumerMain {
    public static void main(String[] args) {

        List<Integer> integerList = Arrays.asList(1, 2, 12, 23, 22, 11, 89);
        foreach(integerList, new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) {
                System.out.println(integer);
            }
        });

    }


    private static <T> void foreach(List<T> list, Consumer<T> consumer) {
        for (T o : list) {
            consumer.accept(o);
        }
    }
}
