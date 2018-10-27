package nio;

// Copy a file using nio

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

import static java.nio.file.StandardCopyOption.*;


public class Ex6CopyFileNio {


    public static void main(String[] args) throws IOException{

        File source = new File( "src/main/resources/fileExistence.txt");
        File dest = new File( "src/main/resources/fileCopiedNio.txt");

        Files.copy(source.toPath(),dest.toPath(),ATOMIC_MOVE,REPLACE_EXISTING,COPY_ATTRIBUTES);

    }
}
