/**
 * Confeccionar un programa que permita cargar un número entero positivo de hasta tres cifras y muestre un mensaje
 * indicando si tiene 1, 2, o 3 cifras. Mostrar un mensaje de error si el número de cifras es mayor. 
 */
import java.util.*;

public class EstructuraCondicionalesAnidadasI{

    public static void main(String[] argumentos){

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese un numero de hasta 3 cifras, por favor");
        int numero = sc.nextInt();

        if(numero <=9){
            System.out.println("El numero que ingresaste es de una cifra");
        }else if(numero <=99){
            System.out.println("El numero que ingresaste es de dos cifras");
        }else if(numero<=999){
            System.out.println("El numero que ingresaste es de tres cifras");
        }else{
            System.out.println("Error! el numero que ingresaste -> "+numero+" tiene más de 3 cifras es mayor!");
        }
    }
}