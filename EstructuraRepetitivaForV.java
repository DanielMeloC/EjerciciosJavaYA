/**Escribir un programa que pida ingresar coordenadas (x,y) que representan puntos en el plano.
 * Informar cuántos puntos se han ingresado en el primer, segundo, tercer y cuarto cuadrante. Al comenzar el programa se pide que se 
 * ingrese la cantidad de puntos a procesar.*/
import java.util.Scanner;
public class EstructuraRepetitivaForV{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de puntos(x y) a procesar");
        int numeroUsuario = sc.nextInt();
        int contadorUsuario =0;
        int contadorCuadranteUno =0;
        int contadorCuadranteDos =0;
        int contadorCuadranteTres =0;
        int contadorCuadranteCuatro =0;

        System.out.println();
        System.out.println("-------------------------------------");
        for(int i=0; i<numeroUsuario;i++){
            System.out.println((contadorUsuario+1)+".)"+" Pareja de coordenadas ");
            System.out.println();
            System.out.print("Ingrese coordenada X -> ");
            int puntoX = sc.nextInt();
            System.out.print("Ingrese coordenada Y -> ");
            int puntoY = sc.nextInt();
            System.out.println("-------------------------------------");
            
            contadorUsuario+=1;

            if(puntoX>0&&puntoY>0){
                contadorCuadranteUno+=1;
            }else if(puntoX<0&&puntoY>0){
                contadorCuadranteDos+=2;
            }else if(puntoX<0&&puntoY<0){
                contadorCuadranteTres+=1;
            }else{
                contadorCuadranteCuatro+=1;
            }
        }   

        System.out.println("Total puntos ingresados en el cuadrante uno    -> "+contadorCuadranteUno);
        System.out.println("Total puntos ingresados en el cuadrante dos    -> "+contadorCuadranteDos);
        System.out.println("Total puntos ingresados en el cuadrante tres   -> "+contadorCuadranteTres);
        System.out.println("Total puntos ingresados en el cuadrante cuatro -> "+contadorCuadranteCuatro);
    }
}