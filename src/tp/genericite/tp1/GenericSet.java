package tp.genericite.tp1;

import java.util.Arrays;
import java.util.Objects;

public class GenericSet<T> implements IGenericSet<T> {

    private int length;
    private T[] items;
    private int count;

    public GenericSet(int length) {
        this.length = length;
        this.items = ( T[] ) new Object[length];
    }

    @Override
    public void add(T item) {
        for (var tmpItem : items){
            if (Objects.equals(tmpItem, item)){
                return;
            }
            if (count < length){
                items[count] = item;
            }
        }
    }

    @Override
    public void remove(T item) {

    }

    @Override
    public T get(int index) {
        return null;
    }

    @Override
    public void clear() {

    }

    @Override
    public boolean contains(T item) {
        return false;
    }

    @Override
    public int getSize() {
        return 0;
    }

    @Override
    public void print() {
        System.out.println(Arrays.toString(items));
    }
}

