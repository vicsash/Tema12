package com.victorsashnev.tema12.Ejer06;

import java.io.File;
import java.io.IOException;

public class Ejer06 {
    public static void main(String[] args) throws IOException {

        if (args.length != 1) {
            System.err.println("ERROR: debe indicar la ruta");
            System.exit(1);
        }
        gestionarArchvio gestionar = new gestionarArchvio();
        File f = new File(args[0]);
        File[] list = f.listFiles();
        gestionar.readText(args[0]);


    }
}
/*
* crear feacha
* fecha1 menos fecha2
*
* */