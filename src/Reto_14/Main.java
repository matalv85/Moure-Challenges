package Reto_14;

public class Main {
    public static void main(String []args){
        System.out.println(isArmstrongNumber(407));
    }

    private static boolean isArmstrongNumber(int numero) {
        int potencia = String.valueOf(numero).length();
        int resultado = 0;
        char []numeros = String.valueOf(numero).toCharArray();

        for (char c : numeros) {
            resultado += Math.pow(Character.getNumericValue(c), potencia); 
            
        }

        return numero == resultado;
        
    }
}