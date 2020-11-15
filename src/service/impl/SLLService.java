package service.impl;

import dataStructure.singlyLinkedList.ISinglyLinkedList;
import dataStructure.singlyLinkedList.impl.SinglyLinkedList;
import model.Subject;
import service.IService;

public class SLLService implements IService {
    private final ISinglyLinkedList<Subject> sList = new SinglyLinkedList<>();

    @Override
    public int size() {
        return sList.size();
    }

    @Override
    public boolean add(Subject subject) {
        return sList.add(subject);
    }

    @Override
    public Subject update(int index, Subject subject) {
        return sList.set(index, subject);
    }

    @Override
    public Subject remove(int index) {
        return sList.remove(index);
    }

    @Override
    public String findAll() {
        StringBuilder subjects = new StringBuilder();
        int size = sList.size();
        for (int i = 0; i < size; i++) {
            String s = sList.get(i).getData().toString() + "\n";
            subjects.append(s);
        }
        return subjects.toString();
    }
}