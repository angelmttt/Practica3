package aplicacion;
import java.util.Scanner;
import mates.Matematicas;

public class Principal{

    //En la clase Principal monstramos en la pantalla el valor de PI calculado por el método Monte Carlo en 1000 pasos, 
    //los pasos son el número de puntos generados y damos el número de decimales que queremos calcular.
  
    public static void main(String[] args){

    //Creas el scanner para darle la oportunidad al visitante de generar PI
    Scanner sc = new Scanner(System.in);
    System.out.println("Ingrese el número de decimales para poder el calcular el numero PI respecto potencias 10:");
    long pasos = sc.nextLong();
    //Muestra en pantalla el numero Pi respecto el sc anterior
    System.out.println("El numero PI es " +Matematicas.generarNumeroPiLam(pasos));
    }
}