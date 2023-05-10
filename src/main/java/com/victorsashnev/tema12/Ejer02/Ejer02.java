package com.victorsashnev.tema12.Ejer02;

import java.io.File;
import java.util.Arrays;

public class Ejer02 {
    public static void main (String args[]) {
        StringBuilder sb = new StringBuilder();
        if (args.length != 1) {
            System.err.println("ERROR: debe indicar la ruta");
            System.exit(1);

        }
        File f = new File(args[0]);
        for(File fil : f.listFiles()){
            if(fil.isFile())
                System.out.println("Es un file");
            if(fil.isDirectory())
                System.out.println("Es un directorio");
        }

    }
}
