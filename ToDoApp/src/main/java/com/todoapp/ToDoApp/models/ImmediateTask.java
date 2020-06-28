package com.todoapp.ToDoApp.models;

import java.util.Date;

public class ImmediateTask extends Task {
    private Date creationDate;

    public ImmediateTask(String title, String description) {
        super(title, description);
        this.creationDate = new Date();
    }

    public ImmediateTask() {
        super();
        //TODO: find out why default constructor is needed for repositories
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public int getTimeSinceCreation() {
        //throw new NotImplementedException();
        return 120;
    }
}
