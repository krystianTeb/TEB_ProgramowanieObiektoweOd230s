package org.example;
import java.util.Scanner;
class Punkt2 {
    int x;//pole klasy
    int y;//pole klasy
    int pobierzX() { //metodę klasy (getter - zwraca coś)
        return x;
    }
    int pobierzY() { //metodę klasy (getter - zwraca coś)
        return y;
    }
}
public class Main {
    public static void main(String[] args) {
        Punkt2 punkt = new Punkt2();//deklaracja obiektu i stworzenie instancji (wystąpienia) klasy Punkt2
        punkt.x = 55;//została przypisana wartość 55 do pola x w obiekcie.
        int liczba = punkt.pobierzX();//pobieramy rezultat zwracany w metodzie i zapisujemy zwracaną wartość do zmiennej.
        System.out.println(liczba);
    }
}