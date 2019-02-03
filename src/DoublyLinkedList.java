
import java.util.*;

public class DoublyLinkedList<E> implements List<E> {

    DoublyNode<E> front;
    DoublyNode<E> back;

    public DoublyLinkedList(){
        this.front = new DoublyNode(null, null, back);
        this.back = new DoublyNode(front, null, null);

    }

    public boolean addFront(E arg0){
        DoublyNode<E> a = new DoublyNode<E>(this.front, arg0, this.front.next);
        this.front.next = a;
        a.next.prev = a;

        return true;
    }
    @Override
    public E remove(int index) {
        DoublyNode n = this.getNode(index -1);
        DoublyNode m = this.getNode(index+1);
        n.next = m;
       m.prev = n;
        return null;
    }

    public String toString(){
        String text = "";
        DoublyNode<E> current = front.next;
        while(current != this.back){
            text += current.item.toString() + ", ";

            current = current.next;
        }
        text = text.substring(0, text.length()-1);
        return text;
    }
    public DoublyNode getNode(int index) {
        DoublyNode<E> current = front.next;
        if (current == back) {
            try {
                throw new Exception();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        int i = 0;
        while (current.next != back &&  i < index) {
            current = current.next;
            i++;
        }
        return current;
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean contains(Object o) {
        return false;
    }

    @Override
    public Iterator<E> iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return null;
    }

    @Override
    public boolean add(E e) {
        DoublyNode<E> a = new DoublyNode<E>(this.back.prev, e, this.back);
        this.back.prev = a;
        a.prev.next = a;
        return true;
    }

    @Override
    public boolean remove(Object o) {
        return true;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends E> c) {
        return false;
    }

    @Override
    public boolean addAll(int index, Collection<? extends E> c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public E get(int index) {
        DoublyNode<E> current = front.next;
        if (current == back) {
            try {
                throw new Exception();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        while (current.next != back ) {
            current = current.next;
        }
        return current.item;
    }

    @Override
    public E set(int index, E element) {
        return null;
    }

    @Override
    public void add(int index, E element) {

    }


    @Override
    public int indexOf(Object o) {
        return 0;
    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public ListIterator<E> listIterator() {
        return null;
    }

    @Override
    public ListIterator<E> listIterator(int index) {
        return null;
    }

    @Override
    public List<E> subList(int fromIndex, int toIndex) {
        return null;
    }
}
