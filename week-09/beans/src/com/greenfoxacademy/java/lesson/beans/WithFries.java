package com.greenfoxacademy.java.lesson.beans;

public class WithFries {
    boolean flSalted;

    public WithFries(boolean flSalted) {
        this.flSalted = flSalted;
    }

    public WithFries() {
    }

    @Override
    public String toString() {
        return (flSalted? "Salted" : "Unassaulted");
    }

    public void toggleFlSalted() {
        this.flSalted = ! this.flSalted;
    }
}
