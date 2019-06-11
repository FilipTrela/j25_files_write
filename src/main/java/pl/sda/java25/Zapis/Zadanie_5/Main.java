package pl.sda.java25.Zapis.Zadanie_5;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String komenda;
        do {
           wypełnienieFormularza();
            System.out.println("Chcesz dodać nestepny formularz?[y/n]");
            komenda = scanner.nextLine();
        } while (komenda.equalsIgnoreCase("y"));
    }
    public static void wypełnienieFormularza(){
        Scanner scanner = new Scanner(System.in);
        Formularz formularz = new Formularz();
        System.out.println("Podaj imie: ");
        formularz.setImie(scanner.nextLine());
        System.out.println("Podaj nazwisko: ");
        formularz.setNazwisko(scanner.nextLine());
        System.out.println("Podaj wiek");
        formularz.setWiek(Integer.parseInt(scanner.nextLine()));
        System.out.println("Podaj zarobki");
        formularz.setZarobki(Integer.parseInt(scanner.nextLine()));
        System.out.println("Podaj płeć");
        formularz.setPłeć(scanner.nextLine());
        System.out.println("Podaj wzrost");
        formularz.setWzrost(Integer.parseInt(scanner.nextLine()));
        try (PrintWriter printWriter = new PrintWriter(new FileWriter("output_4.txt", true))) {
            printWriter.println(formularz);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
