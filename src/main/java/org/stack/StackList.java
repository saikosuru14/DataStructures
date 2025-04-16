package org.stack;

/**
 * @author PenchalaSai.Kosuru
 * @date 4/14/2025
 *
 * LinkedList based implementation of Stack
 */

public class StackList {
    private StackNode top;

    public StackList(){
        this.top = null;
    }

    //Insert node from head of LinkedList otherwise we can't pop
    public void push(int value){
        var newNode = new StackNode(value);
        newNode.next = top;
        top = newNode;
        System.out.println("Pushed: "+value);
    }

    //Popping from head
    public int pop(){
        if(isEmpty()) {
            System.out.println("Stack underflow");
            return -1;
        }else{
            int popValue = top.value;
            System.out.println("Popped: "+popValue);
            top = top.next;
            return popValue;
        }
    }

    public boolean isEmpty(){
        return top == null;
    }

    public int peek(){
        if(isEmpty()) {
            System.out.println("Stack underflow");
            return -1;
        }else{
            System.out.println("Peek: "+top.value);
            return top.value;
        }
    }

    public void traverse(){
        if(isEmpty()) {
            System.out.println("Stack underflow");
        }else{
            StackNode current  = top;
            while(current != null){
                System.out.print(current.value+" ");
                current = current.next;
            }
            System.out.println();
        }
    }

}
