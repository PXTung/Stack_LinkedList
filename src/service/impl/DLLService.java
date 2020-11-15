package service.impl;

import dataStructure.doublyLinkedList.IDoublyLinkedList;
import dataStructure.doublyLinkedList.impl.DoublyLinkedList;
import model.Subject;
import service.IService;

public class DLLService implements IService {
    private final IDoublyLinkedList<Subject> dList = new DoublyLinkedList<>();

    @Override
    public int size() {
        return dList.size();
    }

    @Override
    public boolean add(Subject subject) {
        return dList.add(subject);
    }

    @Override
    public Subject update(int index, Subject subject) {
        return dList.set(index, subject);
    }

    @Override
    public Subject remove(int index) {
        return dList.remove(index);
    }

    @Override
    public String findAll() {
        StringBuilder subjects = new StringBuilder();
        int size = dList.size();
        for (int i = 0; i < size; i++) {
            String s = dList.get(i).getData().toString() + "\n";
            subjects.append(s);
        }
        return subjects.toString();
    }
}