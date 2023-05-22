package com.victorsashnev.tema12.Lib;

import java.util.Random;

public class MatrixUtilities<T,R> {
    static Random rand = new Random();
    public static int randomNumeber(int max, int min){
        int numb;
        return numb= rand.nextInt(max- min + 1) + min;
    }
    public static double randomNumeberDouble(double max, double min){
        double numb;
        return numb= rand.nextDouble()*max+min;
    }
     public static int confirmIfelementExists(Object[][] R, Object T){
            for (int i = 0; i < R.length;i++){
                for (int j = 0; j < R[i].length;j++){
                    if(R[i][j].equals(T)){
                        return 1;
                    }
                }
            }
        return -1;
     }

     public static String printOutMatrix(Object[][] R){
        StringBuilder sb = new StringBuilder();
         for (int i = 0; i < R.length;i++){
             for (int j = 0; j < R[i].length;j++){
                sb.append(R[i][j]);
             }
         }
         return sb.toString();
     }
}
