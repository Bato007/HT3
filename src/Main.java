import java.util.*;
import  java.io.*;
/**
 * @author Brandon Hernández 19376
 * @since 10/02/2020
 * @version 12/02/2020
 * @className Main.java
 * Literatura Citada: Bailey, D. (septiembre 2007). "Java Stuctures Data Structure in Java
 * for the Principled Programmer". Williams College.
 * Punto inicial del programa
 */
public class Main {
    public static void main(String[] args){
        int numberOfData = 10;
        String read = "UnsortedData.txt", readTxt;
        Random random = new Random();

        // Objetos para realizar sorts
        ArrayList<CompareNumber> list = new ArrayList<CompareNumber>();
        Sort sortType = new Selection();

        // Escribiendo los datos en un .txt
        try {
            FileWriter fw = new FileWriter("UnsortedData.txt");
            PrintWriter pw = new PrintWriter(fw);

            // Generando números aleatorios y metiendolos al .txt
            for(int i = 0; i < numberOfData; i++){
                pw.println(String.valueOf(random.nextInt(100)));
            }

            pw.close();
        } catch (IOException e) {
            System.out.println("Did do");
        }

        // Recibiendo los datos en un ArrayList
        try {
            FileReader fr = new FileReader(read);
            BufferedReader bf = new BufferedReader(fr);

            // Generando números aleatorios y metiendolos al .txt

            while((readTxt = bf.readLine()) != null){
                list.add(new CompareNumber(Integer.parseInt(readTxt)));
            }

            bf.close();
        } catch (IOException e) {
            System.out.println("Did do");
        }

        // Realizando el sort
        sortType.sort(list);

        // Metiendolos al texto ya ordenados
        try {
            FileWriter fw = new FileWriter("SortedData.txt");
            PrintWriter pw = new PrintWriter(fw);

            // Generando números aleatorios y metiendolos al .txt
            for(int i = 0; i < numberOfData; i++){
                pw.println(String.valueOf(list.get(i).getValue()));
            }

            pw.close();
        } catch (IOException e) {
            System.out.println("Did do");
        }
    }
}
