/**Realizar un programa que imprima 25 términos de la serie 11 - 22 - 33 - 44, etc. (No se ingresan valores por teclado)  */

public class EstructuraRepetitivaWhileIII{
    public static void main(String[] args) {
        System.out.println();
        System.out.println("Se imprime los 25 terminos de la serie 11");
        int contador =0;
        int numero = 0;
        while(numero<275){
            numero = numero+11;
            contador +=1;
            System.out.println(numero+"  <-- termino --> "+contador);
          
        }
    }
}