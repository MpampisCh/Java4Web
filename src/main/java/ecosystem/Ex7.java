package main.java.ecosystem;


// Print the first 30 numbers of the Fibonacci series


public class Ex7 {

    public static void main(String[] args) {

        int f0=1, f1=1, count=10, fibonacciNumber;

        for (int i=1; i<=count; i++){
            System.out.println(f0);

            fibonacciNumber=f0+f1;
            f0=f1;
            f1=fibonacciNumber;
        }
    }
}
