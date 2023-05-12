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
    public static void main(String args[]){

        StringBuilder sb = new StringBuilder();
        try(FileReader fil = new FileReader(args[0])) {
            int text;
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
