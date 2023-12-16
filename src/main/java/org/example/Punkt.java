package org.example;

class Punkt{
    int x; //To jest właściwość (polami) klasy
    int y; //To jest właściwość (polami) klasy
    void wypiszPunkty(){ //To jest metoda, która wypisuje właściwości obiektu
        System.out.println("Właściwość x: " + this.x +
                            "\nWłaściwość y: " + this.y);
    }

    public Punkt(int PobraneX, int PobraneY) {//Konstruktor - metoda która jest wywoływana podczas tworzenia obiektu
        this.x = PobraneX;
        this.y = PobraneY;
    }
}