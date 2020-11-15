package dataStructure.singlyLinkedList.impl;

import dataStructure.singlyLinkedList.ISinglyLinkedList;
import dataStructure.singlyLinkedList.Node;

public class SinglyLinkedList<T> implements ISinglyLinkedList<T> {
    private int size = 0;
    private Node<T> head = null;
    private Node<T> tail = null;

    @Override
    public boolean add(T data) {
        Node<T> newNode = new Node<>(data);
        if (head == null) {
            head = newNode;
        } else if (tail == null){
            head.setNxtNode(newNode);
            tail = newNode;
        } else {
            tail.setNxtNode(newNode);
            tail = newNode;
        }
        size++;
        return true;
    }

    @Override
    public int size() {
        return size;
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
        } else if (index == size - 1){
            tail = get(index - 1);
            tail.setNxtNode(null);
        } else {
            Node<T> preNode = get(index - 1);
            Node<T> nxtNode = get(index + 1);

            preNode.setNxtNode(nxtNode);
        }
        size--;
        return data;
    }
}