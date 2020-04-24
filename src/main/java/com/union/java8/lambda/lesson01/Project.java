package com.union.java8.lambda.lesson01;

import lombok.Builder;
import lombok.Data;

/**
 * 工程
 * description
 *
 * @author Mr.Cheng
 * @date 2020/4/23
 */
@Data
@Builder
public class Project {
    private String name;
    private String language;
    private int star;
    private String description;
    private String author;
}
