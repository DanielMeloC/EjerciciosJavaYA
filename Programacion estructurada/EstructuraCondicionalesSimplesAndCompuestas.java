/**
 * Realizar un programa que lea por teclado dos números, si el primero es mayor al segundo informar su suma y diferencia, 
 * en caso contrario informar el producto y la división del primero respecto al segundo.
*/
import java.util.*;

public class EstructuraCondicionalesSimplesAndCompuestas{

    public static void main(String[] argumentos){

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce  el primer numero Entero");
        double primerNumero = sc.nextDouble();
        System.out.println("Introduce  el segundo numero Entero");
        double segundoNumero = sc.nextDouble();

        if(primerNumero>segundoNumero){

            System.out.println("La suma del primer numero "+(int)primerNumero+" y el segundo numero "+(int)segundoNumero+" es -> "+(int)(primerNumero+segundoNumero));
            System.out.println("La diferencia del primer numero "+(int)primerNumero+" y el segundo numero "+(int)segundoNumero+" es -> "+(int)(primerNumero-segundoNumero));

        }else if(primerNumero<segundoNumero){
            System.out.println("El producto del primer numero "+(int)primerNumero+" y el segundo numero "+(int)segundoNumero+" es -> "+(int)(primerNumero*segundoNumero));
            System.out.print("La división del primer numero "+(int)primerNumero+" y el segundo numero "+(int)segundoNumero+" es -> ");
            System.out.printf("%1.2f",primerNumero/segundoNumero);
        }


    }
}