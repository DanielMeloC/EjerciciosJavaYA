
/**
 * Se debe desarrollar un programa que pida el ingreso del precio de un artículo y la cantidad que lleva el cliente.
 Mostrar lo que debe abonar el comprador
 */

import java.util.*;

public class EstructuraDeProgramacionSecuencial{

    public static void main(String[] argumentos){

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el precio del articulo");
        int articulo = sc.nextInt();
        System.out.println("Ingrese la cantidad que desea llevar el cliente");
        int cantidadArticulo = sc.nextInt();
        System.out.println("Total a pagar el cliente es -> "+articulo*cantidadArticulo);



    }
}