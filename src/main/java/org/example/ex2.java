package org.example;

public class ex2 {
    public static void main(String[] args) {
        int[] numbers={12,34,55,65,3,45,67,43,33};
        int sum=0;
        for (int number:numbers) {
            sum+=number;

        }
        System.out.println("Sum of all stored numbers is " + sum );
    }
}
