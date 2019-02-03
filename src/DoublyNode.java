
class DoublyNode<E> {
    E item;
    DoublyNode<E> next;
    DoublyNode<E> prev;

    DoublyNode(DoublyNode<E> prev, E element, DoublyNode<E> next) {
        this.item = element;
        this.next = next;
        this.prev = prev;
    }
}