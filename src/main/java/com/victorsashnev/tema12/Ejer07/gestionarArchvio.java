package com.victorsashnev.tema12.Ejer07;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class gestionarArchvio {

    //Files newFile;
    public boolean creteArchive(String directory, String archive) throws IOException {
        File newFile = new File(directory + File.separator +archive );
            if(newFile.createNewFile()){
                System.out.println("File created");
            }
        return true;
    }
    public void listDirectory(String directorio){
        File files = new File(directorio);
        for(File fil : files.listFiles()){
            if(files.exists()){
                if(fil.isDirectory()){
                    System.out.println("d" + files.length() +
                            "  " +files.canRead() + "  " +files.canWrite());
                }
                if(fil.isFile()){
                    System.out.println("f" + files.length() +
                            "  " +files.canRead() + "  " +files.canWrite());
                }
            }
        }
    }

    public void seeInfo(String directory, String archive ){
        File file = new File(directory + File.separator +archive);
        if(file.exists()){
            System.out.println(file.getName() + " "
                    + file.canRead() + " " + file.canWrite()
                    + " " + file.isDirectory()
                    + " "+ file.isFile());
        }
    }
    public void readText(String path){
        StringBuilder sb = new StringBuilder();
            try(FileReader fil = new FileReader(path)) {
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
