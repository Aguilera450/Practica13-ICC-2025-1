/**
 * Clase que modela una Oca.
 * @author Adrián Aguilera Moreno.
 * @version 1.0
 * @date 4-Nov-2024
 */
package Especies;
import Anatida.*;

public abstract class Oca extends Anatida {
    protected String raza;
    // Atributos a usar en las clases hijas:
    protected boolean babero;
    protected double peso; // Toma el peso de los machos como referencia.
    protected String colorEstandar;
    protected int numeroDeHuevosAnuales;
    
    /**
     * Constructor por parámetros de un Ganso.
     * ...
     */
    public Oca(int edad, String raza, boolean babero) {
	super(edad, "Ganso", false); // Verifica que volar sea cierto para la raza en particular.
	this.raza = raza;
	this.babero = babero;
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
	     + "\n  Babero: " + babero
	     + "\n  Peso: " + peso
	     + "\n  Color: " + colorEstandar
	     + "\n Postura anual: " + numeroDeHuevosAnuales
	     + "\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~";
    }
    
    // Tú implementación debe ir aquí.
    // Implementa Compare para que compare por el número de huevos que ponen al año.
}
