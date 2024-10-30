package Homework_8;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class A {
    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(new FileReader("input.txt"));
        Tree tree = new Tree();
        int number = sc.nextInt();
        while (number != 0){
            tree.insertNode(number);
            number = sc.nextInt();
        }
        System.out.println(tree.getCount());
    }
}

class Tree {
    private Node root;
    private int count;
    public Tree(){
        root = null;
    }
    public int getCount(){
        return count;
    }
    public void insertNode(int value){
        Node node = new Node(value);
        if (root == null) {
            root = node;
            count = 1;
        }
        else {
            Node currentNode = root;
            Node parentNode;
            int temp = 1;
            while (true) {
                parentNode = currentNode;
                if (value == currentNode.getValue())
                    return;
                else if (value < currentNode.getValue()){
                    currentNode = currentNode.getLeftChild();
                    temp++;
                    if (currentNode == null){
                        parentNode.setLeftChild(node);
                        if (temp > count)
                            count = temp;
                        return;
                    }
                }
                else {
                    currentNode = currentNode.getRightChild();
                    temp++;
                    if (currentNode == null){
                        parentNode.setRightChild(node);
                        if (temp > count)
                            count = temp;
                        return;
                    }
                }
            }
        }
    }
}
class Node {
    private final int value;
    private Node leftChild;
    private Node rightChild;

    public Node(int value){
        this.value = value;
    }

    public int getValue() {
        return value;
    }
    public Node getLeftChild(){
        return leftChild;
    }
    public Node getRightChild(){
        return rightChild;
    }
    public void setLeftChild(Node leftChild){
        this.leftChild = leftChild;
    }
    public void setRightChild(Node rightChild){
        this.rightChild = rightChild;
    }
}
