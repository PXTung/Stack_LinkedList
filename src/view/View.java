package view;


import controller.Controller;
import model.Subject;

public class View {
    private static final Controller controller = new Controller();

    public static void main(String[] args) {
        int type;
        while (true) {
            type = Menu.INSTANCE.type();
            if (type == 0) break;

            controller.getService(type);
            int menu;
            do {
                int size = controller.size();
                menu = Menu.INSTANCE.menu(type, size);
                switch (menu) {
                    case 1 -> add();
                    case 2 -> update(type, size);
                    case 3 -> remove(type, size);
                    case 4 -> show();
                    case 0 -> back();
                }
            } while (menu != 0);
        }
    }

    private static void back() {
    }

    private static void show() {
        String subjects = controller.findAll();
        System.out.println(subjects.equals("") ? "EMPTY" : subjects);
    }

    private static void remove(int type, int size) {
        Subject subject;
        int index = -1;
        if (type == 1) {
            subject = controller.remove(index);
            System.out.println(subject);
        } else {
            index = Menu.INSTANCE.index("REMOVE");
            if (index >= size)
                System.out.println("INDEX OUT OF BOUND");
            else {
                subject = controller.remove(index);
                System.out.println(subject);
            }
        }
    }

    private static void update(int type, int size) {
        Subject subject;
        int index = -1;
        if (type == 1) {
            if (size == 0)
                System.out.println("STACK IS EMPTY");
            else {
                subject = Menu.INSTANCE.subject();
                subject = controller.update(index, subject);
                System.out.println(subject);
            }
        } else {
            index = Menu.INSTANCE.index("UPDATE");
            if (index >= size)
                System.out.println("INDEX OUT OF BOUND");
            else {
                subject = Menu.INSTANCE.subject();
                subject = controller.update(index, subject);
                System.out.println(subject);
            }
        }
    }

    private static void add() {
        Subject subject = Menu.INSTANCE.subject();
        controller.add(subject);
    }
}