package com.union.java8.lambda.lesson3;

import java.util.UUID;
import java.util.function.Supplier;

/**
 * description
 * 构造器引用
 *
 * @author Mr.Cheng
 * @date 2020/4/25
 */
public class ConstructorReference {

    public ConstructorReference() {
        System.out.println(UUID.randomUUID().toString());
    }

    public static void main(String[] args) {
        Supplier<ConstructorReference> referenceSupplier = ConstructorReference::new;
        referenceSupplier.get();
    }
}
