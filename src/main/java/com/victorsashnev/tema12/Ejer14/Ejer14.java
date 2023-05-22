package com.victorsashnev.tema12.Ejer14;

import java.io.*;

/*14. Crea un método que reciba como parámetros dos archivos, compare su contenido e indique si son
        iguales o no.*/
public class Ejer14 {
    public static void main(String args[]) throws FileNotFoundException {
        File one = new File(args[0] + "/Ejer13.txt");
        File two = new File(args[0]+ "/Ejer09.txt");
        if(compareTwoFilesTextAsBin(one,two)){
            System.out.println("The files are the same");
        }else
            System.out.println("The files are different");

    }

    /**
     * Method to compare two text files
     * @param one
     * @param two
     * @return
     */
    public static boolean compareTwoFilesText(File one, File two){
        try(
                //Can use buffered reader and other buffered functions
                BufferedReader fil = new BufferedReader(new FileReader(one.getPath()));
                BufferedReader filDos = new BufferedReader(new FileReader(two.getPath()));) {
            int text1;
            int text2;
            //Loop to compare the files
            while( (text1= fil.read())>=0 && ( text2= filDos.read())>=0 ){
                text1 = fil.read();
                text2 = filDos.read();
                //If there are any differences the loop is broken
                if(text1 != text2){
                    System.out.println("These files are not the same");
                    return false;
                }
            }
        } catch(IOException e){
            throw new RuntimeException(e);
        }
        return true;
    }

    /**
     * Method to compare two textfiles using FileInputStream
     * @param one
     * @param two
     * @return
     * @throws FileNotFoundException
     */
    public static boolean compareTwoFilesTextAsBin(File one, File two)  {
        try (FileInputStream frst = new FileInputStream(one);
             FileInputStream scnd = new FileInputStream(two);) {
            int text1;
            int text2;
            while((text1 = frst.read()) != -1 && (text2 = scnd.read()) != -1 ) {
                if(text1 != text2)
                    return false;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return true;
    }
}
