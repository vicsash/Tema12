package com.victorsashnev.tema12.Ejer09;

import java.io.FileWriter;
import java.io.IOException;
import com.victorsashnev.tema12.Lib.*;

public class Ejer09 {
    /*12. Haz un método que reciba como parámetro un fichero con 20 DNI aleatorios (sin letra) y:
    a) compruebe que todos los DNI tienen una longitud de 8 dígitos, sino es así, deberá rellenar con
        0’s por la izquierda.
    b) calcule la letra correspondiente a cada DNI y la añada por la derecha.
    c) Guarde el resultado en otro archivo cuyo nombre sea el resultado de concatenar el nombre del
        archivo original más “_conLetras” en la parte del nombre.*/
    public static void main(String[] args) {
        String dniNumeros;
        String [] arrayDni = new String[20];
        String letter;
        String [] arrayDniLetra = new String[arrayDni.length];
            for(int i = 0; i < arrayDni.length;i++ ){
                for (int j = 0; j < 8;j++){
                    arrayDni[i] += randomUtil.randomNumeber(9,0);
                }
                try ( FileWriter myWriter = new FileWriter("filename.txt");){
                    myWriter.write(arrayDni[i] +"\n");
                    myWriter.close();
                } catch (IOException e) {
                    System.out.println("An error occurred.");
                    e.printStackTrace();
                }
            }
            for(int i = 0; i < arrayDni.length;i++){
                try ( FileWriter myWriter = new FileWriter("filename2.txt");){
                    myWriter.write(arrayDni[i] +"letter");
                    myWriter.close();
                } catch (IOException e) {
                    System.out.println("An error occurred.");
                    e.printStackTrace();
                }
            }



    }
}
