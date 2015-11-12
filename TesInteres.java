//fichero Interes.java
//leemos desde un Scanner los valores
//capital, tiempo y tasa de  interés
//y mediante el  método calcularInteres de la
//clase  Interes muestra por pantalla el interés
//calculado
/*
 * @author: Enrique
 * @version: 1,2
 * @param: capital, timpo, tasa
*/

import java.util.Scanner;

public class TesInteres{
   public static void main(String[] arg){
        //preparamos el scanner
        Scanner in = new Scanner(System.in);
        //lectura de lo datos
        System.out.println("Introduce el capital");
        double capital = in.nextDouble();
        System.out.println("Introduce el tiempo");
        double tiempo = in.nextDouble();
        System.out.println("Introduce la tasa");
        double tasa = in.nextDouble();
        //llamada al método calcularInteres
        double resultado = Interes.calcularInter(capital, tiempo, tasa);
        
        //mostramos por pantalla el valor del interés
        System.out.println("El resultado es: "+resultado);
   }
}
