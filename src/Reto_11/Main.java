package Reto_11;

/*
 * Enunciado: Crea una función que reciba dos cadenas como parámetro (str1, str2) e imprima otras dos cadenas como salida (out1, out2).
 * - out1 contendrá todos los caracteres presentes en la str1 pero NO estén presentes en str2.
 * - out2 contendrá todos los caracteres presentes en la str2 pero NO estén presentes en str1.
 */

public class Main {
    public static void main(String []args){
        printIguales("brais","moure");
    }

    public static void printIguales(String str1, String str2){
        System.out.println(findNonCommon(str1, str2));
        System.out.println(findNonCommon(str2, str1));
    }

    private static String findNonCommon(String str1, String str2) {
        String norm1 = str1.toLowerCase();
        String norm2 = str2.toLowerCase();
        String nonCommon = "";

        for(int i = 0; i < norm1.length(); i++){
            if(!norm2.contains(String.valueOf(norm1.charAt(i)))){
                nonCommon += norm1.charAt(i);
            }
        }

        return nonCommon;

    }

}