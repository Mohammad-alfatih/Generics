package CustomContainerClasses;

/**
 * Created by alfatihmukhtar on 2/22/17.
 */
public class MyArrayList<T> {
    public Object[] container = new Object[0];
    private int maxIndex = 0;

    MyArrayList() {}
    MyArrayList(int size) { container = new Object[size]; maxIndex = size; }

    public void add(Object object) {
        Object[] temp = new Object[maxIndex+1];
        System.arraycopy(container,0,temp,0,maxIndex);
        temp[maxIndex]= object;
        container = temp;
        maxIndex++;
        //@SuppressWarnings("unchecked")
    }
}
