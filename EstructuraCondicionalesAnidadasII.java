/**
 * Un postulante a un empleo, realiza un test de capacitación, se obtuvo la siguiente información: cantidad total de preguntas 
 * que se le realizaron y la cantidad de preguntas que contestó correctamente. Se pide confeccionar un programa que ingrese los
 * dos datos por teclado e informe el nivel del mismo según el porcentaje de respuestas correctas que ha obtenido, y sabiendo que:

	Nivel máximo:	Porcentaje>=90%.
	Nivel medio:	Porcentaje>=75% y <90%.
	Nivel regular:	Porcentaje>=50% y <75%.
	Fuera de nivel:	Porcentaje<50%.

 */
import java.util.*;

public class EstructuraCondicionalesAnidadasII{

    public static void main(String[] argumentos){

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de preguntas que se le realizó al postulante");
        double cantidadPreguntas = sc.nextDouble();
        System.out.println("Ingrese la cantidad de preguntas que el postulante contestó correctamente");
        double cantidadCorrectas = sc.nextDouble();

        //Formula para sacar cantidad por el porcentaje  80*25/100 = 20  formula para sacar el porcentaje--> 20/80*100
        double porcentajeCorrectas  = (cantidadCorrectas/cantidadPreguntas)*100;

        if(porcentajeCorrectas>=90){
            System.out.print("El nivel del postulante es Máximo:  Porcentaje -> ");
            System.out.printf("%1.1f",porcentajeCorrectas);
            System.out.print("%");

        }else if(porcentajeCorrectas>=75){
            System.out.print("El nivel del postulante es Medio:  Porcentaje -> ");
            System.out.printf("%1.1f",porcentajeCorrectas);
            System.out.print("%");

        }else if(porcentajeCorrectas >=50){
            System.out.print("El nivel del postulante es regular:  Porcentaje -> ");
            System.out.printf("%1.1f",porcentajeCorrectas);
            System.out.print("%");

        }else if(porcentajeCorrectas<50){
            System.out.print("El postulante está fuera de nivel:  Porcentaje -> ");
            System.out.printf("%1.1f",porcentajeCorrectas);
            System.out.print("%");

        }    
    }

}