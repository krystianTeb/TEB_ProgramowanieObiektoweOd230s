package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        LiczbaCalkowita liczba = new LiczbaCalkowita();
        liczba.liczba = 5;
        liczba.wyswietlLiczbe();
        System.out.println( "Pobrana liczba: " + liczba.pobierzLiczbe() );




    }
}