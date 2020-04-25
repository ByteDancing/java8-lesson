package com.union.java8.lambda.lesson3;

import com.union.java8.lambda.lesson01.Project;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * description
 * 方法引用
 * 指向静态方法的方法引用
 * 指向现有对象的实例方法的方法引用
 *
 * @author Mr.Cheng
 * @date 2020/4/24
 */
public class MethodReference {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 3, 5, 7, 9, 11, 23, 24, 36, 39);
        List<Integer> numbers = findNumbers(list, MethodReference::multipleOf3);

        Project grooy = Project.builder().name("grooy").build();
        long count = Arrays.asList(grooy).stream()
                .map(Project::getName)
                .count();

    }


    private static boolean multipleOf3(Integer integer) {
        return (integer % 3) == 0;
    }

    private static List<Integer> findNumbers(List<Integer> numbers, Predicate<Integer> predicate) {
        List<Integer> collect = numbers.stream().filter(new Predicate<Integer>() {
            @Override
            public boolean test(Integer integer) {
                return false;
            }
        }).collect(Collectors.toList());
        return collect;
    }

    public static void staticFunc() {

    }
}
