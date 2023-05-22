package com.victorsashnev.tema12.Lib;

public class StringUtilities {
    public static String firstLetterUpper(String a) {
        //creating substring for getting first letter
        //+ a.subsring(1) is to genereate the rest of the string
        String s=a.substring(0,1).toUpperCase()+a.substring(1);
        return s;
    }
    public static int vocals(String s){
        int numVocales=0;
        String vocales="aáàeéèiíìoóòuúù";
        s=s.toLowerCase();
        //Loop  to get the vocals
        for(int i=0; i < s.length();i++){
            String c = String.valueOf(s.charAt(i));
            if (vocales.contains(c)){
                numVocales++;
            }
        }
        return numVocales ;
    }
    public static int consonants(String s){
        int numconsonants=0;
        String consonants="bcdfghjklmnñpqrstvwxyz";
        s=s.toLowerCase();
        //Loop te get the consonants
        for(int i=0; i < s.length();i++){
            String c = String.valueOf(s.charAt(i));
            if (consonants.contains(c)){
                numconsonants++;
            }

        }
        return numconsonants ;
    }
    public static String longestWord(String texto){
        texto.trim();
        String masLarga="";
        String[] palabras= texto.split("\\s+");
        for(int i = 0; i < palabras.length; i++){
            if(palabras[i].length()> masLarga.length()){
                masLarga=palabras[i];
            }
        }
        return masLarga;
    }
    public static String oneLineWord(String a){
        a=a.trim();
        StringBuilder sb = new StringBuilder();
        String[]lineWord= a.split("\\s+");
        for(String palabra : lineWord){
            sb.append(palabra).append("\n");
        }
        return sb.toString();
    }
    public static String letterOddPos(String frase){
        frase =frase.trim();
        String[]lineWord= frase.split("\\s+");
        StringBuilder sb = new StringBuilder();
        for(String palabra : lineWord){

            for(int i=0; i < palabra.length();i++){
                String c = String.valueOf(palabra.charAt(i));
                if (!((i%2==0))){
                    sb.append(c);
                }
            }
            sb.append("\n");
        }
        return sb.toString() ;
    }
    public static String eliminarAcentos(String texto){
        String origen="áàéèíìóòúù";
        String destino="aaeeiioouu";
        for(int i = 0; i < origen.length(); i++){
            texto = texto.replace(origen.charAt(i), destino.charAt(i));
        }
        return texto;
    }
    public static String replaceLetters( String s, String select, String replace){
        String line;
        line=s.replaceAll(select,replace);
        return line;
    }
    public static String subsituteNumbers( String s, String replace){
        String line;
        line=s.replaceAll("\\d",replace);
        return line;
    }
    public static String letterPosOdd(String s){
        StringBuilder sb = new StringBuilder();
        for(int i=0; i < s.length();i++){
            if (!(i%2==0)){
                sb.append(s.charAt(i));
            }
        }
        return sb.toString();
    }
    public static String letterPosEven(String s){
        StringBuilder sb = new StringBuilder();
        for(int i=0; i < s.length();i++){
            if (i%2==0){
                sb.append(s.charAt(i));
            }
        }
        return sb.toString();
    }
}
