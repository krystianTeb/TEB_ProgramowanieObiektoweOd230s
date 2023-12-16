package org.example;

import java.util.Scanner;

class Punkt{
    int x; //To jest właściwość (polami) klasy
    int y; //To jest właściwość (polami) klasy
}

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in); //Tworzymy nowy obiekt klasy Scaner
        int liczba = 5; //Utworzenie zmiennej


        System.out.println("Potęgowanie: " + Math.pow(2, 2));//Metoda matematyczna pow()
        System.out.println("Wartość PI: " + Math.PI);//Właściwość klasy matematycznej
    }
}