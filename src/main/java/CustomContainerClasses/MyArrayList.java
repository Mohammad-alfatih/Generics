package CustomContainerClasses;

/**
 * Created by alfatihmukhtar on 2/22/17.
 */
public class MyArrayList<T> {
    public Object[] container = new Object[0];
    public int maxIndex = 0;

    MyArrayList() {}
    MyArrayList(int size) { container = new Object[size]; maxIndex = size; }

    @SuppressWarnings("unchecked")
    public <T> void add(Object object) {
        Object[] temp = new Object[maxIndex+1];
        System.arraycopy(container,0,temp,0,maxIndex);
        temp[maxIndex]= object;
        container = (T[]) temp;
        maxIndex++;
    }

    @SuppressWarnings("unchecked")
    public <T> T[] get(int index) {
        return (T[]) container[index];
    }

    public <T> void remove(int index) {
        container[index] = null;
        Object[] temp = new Object[maxIndex-1];
        int tempIndex = 0;
        for(Object o : container) {
            if(o != null) {
                temp[tempIndex] = o;
                tempIndex++;
            }
        }
        container = temp;
    }

    public void set(int index, T value) {
        container[index] = value;
    }
}
