package com.victorsashnev.tema12.Ejer05;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

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
                if(files.isDirectory()){
                    System.out.println("d" + files.length() +
                            "  " +files.canRead() + "  " +files.canWrite());
                }
                if(files.isFile()){
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


}
