package com.company;

import java.util.Scanner;

public class UserInput {
    Scanner scanner = new Scanner(System.in);

    public void get(){
        System.out.println("Please input a number: ");
        int num = scanner.nextInt();
        System.out.println("Completed!");

    }
}
