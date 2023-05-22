package com.victorsashnev.tema12.Ejer15;

import java.io.File;


public class Ejer15 {
    public static void main(String[] args) throws GestionArchivosNotFolderException {
        File one = new File(args[0] + "/Carp1");
        File two = new File(args[0]+ "/Carp2");
        if(setFoulders(one,two)){
            System.out.println("End");
        }
    //Diffolder

    }
     public static boolean setFoulders(File one, File two) throws GestionArchivosNotFolderException {
        if(!one.exists() || !two.exists()) {
            throw new GestionArchivosNotFolderException("One of the folders doesn't exist");
        }
        return true;
     }
}
