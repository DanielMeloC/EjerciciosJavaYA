//Realizar un programa que pida cargar una fecha cualquiera, luego verificar si dicha fecha corresponde a Navidad
import java.util.*;

public class CondicionesCompuestasConOperadoresLogicos{

    public static void main(String[] argumentos){

        Scanner sc = new Scanner(System.in);
        System.out.println("Inserte el dia del mes de Diciembre");
        int numeroMes = sc.nextInt();

        if(numeroMes != 24){
            System.out.println("No es Navidad aún");
        }else {
            System.out.println("En hora buena es Navidad, feliz Navidad!!! :D");
        }
    }

}
