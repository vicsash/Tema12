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
                String path = f.getAbsolutePath();
                String nameNew = "new";
                gestionar.creteArchive(list[1].getAbsolutePath(),nameNew);
                gestionar.listDirectory(path);
                gestionar.seeInfo(list[1].getAbsolutePath(),list[1].getName());
            }

    }
}
