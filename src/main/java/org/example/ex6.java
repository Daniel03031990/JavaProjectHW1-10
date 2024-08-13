package org.example;

import java.util.Scanner;

public class ex6 {
    public static void main(String[] args) {
        System.out.println("Enter a number: ");
        Scanner scanner=new Scanner(System.in);
        int number = scanner.nextInt();
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                System.out.println("The number is prime");
            } else {
                System.out.println("The number isn't prime");
            }


        }

    }
}
