package com.victorsashnev.tema12.Ejer16;
public class Jugador {
    private int victorias;
    private int empates;
    private String nombre;
    private char ficha;

    public Jugador(String nombre, char ficha) {
        victorias = 0;
        empates = 0;
        this.nombre = nombre;
        this.ficha = ficha;
    }

    public int getEmpates() {
        return empates;
    }

    public int getVictorias() {
        return victorias;
    }

    public String getNombre() {
        return nombre;
    }

    public void victoria() {
        this.victorias += 1;
    }

    public char getFicha() {
        return ficha;
    }

    public void empate() {
        this.empates += 1;
    }

    @Override
    public String toString() {
        return nombre + " v:" + victorias + " e:" + empates;
    }
}
