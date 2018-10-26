package com.company;


// Calculate the sum of 1 + 2 + 3+ ... + 100


public class Ex1 {

    public static void main(String[] args) {

        int count=0;
        for (int i=0; i<=100; i++){
            count += i;
        }

        System.out.println("Sum is: " + count);

        int j=100;

        System.out.println("Gauss's method gives: " + (j+1)*j/2);

    }
}
