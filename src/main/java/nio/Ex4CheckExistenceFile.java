package nio;

// Check the existence of a file using nio

import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Ex4CheckExistenceFile {

    public static void main(String[] args) {
        Path path = Paths.get("src/main/resources/fileExistence.txt");

        boolean pathExists = Files.exists(path, LinkOption.NOFOLLOW_LINKS);

        if (pathExists){
            System.out.println("The file exists");
        }else {
            System.out.println("The file doesn't exist");
        }
    }

}
