package com.bridgelabz;

import java.util.LinkedList;

public class MyhashMap<K, V> {
    MyLinkedlist<K, V> myLinkedlist;

    public MyhashMap() {
        this.myLinkedlist = new MyLinkedlist<>();
    }

    public V get(K key) {
        MyMapNode<K, V> myMapNode = (MyMapNode<K, V>) this.myLinkedlist.search(key);
        return (myMapNode == null) ? null : myMapNode.getValue();

    }

    public void add(K key, V value) {
        MyMapNode<K, V> myMapNode = (MyMapNode<K, V>) this.myLinkedlist.search(key);
        if (myMapNode == null) {
            myMapNode = new MyMapNode<>(key, value);
            this.myLinkedlist.append(myMapNode);
        } else {
            myMapNode.setValue(value);
        }
    }

    @Override
    public String toString() {
        return "MyhashMap{" +
                "myLinkedlist=" + myLinkedlist +
                '}';
    }
}
