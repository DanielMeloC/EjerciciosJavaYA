/**Desarrollar un programa que muestre la tabla de multiplicar del 5 (del 5 al 50) */

public class EstructuraRepetitivaForII{
    public static void main(String[] args) {
        System.out.println("Tabla del 5");
        
        for(int i=1; i<=10;i++){

            int tablaMultiplicacionCinco = 5;

            tablaMultiplicacionCinco =5*i;

            System.out.println("5 * "+i+" = "+tablaMultiplicacionCinco);
        }
    }
}

