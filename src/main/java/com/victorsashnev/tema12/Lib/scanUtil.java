package com.victorsashnev.tema12.Lib;

import java.util.Random;
import java.util.Scanner;

public class scanUtil {
    static Random rand = new Random();
    static Scanner scanner = new Scanner(System.in);
    public static int scanInt(){
        int loop = -1;
        int num =0;
        do {
            try {
                num = Integer.parseInt(scanner.nextLine());
                loop = 1;
            } catch (NumberFormatException nfe) {
                System.out.println("A number must be introduced");
            }
        }while(loop == -1);
        return num;
    }
    public static double scanDouble(){
        int loop = -1;
        double num =0;
        do {
            try {
                num = Double.parseDouble(scanner.nextLine());
                loop = 1;
            } catch (NumberFormatException nfe) {
                System.out.println("A number must be introduced");
            }
        }while(loop == -1);
        return num;
    }
    public static String scanString(){
        String text;
        return text = scanner.nextLine();
    }

    public  static char scanChar(){
        char caracter;
        return caracter = scanner.next().charAt(0);
    }
}
