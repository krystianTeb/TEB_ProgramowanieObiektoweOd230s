package org.example;

public class Osoba {
    private String imie;
    private String nazwisko;
    private Integer numerTelefonu;
    public Osoba(String imie, String nazwisko, Integer numerTelefonu) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.numerTelefonu = numerTelefonu;
    }
    public void wypiszDaneOsoby(){
        System.out.println("-----------------------------");
        System.out.println("Imię: " + this.imie +
                            "\nNazwisko: " + this.nazwisko +
                            "\nNumer Telefonu: " + this.numerTelefonu );
        System.out.println("-----------------------------");
    }
}
