
import java.util.Scanner;

/**Realizar un programa que lea los lados de n triángulos, e informar:
a) De cada uno de ellos, qué tipo de triángulo es: equilátero (tres lados iguales), isósceles (dos lados iguales), o escaleno 
(ningún lado igual)
b) Cantidad de triángulos de cada tipo.
c) Tipo de triángulo que posee menor cantidad.  */

public class EstructuraRepetitivaForIV{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite el numero de triangulos que desea saber su tipo");
        int numeroUsuario = sc.nextInt();
        int contador =0;
        int ladoUno;
        int ladoDos;
        int ladoTres;
        int contadorEquilatero =0;
        int contadorIsosceles=0;
        int contadorEscaleno=0;
        
        for(int i = 0; i<numeroUsuario;i++){
            contador +=1;
            System.out.println("|---------------------------------------|");
            System.out.println("|             Triangulo ("+contador+")             |");
            System.out.println("|_______________________________________|");
            System.out.print("     Primer lado  -------------> ");
            ladoUno = sc.nextInt();
            System.out.print("     Segundo lado -------------> ");
            ladoDos = sc.nextInt();
            System.out.print("     Tercer lado  -------------> ");
            ladoTres = sc.nextInt();
            

            if(ladoUno==ladoDos&&ladoUno==ladoTres){
                System.out.println("|<<<-Este es un triangulo Equilatero->>>|");
                contadorEquilatero+=1;
            }else if(ladoUno==ladoDos||ladoDos==ladoTres||ladoUno==ladoTres){
                System.out.println("|<<<<-Este es un triangulo Isosceles>>>>|");
                contadorIsosceles+=1;
            }else{
                System.out.println("|<<<<-Este es un triangulo Escaleno->>>>|");
                contadorEscaleno+=1;
            }
        }
        System.out.println();
        System.out.println("|_____________________________________________________________|");
        System.out.println("|         Total triangulo Equilatero ----------> "+contadorEquilatero);
        System.out.println("|         Total triangulo Isosceles  ----------> "+contadorIsosceles);
        System.out.println("|         Total triangulo Escaleno   ----------> "+contadorEscaleno);
        if(contadorEquilatero<contadorIsosceles&&contadorEquilatero<contadorEscaleno){
            System.out.println(" <<<-El triangulo que menos cantidad tiene es -> Equilatero->>> ");
            System.out.println("______________________________________________________________|");
        }else if(contadorEscaleno<contadorEquilatero&&contadorEscaleno<contadorIsosceles){
            System.out.println(" <<<-El triangulo que menos cantidad tiene es -> Escaleno->>> ");
            System.out.println("_____________________________________________________________|");
        }else if(contadorIsosceles<contadorEquilatero&&contadorIsosceles<contadorEscaleno){
            System.out.println(" <<<-El triangulo que menos cantidad tiene es -> Isosceles->>> ");
            System.out.println("_____________________________________________________________|");
        }else{
            System.out.println("        <<<-Dos triangulos tienen la misma cantidad->>>         ");
            System.out.println("|_____________________________________________________________|");
        }
    }
}