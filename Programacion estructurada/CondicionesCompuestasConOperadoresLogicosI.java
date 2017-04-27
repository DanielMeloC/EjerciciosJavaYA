import java.util.Scanner;

/**Se ingresan tres valores por teclado, si todos son iguales se imprime la suma del primero con el segundo 
 * y a este resultado se lo multiplica por el tercero */

public class CondicionesCompuestasConOperadoresLogicosI{

    public static void main(String[] argumentos){

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        int primerNumero = sc.nextInt();
        System.out.println("Ingrese un numero");
        int segundoNumero = sc.nextInt();
        System.out.println("Ingrese un numero");
        int tercerNumero = sc.nextInt();

        if(primerNumero == segundoNumero && segundoNumero==tercerNumero ){
            
            System.out.println("Los 3 numeros son iguales por tanto se sumaran los dos primeros numeros y multiplicado por el ultimo numero");
            System.out.println("Su resultado es -> "+ ((primerNumero+segundoNumero)*tercerNumero));
        }else{
            System.out.println("Gracias eso es todo, pero intenta insertar 3 numeros iguales :D");
        }


    }
}