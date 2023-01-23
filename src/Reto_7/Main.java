package Reto_7;

import java.util.HashMap;

public class Main {
    /*
     * Enunciado: Crea un programa que cuente cuantas veces se repite cada palabra y que muestre el recuento final de todas ellas.
     * - Los signos de puntuación no forman parte de la palabra.
     * - Una palabra es la misma aunque aparezca en mayúsculas y minúsculas.
     * - No se pueden utilizar funciones propias del lenguaje que lo resuelvan automáticamente.
     */
    public static void main(String []args){
        String words = "Hola, mi nombre es brais. Mi nombre completo es Brais Moure (MoureDev).";
        contarPalabras(words);
    }

    public static void contarPalabras(String words){
        HashMap<String, Integer> contadorPalabras = new HashMap<String, Integer>();

        //Saco los signos de puntuacion y paso string a minusculas
        String normalizedWords = words.toLowerCase().replaceAll("\\p{Punct}", "");
        //genero un array con las palabras
        String []arrayWords = normalizedWords.split(" ");

        //recorro el array para contar las palabras actualizando el mapa
        for(String word: arrayWords){
            if(contadorPalabras.containsKey(word)){
                contadorPalabras.compute(word, (key, value) -> value = value + 1);
            } else {
                contadorPalabras.put(word, 1);
            }
        }

        //muestro values del mapa
        contadorPalabras.entrySet().forEach(System.out::println);
    }
}
