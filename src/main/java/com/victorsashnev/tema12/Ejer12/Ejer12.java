package com.victorsashnev.tema12.Ejer12;
import com.victorsashnev.tema12.Lib.*;
public class Ejer12 {
    public static void main(String args[]){
        String [] arrayDni= new String[10];
        String [] arrayDniLet = new String[arrayDni.length];

    }
    public static String calculateNif(int dni) {
        return String.valueOf(dni) + getLetter(dni);
    }


    public static char getLetter(int dni) {
        String tab = new String("TRWAGMYFPDXBNJZSQVHLCKE");
        int posLet = dni % 23;
        return tab.charAt(posLet);
    }
}
