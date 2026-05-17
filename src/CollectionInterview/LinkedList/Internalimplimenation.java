package CollectionInterview.LinkedList;

public class Internalimplimenation {

    // LinkedList is a Doubly Linked List + implements Deque
    public class LinkedList<E> {

        private static class Node<E> {
            E item;
            Node<E> next;
            Node<E> prev;   // doubly linked!

            Node(Node<E> prev, E element, Node<E> next) {
                this.item = element;
                this.next = next;
                this.prev = prev;
            }
        }

        transient Node<E> first;  // head pointer
        transient Node<E> last;   // tail pointer
        transient int size = 0;

        // O(1) add at end
        void linkLast(E e) {
            final Node<E> l = last;
            final Node<E> newNode = new Node<>(l, e, null);
            last = newNode;
            if (l == null) first = newNode;
            else l.next = newNode;
            size++;
        }

        // O(n) get — must traverse from head or tail
        public E get(int index) {
            return node(index).item;
        }

        // Smart traversal: start from head or tail based on index
        Node<E> node(int index) {
            if (index < (size >> 1)) {           // index < size/2
                Node<E> x = first;
                for (int i = 0; i < index; i++)
                    x = x.next;
                return x;
            } else {
                Node<E> x = last;
                for (int i = size - 1; i > index; i--)
                    x = x.prev;
                return x;
            }
        }
    }
}
