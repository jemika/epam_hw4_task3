import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Main {

    public static void main(String[] args) {
        String fileToRead = "C:\\Users\\Артём\\epam_hw4_task3\\src\\Main.java";
        String fileToWrite = ("C:\\Users\\Артём\\epam_hw4_task3\\src\\output.txt");

        try {
            Files.write(Paths.get(fileToWrite), Files.readAllLines(Paths.get(fileToRead), StandardCharsets.UTF_8),
                    StandardCharsets.UTF_16);
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
