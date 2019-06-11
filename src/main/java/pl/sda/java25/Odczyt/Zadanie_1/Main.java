package pl.sda.java25.Odczyt.Zadanie_1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            File file = new File("output_1.txt");
            if (file.exists()) {
                BufferedReader reader = new BufferedReader(new FileReader("output_1.txt"));
                String linia = reader.readLine();
                if (linia.equalsIgnoreCase("Hello World!")) {
                    System.out.println("Plik output_1.txt z treścią HelloWorld! isnieje.");
                } else System.out.println("Plik output_1.txt istnieje ale ma inną treść.");
                reader.close();
            }else System.out.println("Plik nie isnieje");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
