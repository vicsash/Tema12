package com.victorsashnev.tema12.Ejer03;

import java.io.File;

public class Ejer03 {
    public static void main( String[]args){
        if (args.length != 1) {
            System.err.println("ERROR: debe indicar la ruta");
            System.exit(1);
        }

        File f = new File(args[0]);
        if(f.exists()){
            System.out.println(f.getName());
            System.out.println(f.getAbsolutePath());
            System.out.println(f.canRead());
            System.out.println(f.canWrite());
        }


    }
}
