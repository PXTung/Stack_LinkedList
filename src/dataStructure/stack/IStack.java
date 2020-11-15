package dataStructure.stack;

public interface IStack<T> {
    boolean empty();
    T push(T data);
    T pop();
    String findAll();
    int size();
    T peek();
    int search(T data);
}