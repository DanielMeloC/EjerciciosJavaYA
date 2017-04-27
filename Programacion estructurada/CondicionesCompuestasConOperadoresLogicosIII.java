/**Se ingresan por teclado tres números, si al menos uno de los valores ingresados es menor a 10, imprimir en pantalla la leyenda 
 * "Alguno de los números es menor a diez". 
 */
import java.util.Scanner;
public class CondicionesCompuestasConOperadoresLogicosIII{

    public static void main(String[] argumentos){

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        int primerNumero = sc.nextInt();
        System.out.println("Ingrese un numero");
        int segundoNumero = sc.nextInt();
        System.out.println("Ingrese un numero");
        int tercerNumero = sc.nextInt();

        if(primerNumero < 10 || segundoNumero < 10 ||tercerNumero <10 ){
            
            System.out.println("Alguno de los numeros son menores a diez");
    
        }else{
            System.out.println("Eso es todo, intenta insertar 1 numero menor que 10 :D");
        }
    }
}