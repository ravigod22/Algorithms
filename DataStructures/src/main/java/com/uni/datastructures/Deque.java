package com.uni.datastructures;

/**
 *
 * @author jose
 */
public class Deque {
    private class Data {
        int value;
        Data nxt;
        Data pre;
        public Data(int value) {
            this.value = value;
            this.nxt = null;
            this.pre = null;
        }
    }
    
    Data head;
    Data tail;
    int nelements;
    public Deque() {
        this.head = null;
        this.tail = null;
        this.nelements = 0;
    }
    public boolean isEmpty() {
        return head == null;
    }
    public void push_front(int element) {
        Data NewElement = new Data(element);
        nelements += 1;
        if (isEmpty()) {
            head = NewElement;
            tail = NewElement;
        }
        else {
            NewElement.nxt = head;
            head.pre = NewElement;
            head = NewElement;
        }
    }
    public void push_back(int element) {
        Data NewElement = new Data(element);
        nelements += 1;
        if (isEmpty()) {
            head = NewElement;
            tail = NewElement;
        }
        else {
            NewElement.pre = tail;
            tail.nxt = NewElement;
            tail = NewElement;
        }
    }
    public void pop_front() {
        if (isEmpty()) {
            return;
        }
        nelements -= 1;
        if (nelements == 0) {
            head = null;
            tail = null;
        }
        else {
            head = head.nxt;
            head.pre = null;
        }
    }
    public void pop_back() {
        if (isEmpty()) {
            return;   
        }
        nelements -= 1;
        if (nelements == 0) {
            head = null;
            tail = null;
        }
        else {
            tail = tail.pre;
            tail.nxt = null;
        }
    }
    public int front() {
        if (isEmpty()) {
            System.out.println("No hay valor");
            return -1;
        }
        return head.value;
    }
    public int back() {
        if (isEmpty()) {
            System.out.println("No hay valor");
            return -1;
        }
        return tail.value;
    }
    public int size() {
        return nelements;
    }
}
