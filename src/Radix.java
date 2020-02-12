import java.util.ArrayList;
import java.util.Vector;
/**
 * @author Brandon Hernández 19376
 * @since 10/02/2020
 * @version 10/02/2020
 * @className Radix.java
 * Literatura Citada: Bailey, D. (septiembre 2007). "Java Stuctures Data Structure in Java
 * for the Principled Programmer". Williams College.
 * Se encarga de hacer ordenar una estructura de datos de tipo compare number
 */
public class Radix extends AbstractSort implements Sort {

    // Atributo que a la que se le hara el sort
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
        this.listS = list;

        for(int i = 0; i < 6; i++){
            bucketPass(i);
        }
        return listS;
    }

    /**
     * Ordena los datos de una estructura de datos
     * @pre list es una arraylist de valores y d >= 0
     * @pos la informacion es ordenada con base a la posicion d
     * @param z es el numero de veces que ha pasado el ciclo for de la funcion main
     */
    private void bucketPass(int z){
        int i,j, value, large = listS.size();

        // Dandole el espacio al bucket y metiendole más buckets
        Vector<Vector<Integer>> bucket = new Vector<Vector<Integer>>(10);
        bucket.setSize(10);
        for(j = 0; j < 10; j++) bucket.set(j, new Vector<Integer>());

        // Distribullendo la data entre las buckets
        for(i = 0; i < large; i++){
            value = listS.get(i).getValue();
            j = digit(value, z);

            // Metiendo los datos al vector
            bucket.get(j).add(value);
        }

        // Metiendo los datos ordenados dentro de la lista
        i = large;
        for(j = 9; 0 <= j; j--){

            while (!bucket.get(j).isEmpty()){

                i--;
                value = bucket.get(j).remove(bucket.get(j).size() - 1);
                listS.get(i).setValue(value);
            }

        }
    }

    /**
     * Calcula el numero que debe de tener j
     * @pre n >= 0 y d >= 0
     * @pos calcula la dth posicion de n
     * @param n es el valor que tiene la lista en una posicion especifica
     * @param d es la vuelta de ciclo que debe de haber
     * @return devuelve el valor del dth posicion de n
     */
    private int digit(int n, int d){
        if(d == 0) return n % 10;
        else return digit(n/10, d-1);
    }

}
