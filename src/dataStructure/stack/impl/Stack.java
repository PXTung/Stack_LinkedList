package dataStructure.stack.impl;

import dataStructure.stack.Element;
import dataStructure.stack.IStack;

public class Stack<T> implements IStack<T> {
    private int size = 0;
    private Element<T> element = null;
    private Element<T> preElement = null;

    @Override
    public boolean empty() {
        return size <= 0;
    }

    @Override
    public T push(T data) {
        Element<T> curElement = new Element<>(data);

        if (size > 0) {
            preElement = element;
            element = curElement;
            element.setPreElement(preElement);
        } else {
            preElement = curElement;
            element = curElement;
        }
        size++;
        return data;
    }

    @Override
    public T peek() {
        return element.getData();
    }

    @Override
    public T pop() {
        if (size == 0) return null;

        T data = element.getData();
        if (size == 1) {
            element = null;
        } else {
            element = preElement;
            preElement = preElement.getPreElement();
        }
        size--;
        return data;
    }

    @Override
    public int search(T data) {
        String allData = findAll();
        if (allData.contains(data.toString()))
            return 1;
        return -1;
    }

    @Override
    public String findAll() {
        StringBuilder data = new StringBuilder();
        int count = size;
        Element<T> current = element;
        while (count != 0) {
            count--;
            String s = "INDEX " + count + ": ";
            data.insert(0, s + current.getData() + "\n");
            current = current.getPreElement();
        }
        return data.toString();
    }

    @Override
    public int size() {
        return size;
    }
}