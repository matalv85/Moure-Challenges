package Reto_3;

public class Main {

    /*
     * Enunciado: Escribe un programa que se encargue de comprobar si un número es o no primo.
     * Hecho esto, imprime los números primos entre 1 y 100.
     */
    public static void main(String []args){
        for(int i = 1; i <= 100; i++){
            if(esPrimo(i))
                System.out.println("El numero " + i + " es primo");
        }
    }

    public static boolean esPrimo(int numero){
        if(numero < 2 || numero % 2 == 0){
            return false;
        }

        for(int i = 3; i < (numero / 2); i = i + 2){
            if(numero % i == 0){
                return false;
            }
        }
        return true;
    }
}
