package com.victorsashnev.tema12.Ejer08;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Ejer08 {
    /*8. Crea un programa que permita leer y mostrar el contenido
    de un archivo pasado como parámetro al
    llamar al programa. Para ello debes utilizar
    el parámetro String[] args de la función main.
    */
    public static void main(String[] args){
        File f  = new File(args[0]);
        StringBuilder sb = new StringBuilder();
        try(FileReader fil = new FileReader(f.getPath())) {
            int text;
            // tiene que ser dentro para qu e null no sea el primera cosa que sale el null
            //si no esta dentro vamos a tener null y texto
            //Despues no poner en el while
            while(( text= fil.read())>=0){
                sb.append((char)text);
            }
        } catch(FileNotFoundException e){
            throw new RuntimeException(e);
        } catch(IOException e){
            throw new RuntimeException(e);
        }
        System.out.println(sb);
    }
}
