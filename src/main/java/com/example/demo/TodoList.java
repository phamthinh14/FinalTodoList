package com.example.demo;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class TodoList {
    //id, taskname, due date, priority
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @NotNull
    @Size(min = 3)
    private String taskName;

    @NotNull
    private String dueDate;

    @NotNull
    private int priority;

    public long getId() {
        return id;
    }

    public TodoList(@NotNull @Size(min = 3) String taskName, @NotNull String dueDate, @NotNull int priority) {
        this.taskName = taskName;
        this.dueDate = dueDate;
        this.priority = priority;
    }

    public TodoList() {
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public String getDueDate() {
        return dueDate;
    }

    public void setDueDate(String dueDate) {
        this.dueDate = dueDate;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }
}