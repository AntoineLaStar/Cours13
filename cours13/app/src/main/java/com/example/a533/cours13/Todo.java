package com.example.a533.cours13;

import java.util.Date;

public class Todo {
    Date dataAdded;
    String title;
    String description;

    public Todo(Date dataAdded, String title, String description) {
        this.dataAdded = dataAdded;
        this.title = title;
        this.description = description;
    }

    public Date getDataAdded() {
        return dataAdded;
    }

    public String getDescription() {
        return description;
    }

    public String getTitle() {
        return title;
    }

    public void setDataAdded(Date dataAdded) {
        this.dataAdded = dataAdded;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
