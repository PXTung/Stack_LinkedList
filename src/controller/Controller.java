package controller;

import model.Subject;
import service.IService;
import service.impl.DLLService;
import service.impl.SLLService;
import service.impl.StackService;

public class Controller {
    private static IService service;
    private static final IService stackService = new StackService();
    private static final IService sllService = new SLLService();
    private static final IService dllService = new DLLService();


    public void getService(int type) {
        switch (type) {
            case 1 -> service = stackService;
            case 2 -> service = sllService;
            case 3 -> service = dllService;
        }
    }

    public int size() {
        return service.size();
    }

    public boolean add(Subject subject) {
        return service.add(subject);
    }

    public Subject update(int index, Subject subject) {
        return service.update(index, subject);
    }

    public Subject remove(int index) {
        return service.remove(index);
    }

    public String findAll() {
        return service.findAll();
    }
}