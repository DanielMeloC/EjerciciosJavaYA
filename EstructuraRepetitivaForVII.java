import java.util.Scanner;

/**Se cuenta con la siguiente información:
 * Las edades de 50 estudiantes del turno mañana.
 * Las edades de 60 estudiantes del turno tarde.
 * Las edades de 110 estudiantes del turno noche.
 * Las edades de cada estudiante deben ingresarse por teclado.
 * a) Obtener el promedio de las edades de cada turno (tres promedios)
 * b) Imprimir dichos promedios (promedio de cada turno)
 * c) Mostrar por pantalla un mensaje que indique cual de los tres turnos tiene un promedio de edades mayor */

public class EstructuraRepetitivaForVII{
    public static void main(String[] args) {

        
        float promedioedadmanana=0;
        float promedioedadtarde=0;
        float promedioedadnoche=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite las edades de 50 alumnos - TURNO MANANA");
        for(int i =1; i<=50 ; i++){
            float edadCincuentaUsuario = sc.nextFloat();
            promedioedadmanana=promedioedadmanana+edadCincuentaUsuario;
        }
        System.out.println("Digite las edades de 60 alumnos - TURNO TARDE ");
        for(int i =1; i<=60 ; i++){
            float edadCincuentaUsuario = sc.nextFloat();
            promedioedadtarde=promedioedadtarde+edadCincuentaUsuario;
        }
        System.out.println("Digite las edades de 100 alumnos - TURNO NOCHE ");
        for(int i =1; i<=100 ; i++){
            float edadCincuentaUsuario = sc.nextFloat();
            promedioedadnoche=promedioedadnoche+edadCincuentaUsuario;
        }

        System.out.println();
        System.out.print("Promedio edad turno manana -> ");
        System.out.printf("%1.2f",+promedioedadmanana/50);
        System.out.println();
        System.out.print("Promedio edad turno tarde  -> ");
        System.out.printf("%1.2f",+promedioedadtarde/60); 
        System.out.println();
        System.out.print("Promedio edad turno noche  -> ");    
        System.out.printf("%1.2f",+promedioedadnoche/100);
        System.out.println();
        if(promedioedadmanana>promedioedadtarde&&promedioedadmanana>promedioedadnoche){
            System.out.println("Turno Manana tiene mayor promedio de edad");
        }else if(promedioedadtarde>promedioedadmanana&&promedioedadtarde>promedioedadnoche){
            System.out.println("Turno tarde tiene mayor promedio de edad");
        }else{
            System.out.println("Turno noche tiene mayor promedio de edad");
        }
        
    }
}