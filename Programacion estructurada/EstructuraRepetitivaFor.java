/**Confeccionar un programa que lea n pares de datos, cada par de datos corresponde a la medida de la base y la altura de un triángulo. 
 * El programa deberá informar:
 * a) De cada triángulo la medida de su base, su altura y su superficie. 
 * b) La cantidad de triángulos cuya superficie es mayor a 12. 
 */


import java.util.Scanner;
public class EstructuraRepetitivaFor{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite cantidad de triangulos a calcular superficie");
        int numeroUsuarioUno = sc.nextInt();
        //int numeroUsuarioDos = sc.nextInt();
        int altura ;
        int base ;
        int contador = 0;
        int contadorSuperficie =0;

        while(contador <numeroUsuarioUno){
            System.out.println("-----------------------------------");
            System.out.print("Datos triangulo "+(contador+1)+". Altura -->  ");
            altura = sc.nextInt();
            System.out.print("Datos triangulo "+(contador+1)+". Base   -->  ");
            base = sc.nextInt();  
            contador+=1;
            
            for(int i = 1; i==1 ;i++){
                int superficie = base*altura;
                System.out.println("La superficie del triangulo es -> "+superficie);

                if(superficie >12){
                    contadorSuperficie+=1;
                }
            }
            
        }
        System.out.println("-----------------------------------");
        System.out.println("Cantidad de triangulos cuya superficie es mayor a 12  --> "+contadorSuperficie);
    }

}