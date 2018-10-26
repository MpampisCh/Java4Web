package com.company;


// Calculate the sum of 1 + 1/2 + 1/3 + ... + 1/100


public class Ex3 {

    public static void main(String[] args) {

        double sum =0;
        for (int i=1; i<=100; i++){
            sum +=  1/(double) i;
        }

        System.out.println("The sum is : " + sum);
    }
}
