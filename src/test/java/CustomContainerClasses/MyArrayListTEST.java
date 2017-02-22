package CustomContainerClasses;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by alfatihmukhtar on 2/22/17.
 */
public class MyArrayListTEST {
    MyArrayList<Integer> arrList;

    @Before
    public void setUp() {
        arrList = new MyArrayList<Integer>();
        arrList.add(34);
    }

    @Test
    public void addTEST() {
        String expected = "34, 1";
        String actual = (Integer) arrList.container[0] + ", " + arrList.maxIndex; // <-- ONLY WORKS DUE TO (Integer) CAST
        assertEquals("I should get back the value of the object stored in the container[] at index '0', which is 34, and the subsequent value of maxIndex, which should be 1",expected,actual);
    }

    @Test
    public void getTEST() {
        int expected = 34;
        int actual = (Integer)arrList.get(0);
        assertEquals("This should return the value in the container[] at index '0', which is 34",expected,actual);
    }

    @Test
    public void removeTEST() {
        arrList.add(25);
        arrList.remove(0);
        int expected = 1;
        int actual = arrList.container.length;
        assertEquals("Return the length of the container after running this method, which should be less 1 item, and equal 1",expected,actual);
    }

    @Test
    public void setTEST() {
        arrList.set(0,12);
        int expected = 12;
        int actual = arrList.get(0);
        assertEquals("Return the array's item at index 0 after it has been changed",expected,actual);
    }
}
