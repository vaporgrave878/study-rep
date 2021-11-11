package com.java.study.fiveSystems;

import java.util.*;

public class MyLinkedList<T>{

    private static class Node<T>{
        T element;
        Node<T> next;

        public Node(T element) {
            this.element = element;
        }
    }

    private int size = 0;
    private Node<T> head;
    private Node<T> tail;

    public void add(T element){
        Node<T> newNode = new Node<>(element);
        if (isEmpty())
            head = tail = newNode;
        tail.next = newNode;
        tail = newNode;
        size++;
    }

    public void add(int index, T element){
        Node<T> newNode = new Node<>(element);
        if (isEmpty()){
            head = tail = newNode;
        } else if(index == 0){
            head.next = newNode;
            head = newNode;
        } else if (index == size){
            tail.next = newNode;
            tail = newNode;
        } else {
            Node<T> prev = findNodeByIndex(index - 1);
            newNode.next = prev.next;
            prev.next = newNode;
        }
        size++;
    }

    public int size(){
        return size;
    }

    public boolean isEmpty(){
        return head == null;
    }

    public Node<T> findNodeByIndex(int index){
        Node<T> current = head;
        for (int i = 0; i < index; i++){
            current = current.next;
        }
        return current;
    }

    public void set(int index, T element){
        Node<T> node = findNodeByIndex(index);
        node.element = element;
    }

    public T get(int index){
        return findNodeByIndex(index).element;
    }

    public T getFirst(){
        if (isEmpty())
            throw new NoSuchElementException();
        return get(0);
    }

    public T getLast(){
        if (isEmpty())
            throw new NoSuchElementException();
        return get(size - 1);
    }

    public T remove(int index){
        T removedElement;
        Node<T> prev = findNodeByIndex(index - 1);
        if (index == 0){
            removedElement = head.element;
            head = head.next;
        } else if (index == size - 1){
            tail = prev;
        }
        removedElement = prev.element;
        prev.next = prev.next.next;
        size--;
        return removedElement;
    }

    public void clear(){
        head = tail = null;
        size = 0;
    }

    public void print(){
        Node<T> newNode = head;
        while (newNode != null){
            System.out.println(newNode.element);
            newNode = newNode.next;
        }
    }
}
