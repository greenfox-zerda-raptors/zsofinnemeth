package com.greenfox.zsofinemeth.todo;

/**
 * Created by false on 2016. 11. 17..
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

//    public String isComplete() {
//        // condiitional expression:
//        return isComplete ? "Completed task" : "Uncompleted task";
//    }
//    public String hasDescription() {
//        // condiitional expression:
//        return hasDescription ? "Has description" : "No description";
//    }

}
