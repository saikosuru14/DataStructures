package org.linkedlists;

import java.util.Arrays;

public class ListTest {
    public static void main(String[] args){

    //Test our own LinkedList class methods
        LinkedList list = new LinkedList();
        System.out.println(list.size());
        list.addLast(10);

        System.out.println(list.size());
        list.addLast(20);
        list.addLast(30);
        System.out.println(list.size());
        list.addFirst(05);
        System.out.println(list.size());
        list.removeFirst();
        System.out.println(list.size());

        System.out.println(list.contains(05));
        System.out.println(list.indexOf(10));
        System.out.println(list.contains(40));

        var array = list.toArray();
        System.out.println(Arrays.toString(array));
    }
}
