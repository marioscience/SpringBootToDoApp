package com.todoapp.ToDoApp.models;

import java.util.Date;
import java.util.stream.Stream;

import org.springframework.data.annotation.Id;

public class Task {
    @Id private String id;

    private String title;
    private String description;
    private Date startDate;
    private double progress;
    private ToDoEntry[] todoList;
    private TaskType taskType;

    public Task(String title, String description) {
        this.title = title;
        this.description = description;
        startDate = new Date();
        progress = 0.0;
        taskType = new TaskType("Personal", "Home");
    }

    public Task(String title, String description, double progress, TaskType taskType) {
        this.title = title;
        this.description = description;
        startDate = new Date();
        this.progress = progress;
        this.taskType = taskType;
    }

    public Task() {
        this.title = "";
        this.description = "";
        startDate = new Date();
        progress = 0.0;
        taskType = new TaskType("Personal", "Home");
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String val) {
        title = val;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String val) {
        description = val;
    }

    private double getProgress() {
        return progress;
    }

    private void setProgress(double val) {
        if (val >= 0 && val <= 1) {
            progress = val;
        }
    }

    private void setTodoEntries(ToDoEntry[] todoEntries) {
        this.todoList = Stream.of(this.todoList, todoEntries).flatMap(Stream::of).toArray(ToDoEntry[]::new);
    }

    private ToDoEntry[] getTodoList() {
        return todoList;
    }
}
