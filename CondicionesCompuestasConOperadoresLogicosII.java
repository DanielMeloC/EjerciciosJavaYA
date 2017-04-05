/**Se ingresan por teclado tres números, si todos los valores ingresados son menores a 10,
 * imprimir en pantalla la leyenda "Todos los números son menores a diez". 
 */
import java.util.Scanner;
public class CondicionesCompuestasConOperadoresLogicosII{

    public static void main(String[] argumentos){

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        int primerNumero = sc.nextInt();
        System.out.println("Ingrese un numero");
        int segundoNumero = sc.nextInt();
        System.out.println("Ingrese un numero");
        int tercerNumero = sc.nextInt();

        if(primerNumero < 10 && segundoNumero <10 && tercerNumero <10 ){
            
            System.out.println("Todos lo numeros son menores que 10");
    
        }else{
            System.out.println("Eso es todo, intenta insertar 3 numeros menores que 10 :D");
        }
    }
}