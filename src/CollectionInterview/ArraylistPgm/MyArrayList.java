package CollectionInterview.ArraylistPgm;

import java.util.Arrays;

class MyArrayList<T> {
    private Object[] data = new Object[10];
    private int size = 0;

    public void add(T item) {
        if (size == data.length) grow();
        data[size++] = item;
    }

    @SuppressWarnings("unchecked")
    public T get(int i) {
        if (i < 0 || i >= size) throw new IndexOutOfBoundsException();
        return (T) data[i];
    }

    private void grow() {
        int newCap = data.length + (data.length >> 1);
        data = Arrays.copyOf(data, newCap);
    }
}