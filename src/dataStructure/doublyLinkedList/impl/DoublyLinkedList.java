package dataStructure.doublyLinkedList.impl;

import dataStructure.doublyLinkedList.IDoublyLinkedList;
import dataStructure.doublyLinkedList.Node;

public class DoublyLinkedList<T> implements IDoublyLinkedList<T> {
    private int size = 0;
    private Node<T> head = null;
    private Node<T> nxtNode = null;

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean add(T data) {
        Node<T> current = new Node<>(data);
        size++;
        if (head == null) {
            head = current;
        } else if (head.getNxtNode() == null){
            nxtNode = current;
            head.setNxtNode(nxtNode);
        } else {
            Node<T> preNode = nxtNode;
            nxtNode = current;
            preNode.setNxtNode(nxtNode);
            nxtNode.setPreNode(preNode);
        }
        return true;
    }

    @Override
    public Node<T> get(int index) {
        int count = 0;
        Node<T> current = head;
        while (current != null) {
            if (count == index)
                return current;
            count++;
            current = current.getNxtNode();
        }
        return null;
    }

    @Override
    public T set(int index, T data) {
        if (index == 0)
            head.setData(data);
        else
            get(index).setData(data);

        return get(index).getData();
    }

    @Override
    public T remove(int index) {
        T data = get(index).getData();
        if (size == 1) {
            head = null;
        } else if (index == 0) {
            head = get(index + 1);
            head.setPreNode(null);
        } else if (index == size - 1) {
            nxtNode = get(index - 1);
            nxtNode.setNxtNode(null);
        } else {
            Node<T> preNode = get(index - 1);
            Node<T> nxtNode = get(index + 1);

            preNode.setNxtNode(nxtNode);
            nxtNode.setPreNode(preNode);
        }
        size--;
        return data;
    }
}