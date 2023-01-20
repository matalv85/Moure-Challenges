package Reto_0;

public class Main {
    public static void main(String []args){
        for (int i = 0; i < 100; i++){
            if(divisiblePorTres(i) && divisiblePorCinco(i)){
                System.out.println("fizzbuzz");
            } else if(divisiblePorTres(i)){
                System.out.println("fizz");
            } else if(divisiblePorCinco(i)){
                System.out.println("buzz");
            } else{
                System.out.println(i);
            }
        }
    }

    public static  boolean divisiblePorTres(int numero){
        return (numero % 3 == 0);
    }

    public static boolean divisiblePorCinco(int numero){
        return (numero % 5 == 0);
    }
}