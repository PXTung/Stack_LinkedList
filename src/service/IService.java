package service;

import model.Subject;

public interface IService {
    int size();
    boolean add(Subject subject);
    Subject update(int index, Subject subject);
    Subject remove(int index);
    String findAll();
}