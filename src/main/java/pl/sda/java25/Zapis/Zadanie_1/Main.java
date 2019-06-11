package pl.sda.java25.Zapis.Zadanie_1;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Main {
    public static void main(String[] args) {
        try {
            PrintWriter printWriter = new PrintWriter("output_1.txt");
            printWriter.println("Hello World!");
            printWriter.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}
