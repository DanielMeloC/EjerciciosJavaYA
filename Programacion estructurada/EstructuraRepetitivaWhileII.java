/**En una empresa trabajan n empleados cuyos sueldos oscilan entre $100 y $500, realizar un programa que lea los sueldos que 
 * cobra cada empleado e informe cuántos empleados cobran entre $100 y $300 y cuántos cobran más de $300. Además el programa deberá 
 * informar el importe que gasta la empresa en sueldos al personal. */

import java.util.Scanner;


public class EstructuraRepetitivaWhileII{
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese numero de empleados a registrar");
        int numeroUsuario = sc.nextInt();
        int contador =0;
        int contadorUnoCinco =0;
        int contadorMasTres =0;
        int importe =0;


        while(contador!=numeroUsuario){
            System.out.println("Ingrese sueldo del empleado -> "+(contador+1));
            int sueldoEmpleado = sc.nextInt();

            if(sueldoEmpleado>=100 && sueldoEmpleado<=300){
                contadorUnoCinco +=1;
            }else if(sueldoEmpleado>300){
                contadorMasTres +=1;

            }
            
            importe = importe+sueldoEmpleado;
            contador +=1;
        }

        System.out.println("La cantidad de empleados que ganan entre $100 y $300 son -> "+contadorUnoCinco);
        System.out.println("La cantidad de empleados que ganan mas de  $300 son -> "+contadorMasTres);
        System.out.println("El importe de la empresa que gasta en la nomina de sus empleados es de -> $"+importe);
        
    }


}