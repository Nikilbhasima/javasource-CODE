package fileHandling;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ReadWriteFile {
    Scanner scanner = new Scanner(System.in);

    public void writeFiles() {
        File file = new File("C:/Users/Nikil/IdeaProjects/LearningJava/src/fileHandling/database");
        try {
//             FileWriter fileWriter=new FileWriter(file);
//             fileWriter.write("hello world");
//             fileWriter.close();
            FileWriter fileWriter = new FileWriter(file);
            System.out.println("enter text to write file");
            String text = scanner.nextLine();
            fileWriter.write(text);
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void readFile() {
        File file = new File("C:/Users/Nikil/IdeaProjects/LearningJava/src/fileHandling/database");
        try {
            FileReader fileReader = new FileReader(file);
            int a;
            while ((a = fileReader.read()) != -1)
                System.out.println((char) a);
                fileReader.close();
        } catch (IOException E) {
            E.printStackTrace();
        }
    }
}