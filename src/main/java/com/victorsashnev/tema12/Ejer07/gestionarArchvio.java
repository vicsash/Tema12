package com.victorsashnev.tema12.Ejer07;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class gestionarArchvio {
    private static final String NEW_LINE = System.lineSeparator();
    private static final String UNKNOWN_CHARACTER = ".";

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

    public void textToHexa(String path){
        StringBuilder sb = new StringBuilder();
        try(FileReader fil = new FileReader(path)) {
            int text;
            while(( text= fil.read())>=0){
                sb.append(String.format("%02X",text));
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


