/**Escribir un programa que solicite ingresar 10 notas de alumnos y nos informe cuántos tienen notas mayores o iguales a 7 y cuántos menores */
import java.util.Scanner;

public class  EstructuraRepetitivaWhile{

    public static void main(String[] args) {
        

        Scanner sc = new Scanner(System.in);
        System.out.println("Escriba 10 notas entre 1-10");
        int contadorCantidadNotas = 0;
        int contadorNotaMayor = 0;
        int contadorNotaMenor = 0;
        int nota;
       
        while(contadorCantidadNotas <10){
            nota =sc.nextInt();
            if(nota>=7){
                contadorNotaMayor+=1;
            }else{
                contadorNotaMenor+=1;
            }
            contadorCantidadNotas +=1;
        }
        System.out.println("Cantidad notas >= 7 -> "+contadorNotaMayor);
        System.out.println("Cantidad notas < 7 -> "+contadorNotaMenor);
    }
}