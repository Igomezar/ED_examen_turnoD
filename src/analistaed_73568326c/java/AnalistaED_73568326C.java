
package analistaed_73568326c.java;

import java.util.*;
/**
 * Ejercicio práctico examen evaluación 1 ED
 * @author Isabel Gómez dni 73568326C
 * @version 1.0
 */

public class AnalistaED_73568326C {

    static final double FACTOR_HORA_EXTRA = 1.2;
    private String nombreCompleto, dni;
    private double salarioBasePorHora = 10.56;
    /**
         * Constructo con tres parametros
         * @param nombrecompleto nombre completo en mayuculas
         * @param dni documento nacional de identidad con letra en mayusculas
         */

    public AnalistaED_73568326C(String nombreCompleto, String dni) {
        this.nombreCompleto = nombreCompleto;
        this.dni = dni;
        /**
         *Calcula el salario bruto mensual en función del salario base por hora ylas horas extras. 
         * El precio por hora de la hora extra se determina con laconstante FACTOR_HORA_EXTRA
         * @param horasExtra número de horas extra dedicadas redondeado a la baja (entero)
         * @return devuelve el salario bruto mensual en euros con dos decimales
         */
        
    }

    public double getSalarioEsteMes(int horasExtra) {
        double cantidadExtra, salarioFinal;
        cantidadExtra = horasExtra * this.salarioBasePorHora * FACTOR_HORA_EXTRA;
        salarioFinal = this.salarioBasePorHora * 40 * 4 + cantidadExtra;
        salarioFinal = (double) Math.round(salarioFinal * 100d) / 100d;
        return salarioFinal;
    }

    // Este método no lo comentaremos con JavaDoc
    public static void main(String[] args) {
        // !!!! MODIFICA TU NOMBRE Y TU DNI EN LA SIGUIENTE LÍNEA        
        AnalistaED_73568326C emp = new AnalistaED_73568326C("ISABEL GÓMEZ", "73568326C");
        int horasExtra = 2;
        System.out.println("El salario de " + emp.nombreCompleto 
		+ " este mes será de " + emp.getSalarioEsteMes(horasExtra)
                + " euros, al hacer " + horasExtra + " horas extra.");
    }

}