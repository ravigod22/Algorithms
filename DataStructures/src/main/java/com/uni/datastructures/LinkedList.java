package com.uni.datastructures;

/**
 *
 * @author jose
 */
public class LinkedList {
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
    public LinkedList() {
        this.head = null;
        this.tail = null;
        this.nelements = 0;
    }
    public boolean isEmpty() {
        return head == null;
    }
    public void insert(int pos, int value) {
        if (pos < 0 || pos > nelements) {
            System.out.println("Posicion inexistente");
            return;
        }
        Data NewElement = new Data(value);
        if (nelements == 0) {
            head = NewElement; 
            tail = NewElement;
            nelements += 1;
            return;
        }
        if (pos == 0) {
            NewElement.nxt = head;
            head = NewElement;
        }
        else if (pos == nelements) {
            tail.nxt = NewElement;
            tail = NewElement;
        }
        else {
            Data aux = head;
            for (int i = 0; i < pos - 1; i++) {
                aux = aux.nxt;
            }
            NewElement.nxt = aux.nxt;
            aux.nxt = NewElement;
        }
        nelements += 1;
    }
    public void erase(int pos) {
        if (pos <= 0 || pos > nelements) {
            System.out.println("No existe esa posicion");
            return;
        }
        if (nelements == 1) {
            head = null;
            tail = null;
            nelements = 0;
            return;
        }
        if (pos == 1) {
            head = head.nxt;
        }
        else {
            Data aux = head;
            for (int i = 0; i < pos - 1; ++i) {
                aux = aux.nxt;
            }
            if (pos == nelements) {
                aux.nxt = null;
                tail = aux;
            }
            else {
                aux.nxt = aux.nxt.nxt;
            }
        }
        nelements -= 1;
    }
}
