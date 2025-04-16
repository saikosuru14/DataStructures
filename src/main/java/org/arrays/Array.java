package org.arrays;

//Developing our own Array class with required methods
public class Array {

    //Array reference to hold integer array object
    private int[] items;

    //To keep track of number of items in the array
    private int count=0;

    //Constructor to create an array of given size and assign it reference variable
    public Array(int length){
        items = new int[length];
    }

    //Print array elements one by one
    public void print(){
        for(int i=0; i< count; i++)
            System.out.println(items[i]);
    }

    //Insert an element at end of the array
    public void insert(int item){
        //If the array is full, resize it
        if(items.length == count){
            //Create a new array (twice the size)
            int[] newItems = new int[count*2];
            //Copy all the existing items
            for(int i=0; i<count; i++)
                newItems[i] = items[i];
            //Set "items" to this new array
            items = newItems;
        }
        //Add new item at the end
        items[count++] = item;
    }

    //To remove an element at given index of the array
    public void removeAt(int index){
        //Validate the index
        if(index < 0 || index>=count) // If count = 4 then index of last item is 3
            throw new IllegalArgumentException();
        //Shift items to the left to fill the hole
        for(int i = index; i<count; i++)
            items[i] = items[i+1];
        count--;
    }

    //Returns first index of given element of array
    public int indexOf(int item){
        //If we find it, return index
        //Otherwise, return -1 ==>Time Complexity: O(n)
        for(int i=0; i<count; i++){
            if(items[i] == item)
                return i;
        }
        return -1;
    }
}
