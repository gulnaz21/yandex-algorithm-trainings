package Homework_8;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class B {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new FileReader("input.txt"));
        Tree_B tree = new Tree_B();
        int number = sc.nextInt();
        StringBuilder sb = new StringBuilder();
        while (number != 0){
            int count = tree.insertNode(number);
            if (count != 0)
                sb.append(count).append(" ");
            number = sc.nextInt();
        }
        System.out.println(sb);
    }
}

class Tree_B {
    private Node_B root;
    private int count;
    public Tree_B(){
        root = null;
    }
    public int insertNode(int value){
        Node_B node = new Node_B(value);
        if (root == null) {
            root = node;
            return 1;
        }
        else {
            Node_B currentNode = root;
            Node_B parentNode;
            count = 1;
            while (true) {
                parentNode = currentNode;
                if (value == currentNode.getValue()) {
                    return 0;
                }
                else if (value < currentNode.getValue()){
                    currentNode = currentNode.getLeftChild();
                    count++;
                    if (currentNode == null){
                        parentNode.setLeftChild(node);
                        return count;
                    }
                }
                else {
                    currentNode = currentNode.getRightChild();
                    count++;
                    if (currentNode == null){
                        parentNode.setRightChild(node);
                        return count;
                    }
                }
            }
        }
    }
}
class Node_B {
    private int value;
    private Node_B leftChild;
    private Node_B rightChild;

    public Node_B(int value){
        this.value = value;
    }

    public int getValue() {
        return value;
    }
    public Node_B getLeftChild(){
        return leftChild;
    }
    public Node_B getRightChild(){
        return rightChild;
    }
    public void setLeftChild(Node_B leftChild){
        this.leftChild = leftChild;
    }
    public void setRightChild(Node_B rightChild){
        this.rightChild = rightChild;
    }
}
