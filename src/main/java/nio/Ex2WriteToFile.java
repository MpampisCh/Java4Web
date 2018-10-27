package nio;

// Read a line from Standard Input and write it to a File

import java.io.*;
import java.util.Scanner;

public class Ex2WriteToFile {

    public static void main (String[]args) {

        System.out.println("Write something:");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();

        try(PrintWriter printWriter = new PrintWriter("src/main/resources/FileEx2")) {
            printWriter.write(str);
        }
        catch (IOException ioe) {
            ioe.printStackTrace(); }

        scanner.close();
    }
}
