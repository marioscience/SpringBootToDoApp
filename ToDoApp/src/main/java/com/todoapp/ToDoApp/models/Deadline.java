package com.todoapp.ToDoApp.models;

import java.util.Date;

import org.springframework.data.annotation.Id;

public class Deadline {
    @Id private String id;

    private Date dueDate;
    private int remindBefore; //number of minutes to remind user

    public Deadline(Date date, int remindBefore) {
        dueDate = date;
        this.remindBefore = remindBefore;
    }

    public Deadline() {

    }

    public Date getDueDate() {
        return dueDate;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }

    public int getRemindBefore() {
        return remindBefore;
    }

    public void setRemindBefore(int remindBefore) {
        this.remindBefore = remindBefore;
    }
}
