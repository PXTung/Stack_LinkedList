package dataStructure.doublyLinkedList;

public interface IDoublyLinkedList<T> {
    int size();
    boolean add(T data);
    Node<T> get(int index);
    T set(int index, T data);
    T remove(int index);
}