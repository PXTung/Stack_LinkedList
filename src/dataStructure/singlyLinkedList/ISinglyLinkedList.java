package dataStructure.singlyLinkedList;

public interface ISinglyLinkedList<T> {
    boolean add(T data);
    int size();
    Node<T> get(int index);
    T set(int index, T data);
    T remove(int index);
}