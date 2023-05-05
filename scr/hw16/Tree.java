package hw16;

import java.util.LinkedList;
import java.util.Queue;

public class Tree {
    private Node root;

    public Tree() {
        this.root = null;
    }

    public void add(int value) {
        Node newNode = new Node();
        newNode.setValue(value);
        if (root == null) {
            root = newNode;
        } else {
            Node currentNode = root;
            Node parentNode;
            while (true) {
                parentNode = currentNode;
                if (value == currentNode.getValue()) {
                    return;
                } else if (value < currentNode.getValue()) {
                    currentNode = currentNode.getLeftChild();
                    if (currentNode == null) {
                        parentNode.setLeftChild(newNode);
                        return;
                    }
                } else {
                    currentNode = currentNode.getRightChild();
                    if (currentNode == null) {
                        parentNode.setRightChild(newNode);
                        return;
                    }
                }
            }
        }
    }
        public void iterate() {
            Queue<Node> queue = new LinkedList<>();
            Node currentNode = root;
            do {
                System.out.println(currentNode.getValue());
                if (currentNode.getLeftChild() != null) {
                    queue.offer(currentNode.getLeftChild());
                }
                if (currentNode.getRightChild() != null) {
                    queue.offer(currentNode.getRightChild());
                }
                if (!queue.isEmpty()) {
                    currentNode = queue.poll();
                } else {
                    break;
                }
            } while (true);
        }


        @Override
        public String toString() {
            return "Tree{" +
                    "root=" + root +
                    '}';
        }
    }
