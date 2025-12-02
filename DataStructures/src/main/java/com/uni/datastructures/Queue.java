package com.uni.datastructures;

/**
 *
 * @author jose
 */

public class Queue {
    private class Data {
        int value;
        Data nxt;
        public Data(int value) {
            this.value = value;
            this.nxt = null;
        }
    }
    
    Data head;
    Data tail;
    int nelements;
    public Queue() {
        this.head = null;
        this.tail = null;
        this.nelements = 0;
    }
    public boolean isEmpty() {
        return this.head == null;
    }
    public void push(int element){
        nelements += 1;
        Data NewElement = new Data(element);
        if (isEmpty()) {
            head = NewElement;
        }
        else {
            tail.nxt = NewElement;
        }
        tail = NewElement;
    }
    public void pop() {
        if (isEmpty()) {
            return;
        }
        nelements -= 1;
        head = head.nxt;
    }
    public int front() {
        if (isEmpty()) {
            return -1;
        }
        return head.value;
    }
    public int size() {
        return nelements;
    }
    public void print() {
        if (isEmpty()) {
            System.out.println("Esta vacia");
            return;
        }
        Data aux = head;
        while (aux != null) {
            System.out.println(aux.value);
            aux = aux.nxt;
        }
    }
}
