/**Escribir un programa en el cual: dada una lista de tres valores numéricos distintos se calcule e informe su rango de variación 
 * (debe mostrar el mayor y el menor de ellos)  */

import java.util.Scanner;

public class CondicionesCompuestasConOperadoresLogicosVI{

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Escriba un numero ");
        int primerNumero = sc.nextInt();
        System.out.print("Escriba un numero ");
        int segundoNumero = sc.nextInt();
        System.out.print("Escriba un numero ");
        int tercerNumero = sc.nextInt();

        if(segundoNumero<primerNumero&&segundoNumero<tercerNumero&&tercerNumero>primerNumero){
            System.out.println("Rango:"+segundoNumero+" - "+tercerNumero);
        }else if(tercerNumero<primerNumero&&tercerNumero<segundoNumero&&segundoNumero<primerNumero){
            System.out.println("Rango:"+tercerNumero+" - "+primerNumero);
        } else if(primerNumero<segundoNumero && primerNumero<tercerNumero && tercerNumero<segundoNumero){
            System.out.println("Rango:"+primerNumero+" - "+segundoNumero);
        }else {
            System.out.println("Rango:"+tercerNumero+" - "+segundoNumero);
        }
    }
}