package com.bridgelabz;

public class MyLinkedlist<K, V> {
    public MyMapNode<K, V> head;

    public MyMapNode<K, V> search(K key) {
        MyMapNode<K, V> currnode = head;
        while (currnode != null) {
            if (currnode.key.equals(key)) {
                return currnode;
            }
            currnode = currnode.next;
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

    @Override
    public String toString() {
        return "MyLinkedlist{" +
                "head=" + head +
                '}';
    }
}
