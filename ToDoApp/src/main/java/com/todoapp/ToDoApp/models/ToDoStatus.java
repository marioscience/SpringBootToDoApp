package com.todoapp.ToDoApp.models;

public enum ToDoStatus {
    NOT_STARTED ("not started"),
    IN_PROGRESS ("in progress"),
    DONE ("done");

    private String status;

    ToDoStatus(String val) {
        this.status = val;
    }

    public String status() {
        return status;
    }
}
