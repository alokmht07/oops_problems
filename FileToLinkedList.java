import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;

public class FileToLinkedList {

    public static void main(String[] args) {
        String filePath = "FileToLinkedList.txt"; 
        LinkedList<String> lines = new LinkedList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                lines.add(line); 
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("Contents of the LinkedList:");
        for (String line : lines) {
            System.out.println(line);
        }
    }
}