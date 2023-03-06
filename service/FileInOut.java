package Task2.service;

import java.io.*;
import java.util.Scanner;

public class FileInOut {
    public static Scanner user_in() {
        return new Scanner(System.in, "UTF-8");
    }

    public static void read_file(String fileName) {
        File file = new File(fileName);

        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void write_file(String fileName, String dataWrite) {
        try (FileWriter writer = new FileWriter(fileName, true)) {
            writer.write(dataWrite);
            writer.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
