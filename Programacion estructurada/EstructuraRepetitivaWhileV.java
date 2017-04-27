/**Realizar un programa que permita cargar dos listas de 15 valores cada una. Informar con un mensaje cual de las dos listas tiene un 
 * valor acumulado mayor (mensajes "Lista 1 mayor", "Lista 2 mayor", "Listas iguales") Tener en cuenta que puede haber dos o más estructuras 
 * repetitivas en un algoritmo.  */
import java.util.Scanner;

public class EstructuraRepetitivaWhileV{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Inserte 15 valores a la primera lista");
        int primerLista =0;
        int contadorListaUno =0;
        int contadorListaDos  =0;
        int sumaListaUno =0;
        int sumaListaDos =0;

        while(contadorListaUno < 15){
            contadorListaUno +=1;
            System.out.print((contadorListaUno)+".  <-- ");
            primerLista= sc.nextInt();
            sumaListaUno=sumaListaUno+primerLista;
        }

        System.out.println();
        System.out.println("Inserte 15 valores a la segunda lista");

        while(contadorListaDos < 15){
            contadorListaDos +=1;
            System.out.print((contadorListaDos)+".  <-- ");
            primerLista= sc.nextInt();
            sumaListaDos=sumaListaDos+primerLista;
        }

        System.out.println();
        if(sumaListaUno>sumaListaDos){
            System.out.println("La lista que mas valores acumulado tiene es  ---> Lista Uno");
        }else if(sumaListaDos>sumaListaUno){
            System.out.println("La lista que mas valores acumulado tiene es  ---> Lista Dos");
        }else{
            System.out.println("Las listas tienen mismo valores acuumlados");
        }

        System.out.println();
        System.out.println("Suma primera lista -> "+sumaListaUno);
        System.out.println("Suma segunda lista -> "+sumaListaDos);

    }
}