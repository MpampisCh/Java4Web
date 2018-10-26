package com.company;


// Print the divisors of a given integer


public class Ex6 {

    public static void main(String[] args) {

        int givenNumber = 100;
        for (int i=1; i<=givenNumber; i++){
            if (givenNumber%i==0){
                System.out.println(i);
            }
        }
    }
}
