package pl.sda.java25.Odczyt.Zadanie_3;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int słowa = 0;
        int linie = 0;
        try {
            Scanner scanner = new Scanner(new FileReader("output_3.txt"));
            while (scanner.hasNextLine()){
                linie++;
                String linia = scanner.nextLine();
                String[] strings = linia.split("\\b[^\\s]+\\b");
                słowa += strings.length;
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println("Ilość słów "+słowa);
        System.out.println("Ilość lini "+linie);
    }
}
