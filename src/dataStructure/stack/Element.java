package dataStructure.stack;

public class Element<T> {
    private final T data;
    private Element<T> preElement;

    public Element(T data) {
        this.data = data;
        this.preElement = null;
    }

    public T getData() {
        return data;
    }

    public Element<T> getPreElement() {
        return preElement;
    }

    public void setPreElement(Element<T> preElement) {
        this.preElement = preElement;
    }
}