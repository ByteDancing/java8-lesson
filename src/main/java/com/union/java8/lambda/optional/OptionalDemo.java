package com.union.java8.lambda.optional;

import java.util.Optional;
import java.util.Properties;
import java.util.function.Function;
import java.util.function.Predicate;

/**
 * description
 *
 * @author Mr.Cheng
 * @date 2020/4/25
 */
public class OptionalDemo {

    public static void main(String[] args) {

    }

    public int readPoint(Properties properties, String name) {
        String value = properties.getProperty(name);
        if (value != null) {
            try {
                int i = Integer.parseInt(value);
                if (i > 0) {
                    return i;
                }
            } catch (NumberFormatException e) {
                e.printStackTrace();
            }
        }
        return 0;

    }

    /**
     * Optional读取属性
     *
     * @param properties
     * @param name
     * @return
     */
    public int readPointByOptional(Properties properties, String name) {
        return Optional.ofNullable(properties.getProperty(name))
                .flatMap(OptionalDemo::parseInt)
                .filter(integer -> integer > 0)
                .orElse(0);

    }

    private static Optional<Integer> parseInt(String value) {
        try {
            return Optional.ofNullable(Integer.parseInt(value));
        } catch (NumberFormatException e) {
            return Optional.empty();
        }

    }
}
