package nio;

// Read 3 lines from Standard Input and write them to a file.

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Ex3Read3LinesToFile {

    public static void main (String[]args) {
        System.out.println("Write 3 lines:");
        Scanner scanner = new Scanner(System.in);

        String[] str = new String[3];

        for (int i=0; i<=2; i++) {
            str[i] = scanner.nextLine();
        }

        try (PrintWriter printWriter = new PrintWriter("src/main/resources/FileEx3.txt")) {
            for (String line : str) {
                printWriter.write(line + "\n");
            }
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }

        scanner.close();
    }
}
