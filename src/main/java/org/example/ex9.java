package org.example;

public class ex9 {
    public static void main(String[] args) {
        int[] numbers={22,12,3,54,7,65,78,7,65,43,3};

        int max=numbers[0];
        int min=numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if(numbers[i]>max){
                max=numbers[i];
            }
            if (numbers[i]<min){
                min=numbers[i];
            }

        }
        System.out.println("The largest number is " + max);
        System.out.println("The smallest number is " + min);








    }
}
