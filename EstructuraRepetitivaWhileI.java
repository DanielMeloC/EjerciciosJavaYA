/** Se ingresan un conjunto de n alturas de personas por teclado. Mostrar la altura promedio de las personas*/

import java.util.Scanner;
public class EstructuraRepetitivaWhileI{

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de personas que desea insertar");
        int cantidadPersonas = sc.nextInt();
        int contador = 0;
        float suma =0f;
       
        while(contador<cantidadPersonas){
            System.out.println("Ingrese la altura de la persona -> "+(contador+1));
            float altura = sc.nextInt();
            contador +=1;
            suma = suma+ altura;
        }

        System.out.print("Promedio altura de las "+cantidadPersonas+" personas -> ");
        System.out.printf("%1.2f",suma/cantidadPersonas);
    }
}