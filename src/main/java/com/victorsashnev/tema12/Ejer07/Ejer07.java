package com.victorsashnev.tema12.Ejer07;

import java.io.File;
import java.io.IOException;

public class Ejer07 {
    public static void main(String[] args) throws IOException {

        if (args.length != 1) {
            System.err.println("ERROR: debe indicar la ruta");
            System.exit(1);
        }
        gestionarArchvio gestionar = new gestionarArchvio();
        gestionar.textToHexa(args[0]);

    }
}
/*
* crear feacha
* fecha1 menos fecha2
*
* */