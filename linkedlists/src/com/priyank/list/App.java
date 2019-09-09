package com.priyank.list;

public class App {

    public static void main(String[] args) {
        List<Integer> linkedList = new LinkedList<>();
        linkedList.insert(10);
        linkedList.insert(12);
        linkedList.insert(13);
        linkedList.insert(14);
        linkedList.insert(15);

        linkedList.traverseList();
        System.out.println("\nRemoving 10 and 14 ");
        linkedList.remove(10);
        linkedList.remove(14);

        linkedList.traverseList();
    }
}
