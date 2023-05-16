package com.victorsashnev.tema12.Ejer10;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Archivos {

    public void ecribirArchivo(String path, String text) throws IOException {
        FileWriter writer = new FileWriter(path);
        //Do with try
        BufferedWriter output = new BufferedWriter(writer);
            output.write("");

        output.close();
    }

    public boolean creteArchive(String path, String name, String text) throws IOException {
        File newFile = new File(path + File.separator + name );
        if(newFile.createNewFile()){
            ecribirArchivo(path,text);
        }
        return true;
    }
}
