package pl.sda.java25.Odczyt.Zadanie_2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        BufferedReader reader;
        {
            try {
                reader = new BufferedReader(new FileReader("output_2.txt"));
                String linia = reader.readLine();
                System.out.println(linia.toUpperCase());
                System.out.println(linia.toLowerCase());
                System.out.println(linia.trim());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}