package com.todoapp.ToDoApp.models;

import java.util.Date;

public class ScheduledTask extends Task {
    private boolean isOverdue;
    private Date endDate;
    private Deadline deadline;

    public ScheduledTask(String title, String description, Date endDate) {
        super(title, description);
        this.endDate = endDate;
        this.deadline = new Deadline(endDate, 0);
    }

    public ScheduledTask(String title, String description, Date endDate, int remindBeforeMinutes) {
        super(title, description);
        this.endDate = endDate;
        this.deadline = new Deadline(endDate, remindBeforeMinutes);
    }

    public ScheduledTask() {
        super();
        //TODO: find out why default constructor is needed for repositories
    }

    public int getTaskDuration() {
        //throw new NotImplementedException();
        return 120; //calculate number of minutes from start to finish.
    }

    public boolean getIsOverdue() {
        return isOverdue;
    }

    public void setIsOverdue() {
        if (endDate.compareTo(new Date()) > 0) {
            isOverdue = true;
        }
    }

    public Deadline getDeadline() {
        return deadline;
    }

    public void setDeadline() {
        deadline = new Deadline(endDate, 0);
    }
    public void setDeadline(int reminder) {
        deadline = new Deadline(endDate, reminder);
    }
}
