package com.todoapp.ToDoApp.models;

import java.util.stream.Stream;

import org.springframework.data.annotation.Id;

public class ToDoEntry {
    @Id private String id;

    private int priority;
    private String description;
    private ToDoStatus status;
    private Label[] labels;
    private Deadline deadline;

    private ToDoStatus getStatus() {
        return status;
    }

    private void setStatus(String status) {
        status = status.toLowerCase();

        if (status.equals(ToDoStatus.IN_PROGRESS) || status.equals(ToDoStatus.NOT_STARTED) || status.equals(ToDoStatus.DONE)) {
            this.status = ToDoStatus.valueOf(status);
        } else {
            this.status = ToDoStatus.NOT_STARTED;
        }

    }

    private void addLabels(Label[] labels) {
        this.labels = Stream.of(this.labels, labels).flatMap(Stream::of).toArray(Label[]::new);
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Deadline getDeadline() {
        return deadline;
    }

    public void setDeadline(Deadline deadline) {
        this.deadline = deadline;
    }
}
