package pl.sda.java25.Odczyt.Zadanie_4;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        BufferedReader reader;
        String linia;
        try {
            reader = new BufferedReader(new FileReader("output_4.txt"));
            while ((linia = reader.readLine()) != null) {
                System.out.println(linia);
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
