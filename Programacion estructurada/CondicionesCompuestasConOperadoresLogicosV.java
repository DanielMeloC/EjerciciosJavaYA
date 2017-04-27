import java.util.Scanner;

/**De un operario se conoce su sueldo y los años de antigüedad. Se pide confeccionar un programa que lea los datos de entrada e informe:
 * a) Si el sueldo es inferior a 500 y su antigüedad es igual o superior a 10 años, otorgarle un aumento del 20 %, mostrar el sueldo a pagar.
 * b)Si el sueldo es inferior a 500 pero su antigüedad es menor a 10 años, otorgarle un aumento de 5 %.
 * c) Si el sueldo es mayor o igual a 500 mostrar el sueldo en pantalla sin cambios. */

public class CondicionesCompuestasConOperadoresLogicosV{

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el nombre del empleado");
        String nombreEmpleado = sc.nextLine();
        System.out.println("Ingrese el sueldo del empleado");
        double sueldoEmpleado = sc.nextDouble();
        System.out.println("Ingrese antiguedad del empleado");
        int antiguedadEmpleado = sc.nextInt();

        if(sueldoEmpleado<500 && antiguedadEmpleado>=10){
            System.out.println("|-------------------------------------------|");
            System.out.println("|EMPLEADO:          |        "+nombreEmpleado);         
            System.out.println("|-------------------------------------------|");
            System.out.print("|Incremento del 20% del empleado -> $");
            System.out.printf("%1.2f",(sueldoEmpleado*20/100));
            System.out.println();
            System.out.println("|-------------------------------------------|");
            System.out.print("|Nuevo sueldo del empleado       -> $");
            System.out.printf("%1.2f",((sueldoEmpleado*20/100)+sueldoEmpleado));
            System.out.println();
            System.out.println("|-------------------------------------------|");
        }else if(sueldoEmpleado<500 && antiguedadEmpleado<10){
            System.out.println("|-------------------------------------------|");
            System.out.print("|EMPLEADO:          |        "+nombreEmpleado);         
            System.out.println("|-------------------------------------------|");
            System.out.print("|Incremento del 20% del empleado -> $");
            System.out.printf("%1.2f",(sueldoEmpleado*20/100));
            System.out.println();
            System.out.println("|-------------------------------------------|");
            System.out.println("|Nuevo sueldo del empleado       -> $");
            System.out.printf("%1.2f",((sueldoEmpleado*20/100)+sueldoEmpleado));
            System.out.println();
            System.out.println("|-------------------------------------------|");
        }else{
            
            System.out.print("Sueldo del empleado "+nombreEmpleado+" -> "+sueldoEmpleado);
        }    
    }
}