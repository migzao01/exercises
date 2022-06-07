import java.util.Iterator;

/**
 * Created by ferrao on 30/05/16.
 */
public class RangeTest {

    public static void main(String[] args) {

        Range range = new Range(-5, 5);

        System.out.println("--- USING ITERATOR ---");
        Iterator<Integer> myRangeIterator = range.iterator();

        while (myRangeIterator.hasNext()) {

            int value = myRangeIterator.next();
            System.out.println(value);
        }
    }

}
