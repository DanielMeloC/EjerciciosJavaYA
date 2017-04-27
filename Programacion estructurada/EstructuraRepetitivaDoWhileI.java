import java.util.Scanner;

/**En un banco se procesan datos de las cuentas corrientes de sus clientes. De cada cuenta corriente se conoce: número de cuenta y 
 * saldo actual. El ingreso de datos debe finalizar al ingresar un valor negativo en el número de cuenta.
 * Se pide confeccionar un programa que lea los datos de las cuentas corrientes e informe:
 * a)De cada cuenta: número de cuenta y estado de la cuenta según su saldo, sabiendo que:
 * Estado de la cuenta	'Acreedor' si el saldo es >0.
 *          'Deudor' si el saldo es <0.
 *          'Nulo' si el saldo es =0.
 * b) La suma total de los saldos acreedores.  */

public class EstructuraRepetitivaDoWhileI{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int numeroCuentas;
        float saldoCuenta;
        float suma=0;
        
        do{
            System.out.println("Digite numero de cuenta corriente del cliente");
            numeroCuentas = sc.nextInt();
            System.out.println("Digite el saldo del cliente");
            saldoCuenta = sc.nextFloat();

            if (numeroCuentas<0){
                System.out.println();
                System.out.println("NO SE PERMITE INGRESAR NUMERO NEGATIVOS A CUENTAS CORRIENTE !!!!");
            }else if(saldoCuenta>0){
                    System.out.println();
                    System.out.println("*************************************************************");
                    System.out.println("*                 DETALLE CUENTA CORRIENTE                  *");
                    System.out.println("*************************************************************");
                    System.out.println("|-----------------------|--------------------|--------------|");
                    System.out.println("|     Estado cuenta     |   Numero cuenta    |     saldo    |");
                    System.out.println("|-----------------------|--------------------|--------------|");System.out.print("         ACREEDOR                  "+numeroCuentas+     "           $");
                    System.out.printf("%1.2f",saldoCuenta);
                    System.out.println();
                    System.out.println("|-----------------------|--------------------|--------------|");
                    System.out.println();
                
                    if(numeroCuentas>=0){
                        suma = suma+saldoCuenta;
                    }
            
                }else if(saldoCuenta<0){
                    System.out.println();
                    System.out.println("*************************************************************");
                    System.out.println("*                 DETALLE CUENTA CORRIENTE                  *");
                    System.out.println("*************************************************************");
                    System.out.println("|-----------------------|--------------------|--------------|");
                    System.out.println("|     Estado cuenta     |   Numero cuenta    |     saldo    |");
                    System.out.println("|-----------------------|--------------------|--------------|");
                    System.out.print("         DEUDOR                   "+numeroCuentas+     "           $");
                    System.out.printf("%1.2f",saldoCuenta);
                    System.out.println();
                    System.out.println("|-----------------------|--------------------|--------------|");
                    System.out.println();
                }else{
                    System.out.println();
                    System.out.println("*************************************************************");
                    System.out.println("*                 DETALLE CUENTA CORRIENTE                  *");
                    System.out.println("*************************************************************");
                    System.out.println("|-----------------------|--------------------|--------------|");
                    System.out.println("|     Estado cuenta     |   Numero cuenta    |     saldo    |");
                    System.out.println("|-----------------------|--------------------|--------------|");
                    System.out.print("         NULO                      "+numeroCuentas+     "           $");
                    System.out.printf("%1.2f",saldoCuenta);
                    System.out.println();
                    System.out.println("|-----------------------|--------------------|--------------|");
                    System.out.println();
                }            
            
        }while(numeroCuentas>=0);
        System.out.println();
        System.out.print("Total saldo de las cuentas de los ACREEDORES $");
        System.out.printf("%1.2f",suma);
        

    }
}

                