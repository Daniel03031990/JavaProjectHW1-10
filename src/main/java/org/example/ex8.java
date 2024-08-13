package org.example;

public class ex8 {
    public static void main(String[] args) {
        int[] numbers = {90, 105, 45, 88, 100, 110, 98};
        int largest = numbers[0];
        int secondLargest = numbers[0];
        for (int n : numbers) {
            if (n > largest) {
                secondLargest = largest;
                largest = n;
            } else if (n > secondLargest && n != largest) {
                secondLargest = n;
            }
        }
        System.out.println("The second largest number is " + secondLargest);
        System.out.println("The largest number is " + largest);

    }


}