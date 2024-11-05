/**
 * Clase que modela un punto en R^2.
 * @author Adrian Aguilera Moreno.
 * @version 1.0
 */
package src.fciencias.Punto;
    
public class Punto implements Comparable<Punto> {
    private double coorX;
    private double coorY;
    private String id;
    
    /**
     * Constructor por omisión que crea un punto en el origen, i.e. crea el punto (0,0).
     */
    public Punto() {
	coorX = 0.0;
	coorY = 0.0;
	id = "O";
    }
    
    /**
     * Constructor por parámetros.
     * @param x Valor de doble precision en la primer entrada en la coordenada.
     * @param y Valor de doble precisión en la segunda entrada en la coordenada.
     * @param id Cadena que representa el nombre del punto.
     */
    public Punto(double x, double y, String id) {
	coorX = x;
	coorY = y;
	this.id = id;
    }
    
    /**
     * Constructor por copia.
     * @param punto {@code Punto} a copiar.
     */
    public Punto(Punto punto) {
	coorX = punto.obtenerX();
	coorY = punto.obtenerY();
	id    = punto.obtenerId();
    }

    /**
     * Aquí va tu código ...
     */
    @Override
    public abstract int compare(Punto punto1, Punto punto2) {
	return 0;
    }
    
    /**
     * Método que calcula la distancia entre 2 puntos.
     * @param p Punto respecto al que obtendremos su distancia.
     * @return double - Distancia euclideana entre dos puntos.
     */
    public double distanciaDosPuntos(Punto p) {
	return Math.sqrt(Math.pow(coorX - p.coorX, 2) + Math.pow(coorY - p.coorY, 2));
    }

    /**
     * Método que devuelve el mínimo entre los valores en la primer posición de dos coordenadas.
     * @param p Punto a comparar.
     * @return double - El valor mínimo entre las coordenadas de la abscisa.
     */
    public double minX(Punto p) {
	return min(coorX, p.coorX);
    }
    
    /**
     * Método que devuelve el mínimo entre los valores de la segunda posición de dos cordenadas.
     * @param p Punto a comparar.
     * @return double - El valor mínimo entre las coordenadas de la ordenada.
     */
    public double minY(Punto p) {
	return min(coorY, p.coorY);
    }

    /**
     * Método que devuelve el máximo entre los valores en la primer posición de dos coordenadas.
     * @param p Punto a comparar.
     * @return double - El valor máximo entre las coordenadas de la abcisa.
     */
    public double maxX(Punto p) {
	return max(coorX, p.coorX);
    }

    /**
     * Método que devuelve el máximo entre los valores de la segunda posición de dos coordenadas.
     * @param p Punto a comprar.
     * @return double - El valor máximo entre las coordenadas de la ordenada.
     */
    public double maxY(Punto p) {
	return max(coorY, p.coorY);
    }
    
    /* Devuelve el mínimo entre 2 valores. */
    private double min(double val1, double val2) {
	return (val1 < val2) ? val1 : val2;
    }
    
    /* Devuelve el máximo entre 2 valores. */
    private double max(double val1, double val2) {
	return (val1 > val2) ? val1 : val2;
    }
   
    
    /* Métodos de acceso. */

    /**
     * Método de acceso a la primer entrada de la coordenada.
     * @return {@code double} - Valor del punto en el eje de las abscisas.
     */
    public double obtenerX() { return coorX; }

    /**
     * Método de acceso a la segunda entrada de la coordenada.
     * @return {@code double} - Valor del punto en el eje de las ordenadas.
     */
    public double obtenerY() { return coorY; }

    /**
     * Método de acceso al identificador del punto.
     * @return {@code String} - Nombre del punto.
     */
    public String obtenerId() { return id; }

    
    /* Métodos de modificación. */

    /**
     * Método que modifica el valor de la primer entrada de la coordenada.
     * @param x Valor del punto en el eje de las abscisas.
     */
    public void asignarX(double x) { coorX = x; }

    /**
     * Método que modifica el valor de la segunda entrada de la coordenada.
     * @param y Valor del punto en el eje de las ordenadas.
     */
    public void asignarY(double y) { coorY = y; }

    /**
     * Método que modifica el identificador del punto.
     * @param id Nombre del punto.
     */
    public void asignarId(String id) { this.id = id; }

    
    /* toString and equals. */
    
    /**
     * Método que sobre-escribe al método {@code toString} de la clase {@code Object}.
     * @return {@code String} - Representación del punto.
     */
    @Override
    public String toString() {
	return "  " + id + " : (" + coorX + ", " + coorY + ")";
    }
    
    /**
     * Método que implementa al método {@code equals}.
     * @param p {@code Punto} a verificar contra el punto que lo invoca.
     * @return {@code boolean} - {@code true} si el punto que invoca al método es
     *                                 igual que {@code p}. {@code false} en otro caso.
     */
    public boolean equals(Punto p) {
	return (coorX == p.obtenerX() && coorY == p.obtenerY()) ? (id.equals(p.obtenerId())) ? true : false : false;
    }    
}
