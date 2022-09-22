package com.bridgelabz;

import java.util.ArrayList;

public class MyhashMap<K, V> {
    public MyMapNode<K, V> head;
    public MyMapNode<K, V> search(K key) {
        MyMapNode<K, V> currnode = head;
        while (currnode != null) {
            if (currnode.key.equals(key)) {
                return currnode;
            }
            currnode = currnode.getNext();
        }
        return null;
    }
    public void append(MyMapNode<K, V> myMapNode) {
        if (head == null) {
            head = myMapNode;
            return;
        }
        MyMapNode<K, V> currnode = head;
        while (currnode.next != null) {
            currnode = currnode.next;
        }
        currnode.next = myMapNode;
    }


    public V get(K key) {
        MyMapNode<K, V> myMapNode = (MyMapNode<K, V>) this.search(key);
        return (myMapNode == null) ? null : myMapNode.getValue();

    }
    public void add(K key, V value) {
        MyMapNode<K, V> myMapNode = (MyMapNode<K, V>) this.search(key);
        if (myMapNode == null) {
            myMapNode = new MyMapNode<>(key, value);
            this.append(myMapNode);
        } else {
            myMapNode.setValue(value);
        }
    }
    public void remove(K key) {
        {
            MyMapNode currentNode = head;
            MyMapNode previousNode = null;
            while (currentNode != null && currentNode.getKey().equals(key)) {
                head = currentNode.getNext();
                return;
            }
            while (currentNode != null && !(currentNode.getKey().equals(key))) {
                previousNode = currentNode;
                currentNode = currentNode.getNext();
            }
            if (currentNode != null) {
                previousNode.next = currentNode.next;
            }
            if (currentNode == null)
                System.out.println(" Word not found! ");
        }
    }
    @Override
    public String toString() {
        return "MyhashMap{" +
                "head=" + head +
                '}';
    }
}
