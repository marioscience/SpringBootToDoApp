package com.todoapp.ToDoApp.models;

import org.springframework.data.annotation.Id;

public class TaskType {
    @Id private String id;

    private String environment;
    private String name;
    private String importance;

    public TaskType(String name, String environment) {
        this.name = name;
        this.environment = environment;
        this.importance = "normal";
    }

    public TaskType() {

    }

    private String getImportance() {
        return importance;
    }

    private void setImportance(String importance) {
        importance = importance.toLowerCase();

        if (importance.equals("high") || importance.equals("normal") || importance.equals("low")) {
            this.importance = importance;
        } else {
            this.importance = "normal";
        }

    }

    public String getEnvironment() {
        return environment;
    }

    public void setEnvironment(String environment) {
        this.environment = environment;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
