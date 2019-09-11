package com.priyank.list;

public class LinkedList<T extends Comparable<T>> implements List<T> {

    private Node<T> root; // root node
    private int sizeCounter;

    @Override
    public void insert(T data) {
        ++this.sizeCounter;

        if(root==null){
            root = new Node<>(data);
        }else {
            //insertDataBeginning(data);
            insertDataEnd(data , root);
        }

    }

    @Override
    public void remove(T data) {

        if(this.root==null){
            return; //empty list
        }

        --this.sizeCounter;

        if (this.root.getData().compareTo(data) == 0) {
            this.root = this.root.getNextNode();
        } else {
            remove(data, root, root.getNextNode());
        }



    }

    @Override
    public void traverseList() {

        if(this.root==null){
            return; //nothing to show , return from the list
        }
        Node<T> node = this.root;
        while(node!=null){
            //traverse untill the node is null
            System.out.print(node + " ");
            node = node.getNextNode();
        }

    }

    @Override
    public int size() {
        return this.sizeCounter;
    }

    //O(1) : insertion at the beginning
    private void insertDataBeginning(T data){
        Node<T> newNode = new Node<>(data);
        newNode.setNextNode(root);
        this.root = newNode;
    }
    //O(n) : insertion at the end
    private void insertDataEnd(T data , Node<T> node){
        if(node.getNextNode()!=null){
            insertDataEnd(data , node.getNextNode()); //traversing till the end of the list
        }else {
            Node<T> newNode = new Node<>(data);
            node.setNextNode(newNode);
        }
    }

    private void remove(T dataToRemove, Node<T> previousNode, Node<T> actualNode) {

        while (actualNode != null) {

            if (actualNode.getData().compareTo(dataToRemove) == 0) {
                previousNode.setNextNode(actualNode.getNextNode());
                actualNode = null;
                return;
            }

            previousNode = actualNode;
            actualNode = actualNode.getNextNode();
        }
    }

    public void reverseList(){



    }

}
