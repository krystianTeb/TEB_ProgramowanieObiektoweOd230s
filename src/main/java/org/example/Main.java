package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int liczba = 5;

        Punkt punkt1 = new Punkt(5, 2);//Utworzenie obiektu (instancji) klasy Punkt
        System.out.println( punkt1 );

        Punkt punkt2 = new Punkt(8,8);//Utworzenie obiektu (instancji) klasy Punkt
        System.out.println( punkt2 );
        System.out.println( punkt2.getX() );

    }
}