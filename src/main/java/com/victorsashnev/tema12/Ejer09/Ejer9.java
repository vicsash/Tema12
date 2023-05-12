package com.victorsashnev.tema12.Ejer09;

import java.io.File;
import java.io.IOException;

public class Ejer9 {
    public static void main(String[] args) throws IOException {
        String [] name ={"Marco","Victor","Adrian","Manuel"};
        File file = new File(args[0]);
        String path = file.getPath();
        GestionAlumno gestionAlumno = new GestionAlumno();
        String [] newNames={"Marco","Adrian","Manuel"};
        if (file.exists()) {
            //gestionAlumno.insertarAlumnos(name,path);
            gestionAlumno.insertarAlumnos(newNames,path);
        }


    }


}
