package CustomContainerClasses;

/**
 * Created by alfatihmukhtar on 2/22/17.
 */
public class MyArrayList<T> {
    public Object[] container = null;
    private int maxIndex = 0;

    public Object[] add(Object object) {
        Object[] temp = new Object[maxIndex+1];
        System.arraycopy(container,0,temp,0,temp.length);
        container = temp;
        maxIndex++;
        //@SuppressWarnings("unchecked")
        return temp;
    }
}
