package com.victorsashnev.tema12.Ejer13;

import java.io.*;
import com.victorsashnev.tema12.Lib.*;

public class Ejer13 {
    public static void main(String args[]) throws FileNotFoundException {
        int textnumb,newNumb;
        boolean confirmOcp = true;
        File f = new File(args[0]);
        if (f.exists()){
        textnumb = confirmLastNum(f);
            System.out.println(textnumb);
        if(textnumb == 0){
            confirmOcp = false;
            }
           do{
               System.out.println("Introduce a number to confirm if it is prime.");
               System.out.println("Introduce 0 to end the process");
                try(BufferedWriter writer = new BufferedWriter(new FileWriter(f,confirmOcp))){
                    newNumb = scanUtil.scanInt();
                    if(newNumb == 0) {
                        System.out.println("Operation finished");
                    }else if(confirmIfPrime(newNumb)){
                            writer.write("\n"+(String.valueOf(newNumb)));
                            System.out.println("Prime number added");
                        }else
                        System.out.println(newNumb +" is not a prime number");

                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }while(newNumb != 0);
        }
    }

    /**
     * Method to find if there are numbers in text file
     * @param f is the file
     * @return either 0 or number
     * @throws FileNotFoundException
     */
    public static int confirmLastNum(File f) throws FileNotFoundException {
        String text;
        int number = 0;
        try(BufferedReader reader = new BufferedReader(new FileReader(f))){
            while ((text = reader.readLine()) != null) {
                number = Integer.parseInt(text);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        if(number != 0){
            return number;
        }
        return 0;
    }

    /**
     * Confirm if number is prime
     * @param num
     * @return
     */
    public static boolean confirmIfPrime(int num){
        int div;
        int counter = 0 ;
        for (int i = 1; i <= num / 2; ++i) {
            div= num % i;
            if(div==0){
                counter++;}
        }
        if(counter <= 2)
            return true;
        return false;
    }
}
