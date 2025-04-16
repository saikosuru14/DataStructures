package org.stack;

/**
 * @author PenchalaSai.Kosuru
 * @date 4/14/2025
 *
 * Array based implementation of Stack
 */

public class Stack {
    private int maxSize;
    private int[] stackArray;
    private int top;
    public Stack(int size){
        this.maxSize = size;
        stackArray = new int[maxSize];
        top = -1;
    }

    //push
    public void push(int value){
        if(isFull()) {
            System.out.println("Stack is already full "+ value+" can't be pushed");
            return;
        }
        else {
            stackArray[++top] = value;
            System.out.println("Pushed: " + value);
        }
    }

    public boolean isFull(){
        return top == maxSize-1;
    }

    public int pop(){
        if(isEmpty()){
            System.out.println("Stack is underflow");
            return -1;
        } else{
            System.out.println("Popped: "+ stackArray[top]);
            return stackArray[top--];
        }
    }
    public boolean isEmpty(){
        return top == -1;
    }

    public int peek(){
        if(isEmpty()){
            System.out.println("Stack underflow");
            return -1;
        }else{
            System.out.println("Peek element: "+stackArray[top]);
            return stackArray[top];
        }
    }
    public void traverse(){
        if(isEmpty()){
            System.out.println("Stack underflow");
        }else{
            for(int i=0; i<=top; i++)
                System.out.print(stackArray[i]+" ");
            System.out.println();
        }
    }

}
