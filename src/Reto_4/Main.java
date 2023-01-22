package Reto_4;

public class Main {

    /*
     * Enunciado: Crea UNA ÚNICA FUNCIÓN (importante que sólo sea una) que sea capaz de calcular y retornar el área de un polígono.
     * - La función recibirá por parámetro sólo UN polígono a la vez.
     * - Los polígonos soportados serán Triángulo, Cuadrado y Rectángulo.
     * - Imprime el cálculo del área de un polígono de cada tipo.
     */
    public static void main(String []args){

        System.out.println("El area del triangulo es: " + mostrarArea(new Triangulo(4,9)));
        System.out.println("El area del cuadrado es: " + mostrarArea(new Cuadrado(8)) );
        System.out.println("El area del rectangulo es: " + mostrarArea(new Rectangulo(4,8)));
    }

    public static double mostrarArea(Poligono poligono){
        return poligono.calcularArea();
    }
}
