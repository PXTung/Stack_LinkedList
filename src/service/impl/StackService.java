package service.impl;

import dataStructure.stack.IStack;
import dataStructure.stack.impl.Stack;
import model.Subject;
import service.IService;

public class StackService implements IService {

    private final IStack<Subject> stack = new Stack<>();

    @Override
    public int size() {
        return stack.size();
    }

    @Override
    public boolean add(Subject subject) {
        return stack.push(subject) != null;
    }

    @Override
    public Subject update(int index, Subject subject) {
        if (stack.empty()) return null;

        stack.pop();
        return stack.push(subject);
    }

    @Override
    public Subject remove(int index) {
        return stack.pop();
    }

    @Override
    public String findAll() {
        return stack.findAll();
    }
}