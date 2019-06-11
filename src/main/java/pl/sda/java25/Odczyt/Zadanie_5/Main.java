package pl.sda.java25.Odczyt.Zadanie_5;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        int iloscFormularzy = 0;
        try {
            BufferedReader reader = new BufferedReader(new FileReader("output_4.txt"));
            String linia;
            while ((linia = reader.readLine()) != null) {
                if (linia.equalsIgnoreCase("*******")) iloscFormularzy++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
