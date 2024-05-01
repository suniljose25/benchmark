// write code to write 10000000 line to a file
// each line should contain a random number between 1 to 1000

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

import java.util.Date;

public class Main {
    public static long LINES = 10_000_000;

    public static void main(String[] args) {
        try {
            var time = new Date().getTime();
            
            System.out.print("Java: Writing to file...");
            
            BufferedWriter writer = new BufferedWriter(new FileWriter(File.createTempFile("random_java.txt", null)));
            Random random = new Random();
            for (int i = 0; i < LINES; i++) {
                writer.write(String.valueOf(random.nextInt(1000)));
                writer.newLine();
            }
            writer.close();
            System.out.println("\rJava: Time taken to write " + LINES + " lines to file: " + (new Date().getTime() - time) + "ms");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
