package com.victorsashnev.tema12.Ejer07;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class gestionarArchvio {
    private static final String NEW_LINE = System.lineSeparator();
    private static final String UNKNOWN_CHARACTER = ".";
    public void textToHexa(String path){
        /*Inputsteam es para leer binario
        *FilerReader para leer 'texto'
        * para hexadecimal es ma esficiente el inputstream
        *
        */
        StringBuilder sb = new StringBuilder();
        try(FileReader fil = new FileReader(path)) {
            int text;
            while(( text= fil.read())>=0){
                sb.append(String.format("%02X",text));
                //printf("%c",(char)c) para convertir de byte a char
                //conversion peligrosa
                //
                sb.append(" ");
            }
        } catch(FileNotFoundException e){
            throw new RuntimeException(e);
        } catch(IOException e){
            throw new RuntimeException(e);
        }
        System.out.println(sb);
    }
}


