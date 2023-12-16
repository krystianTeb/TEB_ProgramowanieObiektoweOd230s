package org.example;

import java.util.Scanner;

class Punkt{
    int x; //To jest właściwość (polami) klasy
    int y; //To jest właściwość (polami) klasy
}

public class Main {
    public static void main(String[] args) {

        Punkt punkt1 = new Punkt();//Utworzenie obiektu (instancji) klasy Punkt
        punkt1.x = 5;//Przypisujemy 5 do właściwości x w obiekcie punkt1
        System.out.println("Właściwość x obiektu punkt1: " + punkt1.x +
                            "\nWłaściwość y obiektu punkt1: " + punkt1.y);
        Punkt punkt2 = new Punkt();//Utworzenie obiektu (instancji) klasy Punkt
        System.out.println("Właściwość x obiektu punkt2: " + punkt2.x +
                            "\nWłaściwość y obiektu punkt2: " + punkt2.y);
        Punkt punkt3 = new Punkt();//Utworzenie obiektu (instancji) klasy Punkt
        System.out.println("Właściwość x obiektu punkt3: " + punkt3.x +
                "\nWłaściwość y obiektu punkt3: " + punkt3.y);
    }
}