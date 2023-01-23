package Reto_8;

public class Main {
    public static void main(String []args){
        long numero = 152367;
        //9651 --> 10010110110011
        System.out.println("El binario de " + numero + " es " + decimalABinario(numero));

    }

    public static String decimalABinario(long numero){
        String numeroBinario = "";
        long decimal = numero;

        while(decimal > 0){
            int resto = (int) (decimal % 2);
            decimal = decimal / 2;
            numeroBinario = String.valueOf(resto) + numeroBinario;
        }

        return numeroBinario;
    }
}
