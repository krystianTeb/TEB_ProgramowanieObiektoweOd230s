package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int liczba = 5;

        Punkt punkt1 = new Punkt(5, 2);//Utworzenie obiektu (instancji) klasy Punkt
        punkt1.wypiszPunkty();
        punkt1.setX(10);//Wywołanie metody set (setter)
        System.out.println( punkt1.getX() );//Wywołanie metody get (getter)



        Punkt punkt2 = new Punkt(8,8);//Utworzenie obiektu (instancji) klasy Punkt
        punkt2.wypiszPunkty();

        Punkt punkt3 = new Punkt(6, 7);//Utworzenie obiektu (instancji) klasy Punkt
        punkt3.wypiszPunkty();
    }
}