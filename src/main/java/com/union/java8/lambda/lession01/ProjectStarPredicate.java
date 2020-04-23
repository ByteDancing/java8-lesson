package com.union.java8.lambda.lession01;

/**
 * description
 *
 * @author Mr.Cheng
 * @date 2020/4/23
 */
public class ProjectStarPredicate implements ProjectPredicate {

    private int star;

    public ProjectStarPredicate(int star) {
        this.star = star;
    }

    @Override
    public boolean test(Project project) {
        return project.getStar() > star;
    }
}
