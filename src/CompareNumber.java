/**
 * @author Brandon Hernández 19376
 * @since 10/02/2020
 * @version 10/02/2020
 * @className CompareNumber.java
 * Literatura Citada: Bailey, D. (septiembre 2007). "Java Stuctures Data Structure in Java
 * for the Principled Programmer". Williams College.
 * Clase que implementa la clase comparable
 */
public class CompareNumber implements Comparable<CompareNumber>{

    /**
     * Atributo que muestra el valor que posee un
     */
    private int value;

    /**
     * Constructor de los objetos compare number
     * @pos el objeto obtiene su valor por el resto de la ejecucion
     * @param newValue es el valor que se le asignara al objeto
     */
    public CompareNumber(int newValue) {
        this.value = newValue;
    }

    /**
     * Compara el valor de ambos objetos de tipo compare number
     * @pre ambos objetos deben de tener un valor y ser de tipo int
     * @pos resta los valores de los objetos
     * @return devuelve la resta de los valores, negativo el segundo es mayor,
     * positivo el primero es el mayor y 0 son iguales
     */
    @Override
    public int compareTo(CompareNumber compare) {
        return (this.value - compare.value);
    }

    /**
     * Getter del atributo valor
     * @pre el valor debe de ser
     * @return devuelveel valor entero del objeto
     */
    public int getValue() {
        return this.value;
    }

    /**
     * Setter del atributo value
     * @pre debe de tener valor el atributo value
     * @pos cambia el valor del atributo vlue
     */
    public void setValue(int newValue){this.value = newValue;}
}
