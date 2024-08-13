package org.example;

public class ex4 {
    public static void main(String[] args) {
        int[][] numbers={
                {23,22,4,5,6,8,9,0,8,8},
                {3,3,5,65,7,4,3,7,65,43,7},
                {2,3,1,4,6,78,9,54,12,13,17,}


        };
        int odd=0;
        int even =0;

        for(int[] row:numbers) {
            for (int n : row) {
                if (n % 2 == 0) {
                    even += n;
                } else {
                    odd += n;
                }

            }
        }
        System.out.println(even);
        System.out.println(odd);








    }
}
