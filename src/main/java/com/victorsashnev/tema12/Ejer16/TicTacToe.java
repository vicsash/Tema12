package com.victorsashnev.tema12.Ejer16;

import java.util.Random;
import java.util.Scanner;

public class TicTacToe {
    private final static int FILAS = 3;
    private final static int COLUMNAS = 3;
    private  Jugador jugador1;
    private  Jugador jugador2;
    private  Jugador turno1;
    private  Jugador turno2;
    private static Scanner scanner;

    // private static char[][] tablero;

    public TicTacToe() {
        boolean salir = false;
        boolean rondaFinalizada = false;
        scanner = new Scanner(System.in);
        char[][] tablero = new char[FILAS][COLUMNAS];
        System.out.println("Nombre Jugador 1: ");
        String nombre = scanner.nextLine();
        jugador1 = new Jugador(nombre, 'X');

        System.out.println("Nombre Jugador 2: ");
        nombre = scanner.nextLine();
        jugador2 = new Jugador(nombre, 'O');
        sorteoTurno();

        do {
            mostrarPuntuacion();
            reset(tablero);
            do {
                mostrarTablero(tablero);
                solicitarJugada(tablero, turno1);
                if (esJugadaGanadora(tablero, turno1)) {
                    victoria(turno1);
                    rondaFinalizada = true;
                    continue;
                }
                rondaFinalizada = esUltimaJugada(tablero);
                if (!rondaFinalizada) {
                    solicitarJugada(tablero, turno2);
                    if (esJugadaGanadora(tablero, turno2)) {
                        victoria(turno2);
                        rondaFinalizada = true;
                        continue;
                    }
                    rondaFinalizada = esUltimaJugada(tablero);
                }
                if (rondaFinalizada)
                    empate(tablero);
            } while (!rondaFinalizada);
            cambiarTurno();
        } while (!salir);
        mostrarTablero(tablero);
    }

    public void empate(char[][] tablero) {
        System.out.println("Empate!!");
        mostrarTablero(tablero);
        turno1.empate();
        turno2.empate();
    }

    public  boolean esUltimaJugada(char[][] tablero) {
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[i].length; j++) {
                if (tablero[i][j] == ' ')
                    return false;
            }
        }
        return true;
    }

    public  void victoria(Jugador jugador) {
        jugador.victoria();
        System.out.println(jugador.getNombre() + " ha ganado!!");
    }

    public  void mostrarPuntuacion() {
        System.out.println(jugador1 + " VS " + jugador2);

    }

    public  void cambiarTurno() {
        Jugador aux = turno1;
        turno1 = turno2;
        turno2 = aux;
    }

    public  boolean comprobarVictoria(char[][] tablero, Jugador jugador) {
        int contadorFilas;
        int contadorColumnas;
        int contadorDiagonal1 = 0;
        int contadorDiagonal2 = 0;
        for (int i = 0; i < tablero.length; i++) {
            contadorFilas = 0;
            contadorColumnas = 0;
            for (int j = 0; j < tablero[i].length; j++) {
                if (tablero[i][j] == jugador.getFicha()) {
                    contadorFilas++;
                }
                if (tablero[j][i] == jugador.getFicha()) {
                    contadorColumnas++;
                }
            }
            if (contadorFilas == tablero.length || contadorColumnas == tablero[i].length)
                return true;
            // Comprobamos diagonales
            if (tablero[i][i] == jugador.getFicha()) {
                contadorDiagonal1++;
            }
            if (tablero[i][tablero.length - i - 1] == jugador.getFicha()) {
                contadorDiagonal2++;
            }
        }
        return contadorDiagonal1 == tablero.length || contadorDiagonal2 == tablero.length;
    }

    public boolean esJugadaGanadora(char[][] tablero, Jugador jugador) {
        return comprobarVictoria(tablero, jugador);
    }

    public void solicitarJugada(char[][] tablero, Jugador turno) {
        int jugada;
        boolean valido;
        int i = 0, j = 0;
        int limite = (tablero.length * tablero[0].length);
        do {

            System.out.println("Turno: " + turno.getNombre() + "(" + turno.getFicha() + ")");
            jugada = Integer.parseInt(scanner.nextLine());
            valido = jugada >= 1 && jugada <= limite;
            if (!valido) {
                System.out.println("Solo números entre 1 y " + limite);
            } else {
                i = jugada / tablero.length;
                int resto = jugada % tablero.length;
                if (resto == 0) {
                    i--;
                }
                j = (jugada - 1) % tablero.length;
                valido = tablero[i][j] == ' ';
                if (!valido) {
                    System.out.println("Ya existe una ficha en esa posición");
                }
            }
        } while (!valido);

        tablero[i][j] = turno.getFicha();
    }

    public void sorteoTurno() {
        Random random = new Random();
        int turno = random.nextInt(2 - 1 + 1) + 1;
        if (turno == 1) {
            turno1 = jugador1;
            turno2 = jugador2;
        } else {
            turno1 = jugador2;
            turno2 = jugador1;
        }
    }

    public void reset(char[][] tablero) {
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[i].length; j++) {
                tablero[i][j] = ' ';
            }
        }
    }

    public void mostrarTablero(char[][] tablero) {
        StringBuilder sb = new StringBuilder(100);
        int columnas = tablero[0].length;
        for (int i = 0; i < tablero.length; i++) {
            sb.append(obtenerCabecera('-', columnas));
            sb.append("|");
            for (int j = 0; j < tablero[i].length; j++) {
                sb.append(tablero[i][j]).append("|");
            }
            sb.append("\n");
        }
        sb.append(obtenerCabecera('-', columnas));
        System.out.print(sb.toString());
    }

    public String obtenerCabecera(char c, int columnas) {
        StringBuilder sb = new StringBuilder();
        sb.append(" ").append(repetirString(c + " ", columnas)).append("\n");
        return sb.toString();
    }

    public String repetirString(String s, int veces) {
        StringBuilder sb = new StringBuilder(s.length() * veces);
        for (int i = 0; i < veces; i++)
            sb.append(s);
        return sb.toString();
    }
}