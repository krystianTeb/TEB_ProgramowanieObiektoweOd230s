package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Prostokat prostokat1 = new Prostokat();
        prostokat1.punkt1 = new Punkt(1, 1);
        prostokat1.punkt2 = new Punkt(2, 2);
        prostokat1.punkt3 = new Punkt(3, 3);
        prostokat1.punkt4 = new Punkt(4, 4);
        System.out.println( prostokat1.punkt1.wyswietlPunkt() );
        System.out.println( prostokat1.punkt2.wyswietlPunkt() );
        System.out.println( prostokat1.punkt3.wyswietlPunkt() );
        System.out.println( prostokat1.punkt4.wyswietlPunkt() );
        prostokat1.wypiszWszystkieWspolrzedne();

    }
}