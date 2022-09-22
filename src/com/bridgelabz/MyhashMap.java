package com.bridgelabz;

import java.util.ArrayList;

public class MyhashMap<K, V> {
    private final int numBuckets;
    MyLinkedlist<K, V> myLinkedlist;
    ArrayList<MyLinkedlist<K, V>> myBucketArray;

    public MyhashMap() {
        this.numBuckets = 10;
        this.myBucketArray = new ArrayList<>(numBuckets);
        this.myLinkedlist = new MyLinkedlist<>();
        for (int i = 0; i < numBuckets; i++) {
            this.myBucketArray.add(null);
        }
    }

    private int getBucketIndex(K key) {
        int hashCode = Math.abs(key.hashCode());
        int index = hashCode % numBuckets;
        return index;
    }

    public V get(K key) {
        int index = this.getBucketIndex(key);
        MyLinkedlist<K, V> myLinkedlist = this.myBucketArray.get(index);
        if (myLinkedlist == null) return null;
        MyMapNode<K, V> myMapNode = (MyMapNode<K, V>) this.myLinkedlist.search(key);
        return (myMapNode == null) ? null : myMapNode.getValue();

    }

    public void add(K key, V value) {
        int index = this.getBucketIndex(key);
        MyLinkedlist<K, V> myLinkedlist = this.myBucketArray.get(index);
        if (myLinkedlist == null) {
            myLinkedlist = new MyLinkedlist<>();
            this.myBucketArray.set(index, myLinkedlist);
        }
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
                "myLinkedlist=" + myBucketArray +
                '}';
    }
}
