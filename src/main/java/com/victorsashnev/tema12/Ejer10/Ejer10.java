package com.victorsashnev.tema12.Ejer10;

import java.io.*;

public class Ejer10 {
    /*10. Haz un método llamado concat que reciba como parámetro 2 archivos y cree un tercer fichero,
cuyo contenido, se obtendrá uniendo la información de los 2 archivos indicados. Primero irá el
contenido del archivo recibido como primer parámetro y después el contenido del archivo recibido
como segundo parámetro.
*/
    public static void main(String [] args){
        File one = new File("/Ejer10_1txt");
        File two = new File("/Ejer10_2txt");

        if(one.exists() && two.exists()){

        }
    }
    public void concat(File one,File two) throws IOException {
        StringBuilder sb = new StringBuilder();

        try(FileReader fil = new FileReader(one.getPath())) {
            int text;
            while(( text= fil.read())>=0){
                sb.append((char)text);
            }
        } catch(FileNotFoundException e){
            throw new RuntimeException(e);
        }catch(IOException e){
            throw new RuntimeException(e);
        }

        try(FileReader fil = new FileReader(two.getPath())) {
            int text;
            while(( text= fil.read())>=0){
                sb.append((char)text);
            }
        } catch(FileNotFoundException e){
            throw new RuntimeException(e);
        } catch(IOException e){
            throw new RuntimeException(e);
        }
        FileWriter writer = new FileWriter("/Ejer10_new");
        //Do with try
        BufferedWriter output = new BufferedWriter(writer);
            output.write(String.valueOf(sb));
        output.close();
    }
}
