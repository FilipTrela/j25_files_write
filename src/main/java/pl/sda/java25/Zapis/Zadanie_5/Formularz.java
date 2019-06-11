package pl.sda.java25.Zapis.Zadanie_5;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Formularz {
    private int wiek;
    private int wzrost;
    private String płeć;
    private int zarobki;
    private String imie;
    private String nazwisko;

    public void parsowanie(String linia) {
        String[] elementy = linia.split("=");
        switch (elementy[0]) {
            case "Wiek":
                setWiek(Integer.parseInt(elementy[1]));
                break;
            case "Wzrost":
                setWzrost(Integer.parseInt(elementy[1]));
                break;
            case "Płeć":
                setPłeć(elementy[1]);
                break;
            case "Zarobki":
                setZarobki(Integer.parseInt(elementy[1]));
                break;
            case "Imię":
                setImie(elementy[1]);
                break;
            case "Nazwisko":
                setNazwisko(elementy[1]);
                break;
        }
    }

    @Override
    public String toString() {
        return "\n*******\nImię=" + imie + "\n Nazwisko=" + nazwisko +
                "\n Wiek=" + wiek + "\n Płeć=" + płeć +
                "\n Wzrost=" + wzrost + "\n Zarobki=git " + zarobki;
    }
}
