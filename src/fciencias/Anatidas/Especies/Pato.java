/**
 * Clase que modela un Pato.
 * @author Adrián Aguilera Moreno.
 * @version 1.0
 * @date 4-Nov-2024
 */
package Especies;
import Anatida.*;

public abstract class Pato extends Anatida {
    protected String raza;
    // Atributos a usar en las clases hijas:
    protected char sexo;
    protected double pesoMacho;
    protected double pesoHembra;
    protected String colorEstandar;
    protected int numeroDeHuevosAnuales;
    
    /**
     * Constructor por parámetros de un Pato.
     * ...
     */
    public Pato(int edad, String raza) {
	super(edad, "Pato", false);
	this.raza = raza;
    }

    /**
     * Método que sobre-escribe el método toString.
     * @return String - Cadena que representa una Oca.
     */
    @Override
    public String toString() {
	return "\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~"
	     + super.toString()
	     + "  Raza: " + raza
	     + "\n Sexo: " + sexo
	     + "\n  Peso: " + ((sexo == 'M') ? pesoMacho : pesoHembra)
	     + "\n  Color: " + colorEstandar
	     + "\n Postura anual: " + numeroDeHuevosAnuales
	     + "\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~";
    }
    
    // Tú implementación debe ir aquí.
    // Implementa Compare para que compare respecto al peso del especimen.
}
