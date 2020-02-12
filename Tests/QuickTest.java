import org.junit.Test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import static org.junit.Assert.*;
/**
 * @author Brandon Hernández 19376
 * @since 10/02/2020
 * @version 10/02/2020
 * Se encarga de testear el sort
 */
public class QuickTest {

    @Test
    public void sort() {
        ArrayList<CompareNumber> list = new ArrayList<>();
        ArrayList<CompareNumber> list2 = new ArrayList<>();
        Sort sortType = new Quick();

        //"SortedData.txt"
        //"UnsortedData.txt"
        String read = "UnsortedData.txt", readTxt;
        try {
            FileReader fr = new FileReader(read);
            BufferedReader bf = new BufferedReader(fr);

            while((readTxt = bf.readLine()) != null){
                list.add(new CompareNumber(Integer.parseInt(readTxt)));
            }

            bf.close();

            FileReader fr2 = new FileReader("SortedData.txt");
            BufferedReader bf2 = new BufferedReader(fr2);

            while((readTxt = bf2.readLine()) != null){
                list2.add(new CompareNumber(Integer.parseInt(readTxt)));
            }

            bf2.close();
        } catch (IOException e) {
            System.out.println("Did do");
        }

        sortType.sort(list);

        for(int i = 0; i < list.size(); i++){
            assertEquals(list2.get(i).getValue(), list.get(i).getValue());
        }
    }
}