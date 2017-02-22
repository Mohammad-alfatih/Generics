package CustomContainerClasses;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by alfatihmukhtar on 2/22/17.
 */
public class MyArrayListTEST {
    MyArrayList arrList;

    @Before
    public void setUp() {
        arrList = new MyArrayList();
    }

    @Test
    public void addTEST() {
        arrList.add(new Integer(17));
        int expected = 1;
        int actual = arrList.container.length;
        assertEquals("I should get back the length of the new array created by the method",expected,actual);
    }
}
