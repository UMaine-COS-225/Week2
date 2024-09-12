import java.io.*;

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

        try (FileWriter writer = new FileWriter("hello.txt")) {
            writer.write("Hello World\n");
        } catch (IOException e) {
            System.out.println("Something happened while writing to the file");
            e.printStackTrace();
        }

        //Reading file
        try (BufferedReader reader = new BufferedReader(new FileReader("hello.txt"))){
            String line = reader.readLine();
            while(line != null) {
                System.out.println(reader.readLine());
            }
        } catch (Exception e) {
            System.out.println("Something happened when trying to read the file");
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