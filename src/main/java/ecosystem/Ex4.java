package main.java.ecosystem;


// Checks if a given integer is an odd or not


import java.util.Scanner;

public class Ex4 {

    private static Integer giveANumber(){
        Scanner input = new Scanner(System.in);
        int givenInteger = Integer.parseInt(input.next());
        return givenInteger;
    }

    private static boolean checkIfNumberIsEvenOrNot(int givenInteger){
        boolean theNumberIsEven=false;
        if (givenInteger%2==0){
            theNumberIsEven=true;
        }
        return theNumberIsEven;
    }

    public static void main(String[] args) {

        try{
            System.out.println("Give an Integer: ");

            if (checkIfNumberIsEvenOrNot(giveANumber())){
                System.out.println("The given number is even");
            }else {
                System.out.println("The given number is odd");
            }
        }catch (NumberFormatException nai){
            System.out.println(nai.getMessage() + " it's not an integer.");
        }
    }
}
