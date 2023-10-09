import org.junit.Assert;
import org.junit.Test;


public class QuickSortTest {

    @Test
    public void quickSort() {
        MyArrayList<String> test1 = new MyArrayList<>();
        test1.add("bcd");
        test1.add("abc");
        test1.add("def");
        QuickSort.quickSort(test1, 0, test1.size() - 1);

        MyArrayList<String> actual1 = new MyArrayList<>();
        actual1.add("abc");
        actual1.add("bcd");
        actual1.add("def");

        for (int i=0; i<actual1.size(); i++){
            Assert.assertEquals(test1.get(i), actual1.get(i));
        }

        MyArrayList<Integer> test2 = new MyArrayList<>();
        test2.add(111);
        test2.add(-123);
        test2.add(0);
        QuickSort.quickSort(test2, 0, test2.size() - 1);

        MyArrayList<Integer> actual2 = new MyArrayList<>();
        actual2.add(-123);
        actual2.add(0);
        actual2.add(111);

        for (int i=0; i<actual2.size(); i++){
            Assert.assertEquals(test2.get(i), actual2.get(i));
        }
    }
}