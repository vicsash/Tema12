package com.victorsashnev.tema12.Ejer05;

import java.io.File;
import java.io.IOException;

public class Ejer05 {
    public static void main(String[] args) throws IOException {

        if (args.length != 1) {
            System.err.println("ERROR: debe indicar la ruta");
            System.exit(1);
        }
        gestionarArchvio gestionar = new gestionarArchvio();
        File f = new File(args[0]);
        File[] list = f.listFiles();
            if(f.exists()){
                String path = f.getPath();
                String nameNew = "new3";
                gestionar.creteArchive(f.getPath(),nameNew);
                gestionar.listDirectory(path);
                gestionar.seeInfo(list[1].getPath(),list[1].getName());
            }

    }
}
/*
* crear feacha
* fecha1 menos fecha2
*
* */