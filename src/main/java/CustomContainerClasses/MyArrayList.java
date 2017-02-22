package CustomContainerClasses;

import java.lang.reflect.Array;

/**
 * Created by alfatihmukhtar on 2/22/17.
 */
public class MyArrayList<T> {
    @SuppressWarnings("unchecked")
    public T[] container = (T[]) Array.newInstance(Object.getClass(),0);
    public int maxIndex = 0;

    public void add(T object) {
        @SuppressWarnings("unchecked")
        T[] temp = (T[]) Array.newInstance(object.getClass(),maxIndex+1);
        System.arraycopy(container,0,temp,0,temp.length);
        container = temp;
        maxIndex++;
    }
}
