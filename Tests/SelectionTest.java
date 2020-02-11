import org.junit.Test;
import java.util.ArrayList;
import static org.junit.Assert.*;
/**
 * @author Brandon Hernández 19376
 * @since 10/02/2020
 * @version 10/02/2020
 * Se encarga de testear el sort
 */
public class SelectionTest {

    @Test
    public void sort() {
        ArrayList<CompareNumber> list = new ArrayList<>();
        ArrayList<CompareNumber> list2 = new ArrayList<>();
        Sort sortType = new Selection();

        list.add(new CompareNumber(5));
        list.add(new CompareNumber(4));
        list.add(new CompareNumber(1));
        list.add(new CompareNumber(8));
        list.add(new CompareNumber(9));
        list.add(new CompareNumber(0));

        list2.add(new CompareNumber(0));
        list2.add(new CompareNumber(1));
        list2.add(new CompareNumber(4));
        list2.add(new CompareNumber(5));
        list2.add(new CompareNumber(8));
        list2.add(new CompareNumber(9));

        sortType.sort(list);

        for(int i = 0; i < list.size(); i++){
            assertEquals(list2.get(i).getValue(), list.get(i).getValue());
        }
    }
}