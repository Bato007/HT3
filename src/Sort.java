import java.util.ArrayList;
/**
 * @author Brandon Hernández 19376
 * @since 10/02/2020
 * @version 10/02/2020
 * @className Sort.java
 * Literatura Citada: Bailey, D. (septiembre 2007). "Java Stuctures Data Structure in Java
 * for the Principled Programmer". Williams College.
 * Se encarga de hacer ordenar una estructura de datos de tipo compare number
 */
public interface Sort {

    /**
     * Método que ordena la lista por medio de selección
     * @pre la lista no esta vacia
     * @pos ordena la lista
     * @param list es la lista de objetos que deben de ser ordenados
     * @return devuelve la lista
     */
    public  ArrayList<CompareNumber> sort(ArrayList<CompareNumber> list);

}
