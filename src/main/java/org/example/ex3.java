package org.example;

public class ex3 {
    public static void main(String[] args) {
        int[][] numbers={
                {12,34,43,56,76,89},
                {5,43,4,6,78,9,65,4},
                {34,54,34,54,665,56},
        };
        System.out.print("The even numbers are: ");

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                if(numbers[i][j]%2==0){

                    System.out.print(numbers[i][j] + " ");
                }
            }



        }
    }
}
