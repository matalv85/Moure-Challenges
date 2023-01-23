package Reto_6;

public class Main {
    public static void main(String []args){
        String palabra = "Reversando palabras challenge";
        System.out.println("Palabra original: " + palabra);
        System.out.println("Palabra reversada: " + reverseWord(palabra));
    }

    public static String reverseWord(String palabra){
        char []reversedArray = palabra.toCharArray();
        String reversedWord = "";
        for(int i = palabra.length() - 1; i >= 0; i--){
                reversedWord = reversedWord + palabra.charAt(i);
        }
        return reversedWord;
    }
}
