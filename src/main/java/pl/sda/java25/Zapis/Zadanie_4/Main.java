package pl.sda.java25.Zapis.Zadanie_4;

import java.io.File;
import java.sql.Timestamp;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj adres pliku");
        String adres = scanner.nextLine();
        File plik = new File(adres);
        System.out.println("Plik istnieje: " + plik.exists());
        System.out.println("Plik jest katalogiem: " + plik.isDirectory());
        System.out.println("Rozmiar pliku: " + plik.length());
        Timestamp timestamp = new Timestamp(plik.lastModified());
        System.out.println("Czas ostatniej modyfikacji pliku: " + timestamp.toLocalDateTime());
        System.out.println("Prawa do odczytu pliku: " + plik.canRead());
        System.out.println("Prawa do zapisu pliku: " + plik.canWrite());
    }
}
