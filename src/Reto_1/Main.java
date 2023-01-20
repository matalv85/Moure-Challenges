package Reto_1;

import java.util.Arrays;

public class Main {
    public static void main(String []args){
        String palabra1 = "New York Times";
        String palabra2 = "monkeys write";

        if(esUnAnagrama(palabra1, palabra2)){
            System.out.println("Es un anagrama");
        } else {
            System.out.println("No es un anagrama");
        }
    }

    private static boolean esUnAnagrama(String palabra1, String palabra2) {
        char []arrayPalabra1 = palabra1.toLowerCase().toCharArray();
        char []arrayPalabra2 = palabra1.toLowerCase().toCharArray();

        Arrays.sort(arrayPalabra1);
        Arrays.sort(arrayPalabra2);

        if(Arrays.equals(arrayPalabra1, arrayPalabra2)){
            return true;
        }

        return false;
    }
}
