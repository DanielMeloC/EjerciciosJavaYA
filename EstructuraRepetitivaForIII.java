/**Confeccionar un programa que permita ingresar un valor del 1 al 10 y nos muestre la tabla de multiplicar del mismo 
 * (los primeros 12 términos) Ejemplo: Si ingreso 3 deberá aparecer en pantalla los valores 3, 6, 9, hasta el 36.  */
import java.util.Scanner;

public class EstructuraRepetitivaForIII{

    public static void main(String[] args) {
        System.out.println("Escriba la tabla de mutiplicar que deseas calcular");

        Scanner sc = new Scanner(System.in);
        int numeroTabla = sc.nextInt();
        System.out.println("Tabla de multiplicacion del -> "+numeroTabla);
        int tabla=0;

        for(int i=1; i<=12 ; i++){
            tabla =numeroTabla*i;    
            System.out.println(numeroTabla+" * "+i+" = "+tabla);
        }
    }
}