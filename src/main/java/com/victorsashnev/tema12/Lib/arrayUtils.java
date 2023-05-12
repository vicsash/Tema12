package com.victorsashnev.tema12.Lib;

import java.util.Random;

public class arrayUtils {
    static Random rand = new Random();
    public static int randomNumeber(int max, int min){
        int numb;
        return numb= rand.nextInt(max- min + 1) + min;
    }
    public static double randomNumeberDouble(double max, double min){
        double numb;
        return numb= rand.nextDouble()*max+min;
    }

    public static String printOutArray(int [] aray ){
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < aray.length;i++ ) {
            sb.append(aray[i]).append("-");
        }
        return sb.toString();
    }

    public static String visualitzarPosNum(int[] vector, int pos){
        int count=0;
        StringBuilder sb = new StringBuilder();
        for(int i=0;i< vector.length;i++){
            if(vector[i] % pos ==0){
                sb= sb.append(vector[i]).append(" posicion ").append(count);
                sb.append("\n");
            }
            count++;
        }
        return sb.toString();
    }
    public static int[] fillArrayRandomInt(int[] aray, int MAX, int MIN){
        Random rand = new Random();

        for(int i=0; i<aray.length;i++){

            aray[i] = rand.nextInt(MAX-MIN+1)+MIN;
        }
        return aray;
    }
    public static Double[] fillArrayRandomDouble(Double[] aray, Double MAX, Double MIN){
        Random rand = new Random();
        for(int i=0; i<aray.length;i++){
            aray[i] = randomNumeberDouble(MAX,MIN);
        }
        return aray;
    }

    public static int searchIfReferenceInArray(int refence,int counter, int []aray){
        for(int i = 0; i < counter; i++){
            if( refence == aray[i]){
                return 1;
            }
        }
        return  -1;
    }

    public static int searchIfStringInArray(String refence,int counter, int []aray){
        for(int i = 0; i < counter; i++){
            String search = String.valueOf(aray[i]);
            if( refence.equalsIgnoreCase(search)){
                return 1;
            }
        }
        return  -1;
    }

}