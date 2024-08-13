package org.example;

public class ex10 {
    public static void main(String[] args) {
        String[] names = {"Tom", "Jack", "Rob", "Dan", "Alex", "Tom", "Steven", "Michael", "Amanda", "Garry", "Steven", "Dan", "Bree"};

        System.out.println("Repeated names:");


        for (int i = 0; i < names.length; i++) {
            for (int j = 0; j < i; j++) {
                if(names[i].equals(names[j])){
                    System.out.println(names[i]);
                }

            }

        }





    }

}

