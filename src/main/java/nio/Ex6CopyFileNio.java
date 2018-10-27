package nio;

// Copy a file using nio

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;


public class Ex6CopyFileNio {

    public static void main(String[] args) throws IOException{

        try {
            Path source = Paths.get("src/main/resources/fileExistence.txt");
            Path dest = Paths.get( "src/main/resources/fileCopiedNio.txt");

            Files.copy(source.toAbsolutePath(),dest.toAbsolutePath());

        }catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
