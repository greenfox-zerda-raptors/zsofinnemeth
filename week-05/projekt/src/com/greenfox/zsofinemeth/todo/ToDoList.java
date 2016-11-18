package com.greenfox.zsofinemeth.todo;


import java.io.*;
import java.util.Scanner;
import java.util.ArrayList;

/**
 * Created by false on 2016. 11. 17..
 */
public class ToDoList  {

    static ArrayList<ToDoItem> tdlist = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    public static void displayWelcome() {
        ToDoList list = new ToDoList();
        list.reloadItems();
        System.out.println("|||||||||||||||||||||||||||||||||||||\n");
        System.out.println("#####  The To-Do Task Manager  ######\n");
        System.out.println("###  Welcome to another busy day  ###\n");
        System.out.println("|||||||||||||||||||||||||||||||||||||\n");
        System.out.println("Options: ");
        System.out.println("RL: Reload your tasks");
        System.out.println("A: Add a to-do");
        System.out.println("S: Save items");
        System.out.println("L: List items");
        System.out.println("R: Remove an item");
        System.out.println("Q: Quit");

        Scanner scanner = new Scanner(System.in);


        boolean flLoop = true;
        while (flLoop) {
            System.out.println("Your command:");
            String input = scanner.nextLine();


            switch (input) {
                case "rl":
                    list.reloadItems();
                    break;
                case "a":
                    list.newItem();
                    break;
                case "s":
                    list.saveItems();
                    break;
                case "l":
                    list.listItems();
                    break;
                case "r":
                    list.removeItem();
                    break;
                case "q":
                    flLoop = false;
            }
        }
    }

    public void newItem() {
        System.out.println("Add to-do item");
        String input = scanner.nextLine();
        ToDoItem tditem = new ToDoItem(input);
        tdlist.add(tditem);
        }

    public void removeItem() {
        System.out.println("Remove this to-do:");
        int input = scanner.nextInt();
        tdlist.remove(tdlist.get(input-1));
    }

    public void listItems() {
        for (int i = 0; i < tdlist.size(); i++) {
//            System.out.println(i + 1 + " - " + tdlist.get(i));
            System.out.println(i + 1 + " - " + tdlist.get(i).toString());
        }
    }

    public void reloadItems() {
        tdlist.clear();
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader("tdlist.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        try {
            String line = br.readLine();
            while (line != null) {
                // reading the next line// reading the next line
                ToDoItem bufftditem = new ToDoItem(line);
                tdlist.add(bufftditem);
                line = br.readLine();
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public void saveItems() {
        BufferedWriter bw = null;
        try {
            bw = new BufferedWriter(new FileWriter("tdlist.txt"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            for (int i=0; i<tdlist.size(); i++) {
                bw.write(tdlist.get(i).toString());
                bw.newLine();
            }

            // close up and flush
            bw.flush();
            bw.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }


}



