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
    public void setUp() throws ClassCastException {
        arrList = new MyArrayList<Integer>();
    }

    @Test
    public void addTEST(){
        arrList.add(23);
        arrList.add(34);
        int expected = 34;
        int actual = (Integer) arrList.container[1];
        assertEquals("I should get back the length of the new array created by the method",expected,actual);
    }
}
