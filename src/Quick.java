import java.util.ArrayList;
/**
 * @author Brandon Hernández 19376
 * @since 10/02/2020
 * @version 10/02/2020
 * @className Quick.java
 * Literatura Citada: Bailey, D. (septiembre 2007). "Java Stuctures Data Structure in Java
 * for the Principled Programmer". Williams College.
 * Se encarga de hacer ordenar una estructura de datos de tipo compare number
 */
public class Quick extends AbstractSort implements Sort{

    // Lugar en donde se cuardara momentaniamente la lista
    private ArrayList<CompareNumber> listS;

    /**
     * Método que ordena la lista por medio de selección
     * @pre la lista no esta vacia
     * @pos ordena la lista
     * @param list es la lista de objetos que deben de ser ordenados
     * @return devuelve la lista
     */
    @Override
    public ArrayList<CompareNumber> sort(ArrayList<CompareNumber> list){
        listS = list;
        quickSortRecursive(0, listS.size() - 1);
        return listS;
    }

    /**
     * Se encarga de ordenar el array
     * @pre left <= right
     * @pos data(left..right) esta en orden ascendiente
     * @param left es que tan a la izquierda esta del inicio del array
     * @param right es que tan a la derecha esta del inicio del array
     */
    private void quickSortRecursive(int left, int right){
        int pivot;
        if(left >= right) return;

        pivot = partition(left, right);
        quickSortRecursive(left, pivot - 1);
        quickSortRecursive(pivot + 1, right);
    }

    /**
     * Encuentra la posición del pivote a utilizar
     * @pre left <= right
     * @pos list(left) esta en la posición correcta
     * @param left es que tan a la izquierda esta del inicio del array
     * @param right es que tan a la derecha esta del inicio del array
     * @return devuelve el la posición en donde debe de ir el pivote
     */
    private int partition(int left, int right){
        while (true){

            // Moviendo el puntero a la izquierda
            while (left < right && listS.get(left).compareTo(listS.get(right)) < 0) right--;
            if(left < right) swap(listS, left++, right);
            else return left;

            // Moviendo el pivote a la derecha
            while (left < right && listS.get(left).compareTo(listS.get(right)) < 0) left++;
            if(left < right) swap(listS, left, right--);
            else return right;
        }

    }

}
