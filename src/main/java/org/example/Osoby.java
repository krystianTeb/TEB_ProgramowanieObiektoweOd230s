package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Osoby {
    public static List<Osoba> listOsob = new ArrayList<>();
    public static void dodajOsoby(){
        Scanner scan = new Scanner(System.in);
        while(true) {
            System.out.println("Podaj imię osoby: ");
            String imie = scan.next();
            System.out.println("Podaj nazwisko osoby: ");
            String nazwisko = scan.next();
            System.out.println("Podaj numer telefonu osoby: ");
            int numerTelefonu = scan.nextInt();
            listOsob.add(new Osoba(imie, nazwisko, numerTelefonu));

            System.out.println("Czy zakończyć działanie pobierania danych?[T/N]: ");
            String czyKontynowac = scan.next();
            if(czyKontynowac.equals("T")) break;
        }
    }
    public static void wypiszWszystkieOsoby(){
        for (Osoba osoba : listOsob) {
            osoba.wypiszDaneOsoby();
        }
    }
}
