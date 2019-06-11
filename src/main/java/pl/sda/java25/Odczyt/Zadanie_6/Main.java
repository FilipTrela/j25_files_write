package pl.sda.java25.Odczyt.Zadanie_6;

import pl.sda.java25.Zapis.Zadanie_5.Formularz;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Formularz formularz = null;
        try {
            BufferedReader reader = new BufferedReader(new FileReader("output_4.txt"));
            String linia;
            List<Formularz> list = new ArrayList<>();
            while ((linia = reader.readLine()) != null) {
                if (linia.equalsIgnoreCase("*******")) {
                    if(formularz!= null) list.add(formularz);
                    formularz = new Formularz();
                } else if (formularz != null) {
                    formularz.parsowanie(linia);
                }
            }
            list.add(formularz);
            System.out.println(list.size());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
