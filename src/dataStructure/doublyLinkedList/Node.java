package dataStructure.doublyLinkedList;

public class Node<T> {
    private T data;
    private Node<T> preNode;
    private Node<T> nxtNode;

    public Node(T data) {
        this.data = data;
        this.preNode = null;
        this.nxtNode = null;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public Node<T> getPreNode() {
        return preNode;
    }

    public void setPreNode(Node<T> preNode) {
        this.preNode = preNode;
    }

    public Node<T> getNxtNode() {
        return nxtNode;
    }

    public void setNxtNode(Node<T> nxtNode) {
        this.nxtNode = nxtNode;
    }
}