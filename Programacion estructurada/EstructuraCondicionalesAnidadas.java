/**
 * Se ingresa por teclado un valor entero, mostrar una leyenda que indique si el número es positivo, nulo o negativo. 
 */

import java.util.*;

public class EstructuraCondicionalesAnidadas{

    public static void main(String[] argumentos){

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa cualquier numero, por favor");
        int numero = sc.nextInt();

        if(numero>=1){
            System.out.println("Este numero "+numero+" es positivo");
        }else if(numero==0){
            System.out.println("Este numero "+numero+" es nulo");
        }else if(numero<0){
            System.out.println("Este numero "+numero+" es negativo");
        }
        
    }

} 