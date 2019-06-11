package pl.sda.java25.Zapis.Zadanie_2;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj tekst");
        String text = scanner.nextLine();
        try {
            PrintWriter printWriter = new PrintWriter("output_2.txt");
            printWriter.println(text);
            printWriter.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
