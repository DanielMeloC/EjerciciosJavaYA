/**Escribir un programa que pida ingresar la coordenada de un punto en el plano, es decir dos valores enteros x e y (distintos a cero).
 * Posteriormente imprimir en pantalla en que cuadrante se ubica dicho punto. (1º Cuadrante si x > 0 Y y > 0 , 2º Cuadrante: x < 0 Y y > 0, etc.) 
 */
import java.util.Scanner;

import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

public class CondicionesCompuestasConOperadoresLogicosIV{
     public static void main(String[] argumentos){

        Scanner sc = new Scanner(System.in);
        System.out.println("Inserte coordenada x");
            int x = sc.nextInt();
            System.out.println("Inserte coordenada y");
            int y = sc.nextInt();
        
        if(x!=0 && y!=0){
            if(x>0 && y>0){

                System.out.println("Las coordenadas se encuentra en el cuadrante -> I");

            }else if(x<0 && y>0){

                System.out.println("Las coordenadas se encuentra en el cuadrante -> II");

            }else if(x<0 && y<0){

                System.out.println("Las coordenadas se encuentra en el cuadrante -> III");

            }else if(x>0 && y<0){

                System.out.println("Las coordenadas se encuentra en el cuadrante -> IV");

            }

         }else{
             System.out.println("Por favor inserte coordenadas distintas a cero");
         }
     }
}