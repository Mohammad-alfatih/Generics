package CustomContainerClasses;

/**
 * Created by alfatihmukhtar on 2/22/17.
 */
public class MyArrayList<T> {
    public T[] container = (T[]) new Object[0];
    public int maxIndex = 0;

    public void add(T object) {
        @SuppressWarnings("unchecked")
        T[] temp = (T[]) new Object[0];
        System.arraycopy(container,0,temp,0,temp.length);
        container = temp;
        maxIndex++;
    }
}
