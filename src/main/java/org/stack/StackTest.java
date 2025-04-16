package org.stack;

/**
 * @author PenchalaSai.Kosuru
 * @date 4/14/2025
 */

public class StackTest {
    public static void main(String[] args){

        //Testing Array based implementation of Stack
        Stack stack = new Stack(5);
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
        stack.traverse();
        stack.push(60);
        stack.pop();
        stack.peek();
        stack.traverse();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();

        //Testing LinkedList based implementation of Stack
        StackList stackList = new StackList();
        stackList.push(10);
        stackList.push(20);
        stackList.push(30);
        stackList.push(40);
        stackList.push(50);
        stackList.traverse();
        stackList.pop();
        stackList.peek();
        stackList.pop();
        stackList.pop();
        stackList.pop();
        stackList.pop();
        stackList.pop();
    }
}
