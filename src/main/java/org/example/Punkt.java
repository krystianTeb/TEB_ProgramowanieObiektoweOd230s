package org.example;

class Punkt{
    private int x; //To jest właściwość (polami) klasy
    private int y; //To jest właściwość (polami) klasy
    void wypiszPunkty(){ //To jest metoda, która wypisuje właściwości obiektu
        System.out.println("Właściwość x: " + this.x +
                            "\nWłaściwość y: " + this.y);
    }

    public Punkt(int PobraneX, int PobraneY) {//Konstruktor - metoda która jest wywoływana podczas tworzenia obiektu
        this.x = PobraneX;
        this.y = PobraneY;
    }

    public void setX(int x) {//metoda setter pozwala przypisać (zmodyfikować) wartość
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getX() {
        return x;
    }

    @Override
    public String toString() {
        return "Punkt{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}