package Assignment5.Part2;

import java.io.*;
import java.nio.file.Path;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        File inputFile = new File("src/Assignment5/Part2/TestingFiles/input.txt"); // file to be read
        File outputFile = new File("src/Assignment5/Part2/TestingFiles/output.txt"); // file to write to

        // Task 1 Qst 1: Read File
        try {
            FileReader fileReader = new FileReader(inputFile);
            BufferedReader reader = new BufferedReader(fileReader);
            String line;
            while ((line = reader.readLine()) != null){
                System.out.println(line);
            }
            reader.close();
        }catch (IOException e){
            System.out.println(e.getMessage());
            System.exit(0);
        }

        // Task 1 Qst 2: Character Count
        try {
            FileReader fileReader = new FileReader(inputFile);
            BufferedReader reader = new BufferedReader(fileReader);
            String line;
            while ((line = reader.readLine()) != null){
                System.out.println("Line count: " + countChar(line));
            }
            reader.close();
        }catch (IOException e){
            System.out.println(e.getMessage());
            System.exit(0);
        }

        // Task 2 Qst 3: Write to file
        try{
            PrintWriter writer = new PrintWriter(new FileOutputStream(outputFile));
            writer.println("Hello, this is line 1.");
            writer.println("Java File I/O is interesting!");
            writer.println("End of the assignment.");
            writer.close();
        }catch (FileNotFoundException e){
            System.out.println(e.getMessage());
            System.exit(0);
        }

        // Task 3 Qst 4: Append to file
        try{
            PrintWriter writer = new PrintWriter(new FileOutputStream(outputFile, true));
            writer.println("Appending new line.");
            writer.println("File I/O without buffers.");
            writer.close();
        }catch (FileNotFoundException e){
            System.out.println(e.getMessage());
            System.exit(0);
        }

        // Task 4 Qst 5: Challenge
        Scanner kb = new Scanner(System.in);
        System.out.println("Enter a file name: ");
        String fileName = kb.nextLine();
        while (!fileName.matches("\\S+\\.txt")){
            System.out.println("Invalid file name. Please make sure to enter a file name without any whitespace followed by \".txt\": ");
            fileName = kb.nextLine();
        }
        System.out.println("Enter a string: ");
        String content = kb.nextLine();
        writeToFile(fileName, content);
    }

    // Task 1 Qst 2: Character Count
    public static int countChar(String s){
        return s.replaceAll("\\s", "").length();
    }

    // Task 4 Qst 5: Challenge
    public static void writeToFile(String fileName, String s){
        try {
            String file = "src/Assignment5/Part2/TestingFiles/" + fileName;
            FileWriter writer = new FileWriter(file);
            writer.write(s + "\n");
            writer.close();
        }catch (IOException e){
            System.out.println(e.getMessage());
            System.exit(0);
        }
    }
}
