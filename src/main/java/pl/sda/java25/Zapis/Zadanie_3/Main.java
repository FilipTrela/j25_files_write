package pl.sda.java25.Zapis.Zadanie_3;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String komenda;
        komenda = scanner.nextLine();
        try (PrintWriter printWriter = new PrintWriter(new FileWriter("output_3.txt", true))) {
            do {
                printWriter.println(komenda);
                komenda = scanner.nextLine();
            } while (!komenda.equalsIgnoreCase("quit"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}