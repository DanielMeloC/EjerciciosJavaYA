import java.util.Scanner;

/**Realizar un programa que acumule (sume) valores ingresados por teclado hasta ingresar el 9999 (no sumar dicho valor, indica 
 * que ha finalizado la carga). Imprimir el valor acumulado e informar si dicho valor es cero, mayor a cero o menor a cero */

public class EstructuraRepetitivaDoWhile{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int sumaValor =0 ;
        int numeroUsuario;

        do{
            System.out.println("Digite un numero");

            numeroUsuario = sc.nextInt();

            if(numeroUsuario!=9999){
                
                sumaValor = sumaValor + numeroUsuario;
            }

        }while(numeroUsuario!=9999);
        if(sumaValor==0){
            System.out.println("El valor acumulado es igual a cero -> "+ sumaValor+" <- Valor acumulado");
        }else if(sumaValor>0){
            System.out.println("El valor acumulado es mayor a cero -> "+sumaValor+"  <- Valor acumulado");
        }else{
            System.out.println("El valor acumulado es menor a cero  -> "+sumaValor+"  <- Valor acumulado");
        }

    }
}