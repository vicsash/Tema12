package com.victorsashnev.tema12.Lib;

import java.util.HashMap;
import java.util.Random;

public class HashMapUtilities<K,V,T,R> {
    static Random rand = new Random();
    private int randomNumeber(int max, int min){
        int numb;
        return numb= rand.nextInt(max- min + 1) + min;
    }
    private double randomNumeberDouble(double max, double min){
        double numb;
        return numb= rand.nextDouble()*max+min;
    }
}
