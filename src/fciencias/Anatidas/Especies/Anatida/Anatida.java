/**
 * Clase abstracta que modela el comportamiento de una Anátida.
 * @author Adrián Aguilera Moreno
 * @version 1.0
 * @date 4-Nov-2024
 */
package Anatida;
import java.util.Comparator;


public abstract class Anatida implements Comparator<Anatida> {
    protected int edad;
    protected String especie;
    protected boolean vuela;
    
    /**
     * Constructor por parámetros de un pato.
     * @param edad int que representa la edad de una anátida.
     * @param raza String que representa la especie de la anátida.
     * @param vuela boolean que representa el estado de una anátida al volar o no.
     */
    public Anatida (int edad, String especie, boolean vuela) {
	this.edad = edad;
	this.especie = especie;
	this.vuela = vuela;
    }
    
    /**
     * Método abstracto que devuelve la cantidad de huevos
     * que pone una anátida por ciclo.
     */
    public abstract int produccionDeHuevos();

    /** Peso máximo que alcanza una Anatida. */
    public abstract double peso();

    /** Color de la anátida. */
    public abstract String color();

    /** Raza de una especie en particular. */
    public abstract String raza();

    /**
     * Método abstracto que compara dos instancias de Anátida.
     * @param anatida1 la primera anátida
     * @param anatida2 la segunda anátida
     * @return int - resultado de la comparación
     */
    @Override
    public abstract int compare(Anatida anatida1, Anatida anatida2);
    
    /**
     * Método que sobreescribe el método toString.
     * @return String - Representación en cadena de una Anátida.
     */
    @Override
    public String toString() {
	return "\n  Edad: " + this.edad
	       + "\n  Especie: " + especie
	       + "\n  ¿Vuela? " + vuela + "\n";
    }
}
