package view;

import model.Subject;

import java.util.Scanner;

public enum  Menu {
    INSTANCE;

    private static final Scanner sc = new Scanner(System.in);

    public int type() {
        System.out.println("----------------TYPE--------------");
        System.out.println("1. STACK");
        System.out.println("2. SINGLE LINKED LIST");
        System.out.println("3. DOUBLY LINKED LIST");
        System.out.println("0. TO EXIT");

        return checkMissMach();
    }

    public int menu(int typeCase, int size) {
        switch (typeCase) {
            case 1 -> System.out.println("------------STACK MENU-----------");
            case 2 -> System.out.println("-----SINGLY LINKED LIST MENU-----");
            case 3 -> System.out.println("-----DOUBLY LINKED LIST MENU-----");
        }
        System.out.println("ACTIVE: " + size);
        System.out.println("1. TO ADD SUBJECT");
        System.out.println("2. TO UPDATE SUBJECT");
        System.out.println("3. TO REMOVE SUBJECT");
        System.out.println("4. TO SHOW LIST SUBJECT");
        System.out.println("0. TO BACK");

        return checkMissMach();
    }

    private int checkMissMach() {
        int temp;
        if (sc.hasNextInt()) {
            temp = sc.nextInt();
            sc.nextLine();
            return temp;
        } else {
            sc.nextLine();
            System.out.println("INCORRECT INOUT TYPE");
            return checkMissMach();
        }
    }

    public Subject subject() {
        String subId, subName, subAuthor;

        System.out.println("----------SUBJECT ITEMS-----------");
        System.out.println("SUBJECT ID: ");
        subId = sc.nextLine();

        System.out.println("SUBJECT NAME: ");
        subName = sc.nextLine();

        System.out.println("SUBJECT AUTHOR");
        subAuthor = sc.nextLine();

        return new Subject(subId, subName, subAuthor);
    }

    public int index(String action) {
        System.out.println("INDEX FOR " + action + ": ");
        return checkMissMach();
    }
}