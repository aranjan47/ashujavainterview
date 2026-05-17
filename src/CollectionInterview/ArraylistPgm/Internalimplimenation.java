/*
package CollectionInterview.ArraylistPgm;

public class Internalimplimenation {
    // add operation
    public boolean add(E e) {
        ensureCapacityInternal(size + 1);
        elementData[size++] = e;
        return true;
    }
*/
/**//*

    //Resize logic
    private void grow(int minCapacity) {
        int oldCapacity = elementData.length;
        int newCapacity = oldCapacity + (oldCapacity >> 1);

        if (newCapacity < minCapacity)
            newCapacity = minCapacity;

        elementData = Arrays.copyOf(elementData, newCapacity);
    }
    //remove operation COSTLY
    public E remove(int index) {
        rangeCheck(index);

        E oldValue = elementData(index);

        int numMoved = size - index - 1;
        if (numMoved > 0)
            System.arraycopy(elementData, index+1, elementData, index, numMoved);

        elementData[--size] = null; // GC
        return oldValue;
    }

    //Manager Insight:

    Use ArrayList for read-heavy systems (like caching, UI lists)
    public static void main(String args[]) {

    }
}


NOTE
“ArrayList is best suited for read-heavy and
sequential access use cases due to O(1) access time and cache locality.
However, for concurrent or write-heavy systems,
I prefer CopyOnWriteArrayList or alternative data structures depending on workload characteristics.”*/
