package com.union.java8.lambda.lession01;

/**
 * description
 *
 * @author Mr.Cheng
 * @date 2020/4/23
 */
public class ProjectLanguagePredicate implements ProjectPredicate {

    private String language;

    public ProjectLanguagePredicate(String language) {
        this.language = language;
    }

    @Override
    public boolean test(Project project) {
        return language.equals(project.getLanguage());
    }
}
