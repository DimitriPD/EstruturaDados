package Arvore;

public class Arvore<T extends Comparable> {
    private Node<T> root;

    public Arvore() {
        this.root = null;
    }

    public Node<T> getRoot() {
        return root;
    }
    
    public void add(T value) {
        Node<T> newNode = new Node<T>(value);

        if (this.root == null) {
            this.root = newNode;
        } else {
            Node<T> currentNode = this.root;
            boolean addedNode = false;
            while (addedNode == false) {
                if (newNode.getValue().compareTo(currentNode.getValue()) == -1) {
                    if (currentNode.getLeftNode() != null) {
                        currentNode = currentNode.getLeftNode();
                    } else {
                        currentNode.setLeftNode(newNode);
                        addedNode = true;
                    }
                } else {
                    if (currentNode.getRightNode() != null) {
                        currentNode = currentNode.getRightNode();
                    } else {
                        currentNode.setRightNode(newNode);
                        addedNode = true;
                    }
                }
            }
        }
    }

    public void InOrder(Node<T> currentNode) {
        if (currentNode != null) {
            InOrder(currentNode.getLeftNode());
            System.out.println(currentNode.getValue());
            InOrder(currentNode.getRightNode());
        }

    }
}
