package com.union.java8.lambda.lession01;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

/**
 * description
 *
 * @author Mr.Cheng
 * @date 2020/4/23
 */
public class ProjectMain {

    /**
     * 过滤java项目
     *
     * @param projects
     * @return
     */
    public static List<Project> filterJavaProject(List<Project> projects) {
        List<Project> result = new ArrayList<>();
        for (Project project : projects) {
            if ("java".equals(project.getLanguage())) {
                result.add(project);
            }
        }
        return result;
    }

    /**
     * 按照编程语言过滤
     *
     * @param projects
     * @param language
     * @return
     */
    private static List<Project> filterLanguageProjects(List<Project> projects, String language) {
        List<Project> result = new ArrayList<>();
        for (Project project : projects) {
            if (language.equals(project.getLanguage())) {
                result.add(project);
            }
        }
        return result;
    }

    /**
     * 按照编程语言和star数量过滤
     *
     * @param projects
     * @param language
     * @return
     */
    private static List<Project> filterLanguageAndStarsProjects(List<Project> projects, String language, int start) {
        List<Project> result = new ArrayList<>();
        for (Project project : projects) {
            if (language.equals(project.getLanguage()) && start <= project.getStar()) {
                result.add(project);
            }
        }
        return result;
    }


    /**
     * 按照谓词条件过滤
     *
     * @param projects
     * @param projectPredicate
     * @return
     */
    private static List<Project> filterProjects(List<Project> projects, ProjectPredicate projectPredicate) {
        List<Project> result = new ArrayList<>();
        for (Project project : projects) {
            if (projectPredicate.test(project)) {
                result.add(project);
            }
        }
        return result;
    }


    /**
     * 最后的简洁化
     *
     * @param list
     * @param predicate
     * @param <T>
     * @return
     */
    private static <T> List<T> filter(List<T> list, Predicate<T> predicate) {
        List<T> result = new ArrayList<>();
        for (T t : list) {
            if (predicate.test(t)) {
                result.add(t);
            }
        }
        return result;
    }

    public static void main(String[] args) {

        List<Project> data = new ArrayList<>();
        data.add(Project.builder().name("java-demo").language("java").author("Gao")
                .description("java8 is good").star(1000).build());
        data.add(Project.builder().name("vue").language("js").author("js.author")
                .description("vue is good").star(233).build());
        data.add(Project.builder().name("docker").language("go").author("Gao")
                .description("gogogogoo").star(1000).build());
        data.add(Project.builder().name("learn").language("python").author("pa")
                .description("java8 is good").star(3000).build());
        data.add(Project.builder().name("hadoop").language("scala").author("dashen")
                .description("hhahh").star(1000).build());
        data.add(Project.builder().name("QQ").language("c++").author("c+++++")
                .description("QQ is not good ").star(10030).build());

        List<Project> javaProject = filterJavaProject(data);
        List<Project> scala = filterLanguageProjects(data, "scala");
        List<Project> python = filterLanguageAndStarsProjects(data, "python", 100);

        /*开启java8模式*/
        List<Project> java = filterProjects(data, new ProjectLanguagePredicate("java"));
        List<Project> startList = filterProjects(data, new ProjectStarPredicate(100));

        /*java8函数式子-行为参数化的表达式*/
        List<Project> projectList = filter(data, project -> project.getStar() > 1000);
        List<Project> java1 = filter(data, project -> project.getLanguage().equals("java"));

        /*java8 排序*/
        data.sort((o1, o2) -> o1.getStar() - o2.getStar());

        data.sort(Comparator.comparing(Project::getStar));


        System.out.println(data);


    }
}
