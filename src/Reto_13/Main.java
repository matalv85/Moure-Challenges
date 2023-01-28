package Reto_13;

/*
 * Enunciado: Escribe una función que calcule y retorne el factorial de un número dado de forma recursiva.
 */
public class Main {
    public static void main(String []args){
        System.out.println(factorial(10));
    }

    private static long factorial(long numero) {
        if(numero <= 0){
            return 0;
        } else if(numero == 1){
            return numero;
        } else {
            return numero * factorial(numero - 1);
        }

    }    
}
