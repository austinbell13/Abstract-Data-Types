/**
 * Copyright (c) 2025 Sami Menik, PhD. All rights reserved.
 * 
 * Unauthorized copying of this file, via any medium, is strictly prohibited.
 * This software is provided "as is," without warranty of any kind.
 */
package adt.examples;

import adt.api.Stack;
import adt.impl.LinkedStack;
import adt.viz.Graph;

public class LinkedStackExample {
    
    public static void main(String[] args) {
        // We internally use a singly linked list.
        Stack<String> stack = new LinkedStack<>();

        Graph.i().setRef("stack", stack); // For visualization.

        stack.push("A");
        stack.push("B");
        stack.push("C");
        stack.push("D");
        stack.push("E");

        int size0 = stack.size();

        String v1 = stack.pop();
        String v2 = stack.pop();
        String v3 = stack.peek();
        String v4 = stack.peek();

        int size1 = stack.size();

        boolean empty0 = stack.isEmpty();
    }

}
