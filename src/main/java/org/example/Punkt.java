package org.example;
class Punkt{
    public int x; //To jest właściwość (polami) klasy
    public int y; //To jest właściwość (polami) klasy

    public Punkt(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public String wyswietlPunkt(){
        return "(" + this.x + ", " + this.y + ")";
    }
}