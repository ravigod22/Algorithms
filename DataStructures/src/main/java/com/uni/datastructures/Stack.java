package com.uni.datastructures;

/**
 *
 * @author jose
 */

public class Stack {
    private class Data {
        int value;
        Data pre;
        public Data(int value) {
            this.value = value;
            this.pre = null;
        }
    }
    Data head;
    int nelements;
    public Stack() {
        this.head = null;
        this.nelements = 0;
    }
    public boolean isEmpty() {
        return head == null;
    }
    public void push(int element) {
        Data NewElement = new Data(element);
        nelements += 1;
        if (isEmpty()) {
            head = NewElement;
        }
        else {
            NewElement.pre = head;
            head = NewElement;
        }
    }
    public void pop() {
        if (isEmpty()) {
            return;
        }
        nelements -= 1;
        if (nelements == 0) {
            head = null;
        }
        else {
            head = head.pre;
        }
    }
    public int top() {
        if (isEmpty()) {
            System.out.println("No existe el valor");
            return -1;
        }
        return head.value;
    }
    public void print() {
        if (isEmpty()) {
            System.out.println("Esta vacia");
            return;
        }
        Data aux = head;
        while (aux != null) {
            System.out.println(aux.value);
            aux = aux.pre;
        }
    }
    public int size() {
        return nelements;
    }
}
