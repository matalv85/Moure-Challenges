package Reto_10;

import java.util.ArrayList;
import java.util.HashMap;

    /*
     * Enunciado: Crea un programa que comprueba si los paréntesis, llaves y corchetes de una expresión están equilibrados.
     * - Equilibrado significa que estos delimitadores se abren y cieran en orden y de forma correcta.
     * - Paréntesis, llaves y corchetes son igual de prioritarios. No hay uno más importante que otro.
     * - Expresión balanceada: { [ a * ( c + d ) ] - 5 }
     * - Expresión no balanceada: { a * ( c + d ) ] - 5 }
     */
public class Main {
    public static void main(String []args){

        String textToCheck = "{ a * ( c + d ) ] - 5 }";

        if(isBalanced(textToCheck)) {
            System.out.println("Balanced text");
        } else {
            System.out.println("Not balanced text");
        }

    }

    public static boolean isBalanced(String textToCheck) {
        HashMap<String, String> symbolRelation = new HashMap<>();
        symbolRelation.put(")", "(");
        symbolRelation.put("]", "[");
        symbolRelation.put("}", "{");

        ArrayList<String> stack = new ArrayList<>();

        for(int i = 0; i < textToCheck.length(); i++) {
            String word = String.valueOf(textToCheck.charAt(i));

            if (symbolRelation.containsValue(word)) {
                stack.add(word);

            } else if (symbolRelation.containsKey(word)) {

                if(stack.isEmpty())
                    return false;

                if (symbolRelation.get(word).equals(stack.get(stack.size() - 1))) {
                    stack.remove(stack.size() - 1);

                } else {
                    return false;

                }
            }
        }
        return  stack.isEmpty();
    }
}
