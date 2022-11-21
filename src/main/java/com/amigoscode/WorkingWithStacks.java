package com.amigoscode;

import java.util.Stack;

public class WorkingWithStacks { //Stacks -> LIFO (Like a Pringles Chips)
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println(stack.peek()); //Give me the last number I put in.
        System.out.println(stack.size());
        System.out.println(stack.pop()); //Takes the last number and remove it
        System.out.println(stack.size());
        System.out.println(stack.empty());

    }
}
