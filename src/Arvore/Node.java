package Arvore;

public class Node<T> {
    private T value;

    private Node<T> leftNode;

    private Node<T> rightNode;

    public Node(T value) {
        this.value = value;
        this.leftNode = null;
        this.rightNode = null;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public Node<T> getLeftNode() {
        return leftNode;
    }

    public void setLeftNode(Node<T> leftNode) {
        this.leftNode = leftNode;
    }

    public Node<T> getRightNode() {
        return rightNode;
    }

    public void setRightNode(Node<T> rightNode) {
        this.rightNode = rightNode;
    }
}
