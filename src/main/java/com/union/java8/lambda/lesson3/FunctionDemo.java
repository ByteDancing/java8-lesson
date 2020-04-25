package com.union.java8.lambda.lesson3;

import java.util.UUID;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

/**
 * description
 * 函数式接口示例
 *
 * @author Mr.Cheng
 * @date 2020/4/25
 */
public class FunctionDemo {
    public static void main(String[] args) {

    }


    /**
     * 断言
     */
    public void predicate() {
        Predicate<String> stringPredicate = name -> name.startsWith("java");
        boolean test = stringPredicate.test("hello Java");
    }

    /**
     * 消费型
     */
    public void consumer() {
        Consumer<String> stringConsumer = messge -> System.out.println(messge);
        stringConsumer.accept("learn Java8");
    }

    /**
     * 转换
     */
    private void function() {
        Function<String, String> function = s -> s.toUpperCase();
        function.apply("java is best language");
    }

    /**
     * 供给型
     */
    private void supply() {
        Supplier<String> supplier = () -> UUID.randomUUID().toString();
        System.out.println(supplier.get());
    }
}
