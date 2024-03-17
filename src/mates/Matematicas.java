package mates;

import java.util.stream.*;
/**
 * Clase con métodos matemáticos.
 */
public class Matematicas
{
    /**
     * Genera una aproximación al número pi mediante el método de Montecarlo. El parámetro `pasos` indica el número de puntos generados.
     * 
     * @param pasos El número de puntos generados.
     * @return Una aproximación al número pi.
     */

     public static double generarNumeroPiLam(long pasos) {
        long dentroCirculo = IntStream
       
            .rangeClosed(0, (int) pasos)
            .parallel()
            .mapToObj(i -> new double[] {
                    Math.random(), Math.random() })
    //Filtran valores con respectivas condiciones
            .filter(par -> par[0] * par[0] + par[1] * par[1] <= 1)
    //Cuentan los valores que cumple la anterior condicion
            .count();
    
        return 4.0 * dentroCirculo / pasos;
    }
}