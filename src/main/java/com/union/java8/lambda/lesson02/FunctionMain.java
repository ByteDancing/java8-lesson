package com.union.java8.lambda.lesson02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

/**
 * description
 * 函数型接口示例-类型转换
 *
 * @author Mr.Cheng
 * @date 2020/4/24
 */
public class FunctionMain {

    public static void main(String[] args) {
        List<Integer> map = map(Arrays.asList("java8", "in", "action"), String::length);
        System.out.println(map);

    }


    /**
     * 类型转换
     *
     * @param list
     * @param function
     * @param <T>
     * @param <R>
     * @return
     */
    private static <T, R> List<R> map(List<T> list, Function<T, R> function) {
        List<R> result = new ArrayList<>();
        for (T t : list) {
            result.add(function.apply(t));
        }
        return result;
    }
}
