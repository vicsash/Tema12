package com.victorsashnev.tema12.Lib;

import java.util.Random;

public class ArrayUtilities <T,R>{
    static Random rand = new Random();
    private static int randomNumeber(int max, int min){
        int numb;
        return numb= rand.nextInt(max- min + 1) + min;
    }
    public static double randomNumeberDouble(double max, double min){
        double numb;
        return numb= rand.nextDouble()*max+min;
    }

    private static String printOutArray(int [] aray ){
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < aray.length;i++ ) {
            sb.append(aray[i]).append("-");
        }
        return sb.toString();
    }

    public static String visualitzarPositionOfNumber(int[] vector, int pos){
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

    public static int searchIfReferenceInArray(Object T[],Object R){
        for(int i = 0; i <T.length ; i++){
            if(T[i].equals(R)){
                return 1;
            }
        }
        return  -1;
    }

    public static int[] arrayAdition(int[] aray, int[] arayTwo) {
        final int SIZE=10;
        int sum[]= new int[SIZE];

        for (int i = 0; i < sum.length;i++){

            sum[i]= (aray[i]) + (arayTwo[i]);
        }

        return sum;

    }

    public static int[] arrayMult(int[] aray, int[] arayTwo) {
        final int SIZE=10;
        int mult[]= new int[SIZE];
        for (int i = 0; i < mult.length;i++){

            mult[i]= (aray[i]) * (arayTwo[i]);
        }


        return mult;

    }

    public static int[] makeArayWithElementsAbove(int[] aray, int numb){
        for(int i=0; i<aray.length;i++){
            if(aray[i]>numb){
                aray[i]=aray[i];
            }else{
                aray[i]=0;
            }
        }
        return aray;
    }

    public static int[] inverseArray(int[] aray){
        int [] inverse=new int[aray.length];
        int arayPlace = 0;
        for(int i = aray.length - 1   ; i  >= 0 ; i--){
            inverse[arayPlace]=aray[i];
            arayPlace++;
        }
        return inverse;
    }
    public static String printArrayWithSpecificString(String c, int counter,int [] aray) {
        counter = 0;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < aray.length; i++) {
            String text = String.valueOf(aray[i]);
            if (c.equalsIgnoreCase(text)) {
                sb.append(aray[i]).append("\n");
                counter++;
            }
            if (counter == 0)
                sb.append("No existe");
        }
        return sb.toString();
    }

    public static String printArrayWithSpecificInt(int numb, int counter,int [] aray) {
        counter = 0;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < aray.length; i++) {
            if (numb == aray[i]) {
                sb.append(aray[i]).append("\n");
                counter++;
            }
            if (counter == 0)
                sb.append("No existe");
        }
        return sb.toString();
    }

}
