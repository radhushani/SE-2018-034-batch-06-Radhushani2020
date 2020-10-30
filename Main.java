package com.company;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("This program will generate the HailStone sequence. ");
        System.out.print("Enter a number: ");
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();

        while (num > 1) {
            if (num % 2 == 0) {
                num /= 2; //Dividing num by 2 if it is even
                System.out.print(num + "\t");
            } else {
                num = (num * 3) + 1;    // Adding num*3 + 1 to num if the num is odd
                System.out.print(num + "\t");
            }

        }

    }

}