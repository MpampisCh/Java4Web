package nio;

// Copy a file using streams

import java.io.*;

public class Ex5CopyFileStreams {

    public static void main(String[] args) throws IOException {

        InputStream inputStream = null;
        OutputStream outputStream = null;

        try {
            inputStream = new FileInputStream("src/main/resources/fileExistence.txt");
            outputStream = new FileOutputStream("src/main/resources/fileCopiedStream.txt");
            byte[] buffer = new byte[1024];
            int length;
            while ((length = inputStream.read(buffer)) > 0) {
                outputStream.write(buffer, 0, length);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        inputStream.close();
        outputStream.close();
    }
}
