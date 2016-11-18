package com.greenfox.zsofinemeth.todo;
import java.util.InputMismatchException;

/**
 * Created by false on 2016. 11. 17..
 */
public class App {

    public static void main(String[] args) {
        try {
            ToDoList.displayWelcome();
        } catch (InputMismatchException e) {
            System.out.println("Sorry, invalid value");
        }

    }
}




