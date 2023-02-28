package ru.job4j.pojo;

import java.time.LocalDateTime;

/**
 * @author sveet
 * @date 28.02.2023
 */
public class Student {

    private String fullName;

    private String group;

    private LocalDateTime admission;

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public LocalDateTime getAdmission() {
        return admission;
    }

    public void setAdmission(LocalDateTime admission) {
        this.admission = admission;
    }
}
