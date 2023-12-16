package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int liczba = 5;

        Punkt punkt1 = new Punkt(5, 2);//Utworzenie obiektu (instancji) klasy Punkt
        punkt1.x = 0;//przypisanie nowej wartości do pola x
        punkt1.y = 0;//przypisanie nowej wartości do pola y
        punkt1.wypiszPunkty();

        Punkt punkt2 = new Punkt(8,8);//Utworzenie obiektu (instancji) klasy Punkt
        punkt2.wypiszPunkty();

        Punkt punkt3 = new Punkt(6, 7);//Utworzenie obiektu (instancji) klasy Punkt
        punkt3.wypiszPunkty();
    }
}