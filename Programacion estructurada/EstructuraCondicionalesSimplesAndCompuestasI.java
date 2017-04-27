/**
 * Se ingresa por teclado un número positivo de uno o dos dígitos (1..99) mostrar un mensaje indicando si el número tiene uno o dos dígitos.
 * (Tener en cuenta que condición debe cumplirse para tener dos dígitos, un número entero) 
 */
import java.util.*;

public class EstructuraCondicionalesSimplesAndCompuestasI{

    public static void main(String[] argumentos){

        Scanner sc = new Scanner(System.in);
        System.out.println("inserte un numero Entero entre 0 .. 99");
        int numero = sc.nextInt();

        if(numero<=9){
            System.out.println("El numero que ingresaste tiene un dígito");
        }else{
            System.out.println("El numero que ingresaste tiene dos dígitos");
        }
    }
}