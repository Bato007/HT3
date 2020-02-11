import java.util.ArrayList;
/**
 * @author Brandon Hernández 19376
 * @since 10/02/2020
 * @version 10/02/2020
 * @className Insertion.java
 * Literatura Citada: Bailey, D. (septiembre 2007). "Java Stuctures Data Structure in Java
 * for the Principled Programmer". Williams College.
 * Se encarga de hacer ordenar una estructura de datos de tipo int
 */
public class Insertion extends AbstractSort implements Sort{

    /**
     * Método que ordena la lista por medio de selección
     * @pre la lista no esta vacia
     * @pos ordena la lista
     * @param list es la lista de objetos que deben de ser ordenados
     * @return devuelve la lista
     */
    @Override
    public ArrayList<CompareNumber> sort(ArrayList<CompareNumber> list){
        int itemsSorted = 1;
        int index;

        // Ciclo para ordenar
        while (itemsSorted < list.size()){
            int temporary = list.get(itemsSorted).getValue();

            for(index = itemsSorted; 0 < index; index--){

                // Verificar si es mayor el valor
                if(temporary < list.get(index - 1).getValue()){
                    list.get(index).setValue(list.get(index - 1).getValue());
                }else {
                    break;
                }
            }

            // Volver a agregar el valor que tenia
            list.get(index).setValue(temporary);
            itemsSorted++;
        }

        return list;
    }
}
