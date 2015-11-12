//fichero Interes.java
//Clase el interés (I) que produce un capital
//el cúal  es directamente proporcional al capital inicial (C),
// al tiempo (t), y a la tasa de interés (i) :
//I = C · i · t

public class Interes{
public static double calcularInter(double C, double t,double i){
   //código para calcular el interes
   double I = 0;
   I = C*t*i;
   //return interes
   return I;
}
}
