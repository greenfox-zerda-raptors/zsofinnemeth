package com.zsofintodo;

/**
 * Created by false on 2016. 11. 25..
 */
public class ToDoItem {
    private String title;
    private String descr;
    private boolean isComplete;
    private boolean hasDescription;

    public ToDoItem (String title) {
        this.title = title;
    }

    public ToDoItem (String title, String descr, boolean isComplete, boolean hasDescription) {
        this.title = title;
        this.descr = descr;
        this.isComplete = isComplete;
        this.hasDescription = hasDescription;

    }

    public String toString() {
        return this.title;
    }
}
