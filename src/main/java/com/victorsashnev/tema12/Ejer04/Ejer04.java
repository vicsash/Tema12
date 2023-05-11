package com.victorsashnev.tema12.Ejer04;

import java.io.File;
import java.nio.file.attribute.FileTime;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;

public class Ejer04 {
    public static void main(String[] args){

        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyy -hh:mm:ss");
        if (args.length != 1) {
            System.err.println("ERROR: debe indicar la ruta");
            System.exit(1);
        }

        File f = new File(args[0]);
        File[] list = f.listFiles();
        if(f.exists()){
            assert list != null;
            FileTime fileTime;
            //fileTime = FileTime.fromMillis(list[1].lastModified());
            System.out.println(list[1].getName());
            System.out.println(list[1].getAbsolutePath());
            System.out.println((list[1].isHidden()));
            System.out.println(list[1].canRead());
            System.out.println(list[1].canWrite());
            //System.out.println(dateFormat.format(fileTime));
            System.out.println(list[1].length());
            //Post correction long bytes = f1.length();


        }
    }
}
