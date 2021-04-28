package com.example.assesstmentq2;

import java.util.Scanner;

public class AssesstemntQ2 {
    public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
        System.out.println("Lower Limit : ");
        int input1 = keyboard.nextInt();
        System.out.println("Upper Limit : ");
        int input2 = keyboard.nextInt();
        System.out.print("Count : ");
        for (int num = input1; num < input2; num = num+1){
            System.out.print(num + " ");
        }

    }
}
