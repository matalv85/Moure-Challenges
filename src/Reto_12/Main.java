package Reto_12;

import java.text.Normalizer;

public class Main {
    public static void main(String []args){
        String word = "LA MAR. Ah! El anís es azul al ocaso. Claro, la canícula hará mal. Alejábase bello sol. ¡Sumerge la usada roda! A remar. ¡A La Habana, bucanero Morgan! Oleaje de la mar… ¡Al remo! ¡Corre! Playas… Ay, al perro comer la rama le deja el onagro, morena cubana. ¡Bah! A la ramera adorada su alegre muslo Sol le besa. ¡Bajel a la mar! ¡Ah! Alucina calor al cosaco. La luz asesina le hará mal.";
        if(isPalindrome(word)){
            System.out.println("Es un palindromo");
        } else {
            System.out.println("No es un palindromo");
        }
    }

    private static boolean isPalindrome(String word){
        String normString = Normalizer.normalize(word, Normalizer.Form.NFD) // Normalizo el string
                            .toLowerCase()                                  // paso a minusculas
                            .replaceAll("[^a-z]", "");                      // elimino los que no sean caracteres
        
        return normString.equals(new StringBuilder(normString).reverse().toString());
    }
    
}
