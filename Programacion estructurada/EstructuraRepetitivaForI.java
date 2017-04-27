import java.util.Scanner;

/**Desarrollar un programa que solicite la carga de 10 números e imprima la suma de los últimos 5 valores ingresados.  */

public class EstructuraRepetitivaForI{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite 10 numeros");
        int suma =0;
        
        for(int i = 1; i<=10;i++){
 
            int numeroUsuario = sc.nextInt();
            
            if(i>5){
                
                suma = suma+numeroUsuario;
            }
        }
        System.out.println("La suma de los 5 numero es -> "+suma);
    }
}