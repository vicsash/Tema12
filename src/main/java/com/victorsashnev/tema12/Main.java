package com.victorsashnev.tema12;
//import com.victorsashnev.tema12.Ejer02.Ejer02.Ejer02;
import java.io.File;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {/*
    //ordenador de profe
    File f = new File(File.separator +"home" + File.separator +"gacon" +File.separator +" hola.txt");*/
        //revibe como parametro u argumento y una ruta y decir si es un archivo o documento
        //File
    if(args.length != 1){
        System.err.println("ERROR: debe indicar la ruta");
        System.exit(1);
    }
        System.out.println("Hola");
    File f = new File(args[0]);
    StringBuilder sb = new StringBuilder();
        /*if(f.isDirectory()){
            sb.append(f).append(f.length()).append(f.lastModified());
        }else if(f.isFile())
            sb.append(f).append(f.length()).append(f.lastModified());
        else
            sb.append("unkown").append(f.lastModified());
        System.out.println(Arrays.toString(sb.toString()));*/
        if(!f.exists()){
            System.out.println(args[0] + "no existe");
        }else if(f.isFile()){
            System.out.println(args[0] + "es un archivo");
        }else if(f.isDirectory())
            System.out.println(args[0] + "es un directorio");
    }
}