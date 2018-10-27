package nio;

// Read a line from Standard Input and print it on the screen.

import java.util.Scanner;

public class Ex1ReadFromSI {

    public static void main(String[] args) {
        System.out.println("Write something:");
        Scanner scanner = new Scanner(System.in);
        System.out.println("You wrote: " + scanner.next());
        scanner.close();
    }
}
