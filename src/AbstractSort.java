import java.util.ArrayList;
/**
 * @author Brandon Hernández 19376
 * @since 10/02/2020
 * @version 10/02/2020
 * @className AbstractSort.java
 * Literatura Citada: Bailey, D. (septiembre 2007). "Java Stuctures Data Structure in Java
 * for the Principled Programmer". Williams College.
 * Le da la capacidad a todos los tipos de sort a utilizar el método sort
 */
public abstract class AbstractSort implements Sort{

    /**
     * Método que ordena la lista por medio de selección
     * @pre la lista no esta vacia
     * @pos ordena la lista
     * @param list es la lista de objetos que deben de ser ordenados
     * @return devuelve la lista
     */
    public abstract ArrayList<CompareNumber> sort(ArrayList<CompareNumber> list);

    /**
     * Cambia el valor de dos objetos
     * @pos a la lista les hace swap a los valores indicados
     * @param list es la lista a la cual se le quiere cambiar los valores
     * @param maxNumber posición en donde se encuentra el número mayor
     * @param unsorted posición en donde se debe de intercambiar el número
     * @return devuelve la lista can los valores de números
     */
    protected ArrayList<CompareNumber> swap(ArrayList<CompareNumber> list, int maxNumber, int unsorted){
        int aux = list.get(maxNumber).getValue();
        list.get(maxNumber).setValue(list.get(unsorted).getValue());
        list.get(unsorted).setValue(aux);
        return list;
    }


}
