package com.union.java8.lambda.lesson3;

import javax.sound.midi.Soundbank;
import java.util.function.Function;

/**
 * description
 * 数组引用
 *
 * @author Mr.Cheng
 * @date 2020/4/24
 */
public class OtherReference {
    public static void main(String[] args) {
        Function<Integer, String[]> function = x -> new String[x];
        String[] apply = function.apply(10);
        System.out.println(apply.length);


        Function<Integer, String[]> function1 = String[]::new;
        String[] apply1 = function1.apply(10);
        System.out.println(apply1);
    }
}
