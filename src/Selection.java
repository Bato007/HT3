import java.util.ArrayList;
/**
 * @author Brandon Hernández 19376
 * @since 10/02/2020
 * @version 10/02/2020
 * @className Selection.java
 * Literatura Citada: Bailey, D. (septiembre 2007). "Java Stuctures Data Structure in Java
 * for the Principled Programmer". Williams College.
 * Se encarga de hacer ordenar una estructura de datos de tipo compare number
 */
public class Selection extends AbstractSort implements Sort{

    /**
     * Método que ordena la lista por medio de selección del forma ascendente
     * @pre la lista no esta vacia
     * @pos ordena la lista
     * @param list es la lista de objetos que deben de ser ordenados
     * @return devuelve la lista ordenada
     */
    @Override
    public ArrayList<CompareNumber> sort(ArrayList<CompareNumber> list) {
        int itemsUnsorted = list.size();
        int maxNumber;
        CompareNumber aux;

        while(itemsUnsorted > 0) {
            maxNumber = 0;

            // Recorriendo la lista para ver cual es el mayor
            for(int i = 1; i < itemsUnsorted; i++) {

                // Verificando cual es mayor
                if(list.get(maxNumber).compareTo(list.get(i)) < 0) {
                    maxNumber = i;
                }

            }

            // Cambiando de lugares
            list = swap(list, maxNumber, itemsUnsorted - 1);
            itemsUnsorted--;
        }

        return list;
    }

}
