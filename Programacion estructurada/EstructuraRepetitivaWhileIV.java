/** Mostrar los múltiplos de 8 hasta el valor 500. Debe aparecer en pantalla 8 - 16 - 24, etc.*/

public class EstructuraRepetitivaWhileIV{
    public static void main(String[] args) {

        System.out.println("Se muestra los multiplos de 8 hasta 500");
        int multiplo=8;
        int contador =0;

        while(multiplo<500){
            contador +=1;
            System.out.println(multiplo+ " <-- "+contador);
            multiplo = multiplo+8;
            
        }
        
    }
}