/**Desarrollar un programa que permita cargar n números enteros y luego nos informe cuántos valores fueron pares y cuántos impares.
Emplear el operador ?%? en la condición de la estructura condicional:

	if (valor%2==0)         //Si el if da verdadero luego es par.
 */
import java.util.Scanner;
public class EstructuraRepetitivaWhileVI{
    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);
        System.out.print("Digite cantidad de numeros a insertar ");
        int cantidadNumeros= sc.nextInt();
        int contador =0;
        int contadorPares =0;
        int contadorImpares=0;

        System.out.println();
        while(contador < cantidadNumeros){
            System.out.print((contador+1)+". Digita numero -> ");
            int numeroInsertado = sc.nextInt();
            contador +=1;
            if(numeroInsertado%2==0){
                contadorPares+=1;
            }else{
                contadorImpares +=1;
            }
        } 
        System.out.println();
        System.out.println("Cantidad de numero pares   --> "+ contadorPares);
        System.out.println("Cantidad de numero Impares --> "+ contadorImpares);
    }
}