import java.util.Scanner;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.FileNotFoundException;
import java.io.IOException;

class FileStuff {

    public static void main(String[] args) {

        // Writing to a file
        try {
            FileWriter writer = new FileWriter("hello.txt");
            writer.write("Hello world\nLearning is so cool!");
            writer.close();
        } catch (IOException e) {
            System.out.println("Something happened while writing to the file");
            e.printStackTrace();
        }

        // Writing with try-with-resources which automatically close the files for us!
        try (FileWriter writer = new FileWriter("hello.txt")) {
            writer.write("Hello World\n");
        } catch (IOException e) {
            System.out.println("Something happened while writing to the file");
            e.printStackTrace();
        }

        // Reading file
        try (BufferedReader reader = new BufferedReader(new FileReader("hello.txt"))) {
            String line = reader.readLine();
            while (line != null) {
                System.out.println(reader.readLine());
                line = reader.readLine();
            }
        } catch (Exception e) {
            System.out.println("Something happened when trying to read the file");
            e.printStackTrace();
        }

        // Reading file without BufferedReader
        try (FileReader reader = new FileReader("hello.txt")) {
            int character;
            while ((character = reader.read()) != -1) {
                System.out.print((char) character);
            }
        } catch (IOException e) {
            System.out.println("Something happened when trying to read the file");
            e.printStackTrace();
        }

        // Reading file using Scanner
        try (Scanner scanner = new Scanner(new File("hello.txt"))) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
            e.printStackTrace();
        }

        // Appending to each file
        try (FileWriter writer = new FileWriter("hello.txt", true)) {
            writer.write("New line");
        } catch (Exception e) {
            System.out.println("Something happened when trying to append to a file");
            e.printStackTrace();
        }

    }

}