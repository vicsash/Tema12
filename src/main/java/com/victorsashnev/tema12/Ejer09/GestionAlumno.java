package com.victorsashnev.tema12.Ejer09;

import java.io.*;

public class GestionAlumno {
    //Possible write method to add to lib
    public void insertarAlumnos(String [] aray,String path) throws IOException {
        FileWriter writer = new FileWriter(path);
        //Do with try
        BufferedWriter output = new BufferedWriter(writer);
        for (String s : aray) {
            output.write(s+"\n");
        }
        output.close();
    }
    public void eliminarAlumno(String path,String alumno) throws IOException {
        //Read file line per line
        BufferedReader rd = new BufferedReader(new FileReader(path));
    }
}
