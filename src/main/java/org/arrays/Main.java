package org.arrays;

import java.util.ArrayList;
import java.util.Arrays;

//Arrays Implementation
public class Main {

    public static void main(String[] args) {
/*
        System.out.println("Hello world!");

        //Array creation in Java
        int[] arr = new int[3];
        System.out.println(arr);
        System.out.println(Arrays.toString(arr));

        int[] digits = {1,2,3,4,5};
        System.out.println(Arrays.toString(digits)+" Size of array is "+digits.length);
*/
//
        //Using our own array class methods
        Array numbers = new Array(3);
        System.out.println(Arrays.toString(new Array[]{numbers}));
        numbers.insert(10);
        numbers.insert(20);
        numbers.insert(30);
        numbers.insert(40);
        numbers.print(); // 10 20 30 40
        System.out.println(numbers.indexOf(10)); // 0
        System.out.println(numbers.indexOf(20)); // 1
        numbers.removeAt(0);
        System.out.println(numbers.indexOf(20)); // 0
        System.out.println(numbers.indexOf(200)); // -1
        numbers.print(); // 20 30 40
//
/*
        //Java Collection Array Implementation java.util=> ArrayList & Vector
        //Vector: grows 100% of size i.e, 2x , All methods -> Synchronized, ThreadSafe, Relatively Slow Performance
        //ArrayList: grows 50% i.e, [size + size * (3/2)+1] -> Non synchronized, Multiple threads can access (No ThreadSafety) , Relatively high performance

        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(10);
        list.add(20);
        list.add(30);
        System.out.println(list);
        list.remove(1);
        System.out.println(list);
        System.out.println(list.indexOf(30));
        list.add(40);
        list.add(50);
        list.add(30);
        System.out.println(list);
        System.out.println(list.lastIndexOf(30));
        System.out.println(list.contains(40));

        Object[] listArray = list.toArray();

        System.out.println("Object type array:");
        for(Object i : listArray){
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.println(list);

 */
    }

}