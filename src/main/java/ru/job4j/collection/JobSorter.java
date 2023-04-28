package ru.job4j.collection;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @author sveet
 * @date 27.04.2023
 */
public class JobSorter {

    public static void main(String[] args) {
        List<Job> jobList = Arrays.asList(
                new Job("Fix bug", 1),
                new Job("Fix bug", 4),
                new Job("Fix bug", 2),
                new Job("X task", 0)
        );
        Collections.sort(jobList, new JobDescByName().thenComparing(new JobDescByPriority()));
        System.out.println(jobList);
        Comparator<Job> comb = new JobDescByNameLn()
                .thenComparing(new JobDescByName())
                .thenComparing(new JobDescByPriority());
        Collections.sort(jobList, comb);
    }
}
