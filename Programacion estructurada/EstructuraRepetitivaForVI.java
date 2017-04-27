import java.util.Scanner;

/** Se realiza la carga de 10 valores enteros por teclado. Se desea conocer:
 * a) La cantidad de valores ingresados negativos.
 * b) La cantidad de valores ingresados positivos.
 * c) La cantidad de múltiplos de 15.
 * d) El valor acumulado de los números ingresados que son pares. */

public class EstructuraRepetitivaForVI{
    public static void main(String[] args) {

        int contadorPositivos=0;
        int contadorNegativos =0;
        int contadorMultiplos=0;
        int sumamultiplo=0;
        int multiplosnuevo=0;
        int acumuladoPares=0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese 10 numeros, por favor");

        for(int i =1; i<=10; i++){
            
            int  numeroUsuario = sc.nextInt();      
            sumamultiplo = numeroUsuario/15;
            multiplosnuevo=sumamultiplo*15;

            if(numeroUsuario>=1){
                contadorPositivos+=1;
            }

            if(sumamultiplo>=1 && multiplosnuevo==numeroUsuario){
               contadorMultiplos+=1;
            }else if(numeroUsuario<0){
                contadorNegativos+=1;
            }
             if (numeroUsuario%2==0&&numeroUsuario>1){
                acumuladoPares = acumuladoPares+numeroUsuario;
            }
            
            
            
        }
       

        System.out.println("Cantidad numeros negativos -> "+contadorNegativos);
        System.out.println("Cantidad numeros positivos -> "+contadorPositivos);
        System.out.println("Cantidad multiplos de 15   -> "+contadorMultiplos);
        System.out.println("Acumulado de numeros pares -> "+acumuladoPares);
        
    }
}