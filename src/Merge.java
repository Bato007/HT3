import java.util.ArrayList;
/**
 * @author Brandon Hernández 19376
 * @since 10/02/2020
 * @version 10/02/2020
 * @className Merge.java
 * Literatura Citada: Bailey, D. (septiembre 2007). "Java Stuctures Data Structure in Java
 * for the Principled Programmer". Williams College.
 * Se encarga de hacer ordenar una estructura de datos de tipo compare number
 */
public class Merge extends AbstractSort implements Sort{

    /**
     * Método que ordena la lista por medio de selección del forma ascendente
     * @pre la lista no esta vacia
     * @pos ordena la lista
     * @param list es la lista de objetos que deben de ser ordenados
     * @return devuelve la lista ordenada
     */
    @Override
    public ArrayList<CompareNumber> sort(ArrayList<CompareNumber> list) {
        ArrayList<CompareNumber> temporal = new ArrayList<CompareNumber>(list);
        mergeSortRecursive(list, temporal, 0, list.size() -1);
        return list;
    }

    private void mergeSortRecursive(ArrayList<CompareNumber> list, ArrayList<CompareNumber> temp, int low, int high){
        int n = high-low+1;
        int middle = low + n/2;
        int i;

        if(n < 2) return;

        // Copiando la data
        for (i = low; i < middle; i++){
            temp.set(i, list.get(i));
        }

        mergeSortRecursive(temp, list, low, middle-1);
        mergeSortRecursive(list, temp, middle, high);
        merge(list, temp, low, middle, high);
    }

    private void merge(ArrayList<CompareNumber> list, ArrayList<CompareNumber> temp, int low, int middle, int high){
        int ri = low;
        int ti = low;
        int di = middle;

        while (ti < middle && di <= high){

            if(list.get(di).compareTo(temp.get(ti)) < 0){
                list.set(ri++, list.get(di++));
            }else{
                list.set(ri++, temp.get(ti++));
            }
        }

        while (ti < middle){
            list.set(ri++, temp.get(ti++));
        }
    }

}
