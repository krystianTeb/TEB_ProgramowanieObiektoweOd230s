package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int liczba = 5;

        Punkt punkt1 = new Punkt();//Utworzenie obiektu (instancji) klasy Punkt
        punkt1.x = 5;//Przypisujemy 5 do właściwości x w obiekcie punkt1
        punkt1.wypiszPunkty();

        Punkt punkt2 = new Punkt();//Utworzenie obiektu (instancji) klasy Punkt
        punkt2.wypiszPunkty();

        Punkt punkt3 = new Punkt();//Utworzenie obiektu (instancji) klasy Punkt
        punkt3.wypiszPunkty();
    }
}