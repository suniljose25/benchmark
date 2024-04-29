// write code to write 10000000 line to a file
// each line should contain a random number between 1 to 1000

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

import java.util.Date;

public class WriteRandom {
    public static void main(String[] args) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("random_java.txt"));
            System.out.println("Writing to file...");
            var time = new Date().getTime();
            Random random = new Random();
            for (int i = 0; i < 10000000; i++) {
                writer.write(String.valueOf(random.nextInt(1000)));
                writer.newLine();
            }
            System.out.println("Time taken: " + (new Date().getTime() - time) + "ms");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
