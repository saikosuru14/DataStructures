package org.linkedlists;

import java.util.NoSuchElementException;

/**
 * Singly LinkedList Implementation
 */
public class LinkedList {
    private int size = 0;
    private class Node {
        private int value;
        private Node next;
        public Node(int value){
            this.value = value;
        }
    }

    private Node first;
    private Node last;

    //addLast
    public void addLast(int item){
        var node = new Node(item);
        if(isEmpty())
            first = last = node;
        else{
            last.next = node;
            last = node;
        }
        size++;
    }

    //addFirst
    public void addFirst(int item){
        var node = new Node(item);
        if(isEmpty())
            first = last = node;
        else{
            node.next = first;
            first = node;
        }
        size++;
    }

    private boolean isEmpty(){
        return first == null;
    }

    //indexOf
    public int indexOf(int item){
        int index = 0;
        var current = first;
        while(current != null){
            if(current.value == item)
                return index;
            current = current.next;
            index++;
        }
        return -1;
    }

    //contains
    public boolean contains(int item){
        return indexOf(item) != -1;
    }

    //deleteFirst
    public void removeFirst(){
        if(isEmpty())
            throw new NoSuchElementException();
        if(first == last)
            first = last = null;
        else{
            var second = first.next;
            first.next = null;
            first = second;
        }
        size--;
    }

    //deleteLast
    public void removeLast(){
        if(isEmpty())
            throw new NoSuchElementException();
        if(first == last)
            first = last =null;
        else{
            //[10 -> 20 -> 30]
            //previous -> 20
            //last -> 30
            var previous = getPrevious(last);
            last = previous;
            last.next = null;
        }
        size--;
    }

    private Node getPrevious(Node node){
        var current = first;
        while(current != null){
            if(current.next == node)
                return current;
            current = current.next;
        }
        return null;
    }

    public int size(){
        return size;
    }

    public int[] toArray(){
        int[] array = new int[size];
        var current = first;
        int index = 0;
        while(current != null){
            array[index++] = current.value;
            current = current.next;
        }
        return array;
    }
}
