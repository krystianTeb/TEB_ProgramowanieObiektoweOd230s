package org.example;
public class Prostokat {
    public Punkt punkt1;
    public Punkt punkt2;
    public Punkt punkt3;
    public Punkt punkt4;
    public void wypiszWszystkieWspolrzedne(){
        System.out.println( "Punkt 1:" + punkt1.wyswietlPunkt() + "\nPunkt2: " +
                                        punkt2.wyswietlPunkt() + "\nPunkt 3: " +
                                        punkt3.wyswietlPunkt() + "\nPunkt 4: " +
                                        punkt4.wyswietlPunkt());
    }
}
