/**
 * Copyright (c) 2025 Sami Menik, PhD. All rights reserved.
 * 
 * Unauthorized copying of this file, via any medium, is strictly prohibited.
 * This software is provided "as is," without warranty of any kind.
 */
package adt.examples;

import adt.api.Deque;
import adt.impl.LinkedDeque;
import adt.viz.Graph;

public class LinkedDequeExample {
    
    public static void main(String[] args) {
        // We internally use a doubly linked list.
        Deque<String> deque = new LinkedDeque<>();

        Graph.i().setRef("deque", deque); // For visualization.

        deque.addLast("A");
        deque.addLast("B");
        deque.addLast("C");
        deque.addLast("D");
        deque.addLast("E");

        int size0 = deque.size();

        String v1 = deque.removeLast();
        String v2 = deque.removeLast();
        String v3 = deque.removeLast();
        String v4 = deque.removeLast();

        int size1 = deque.size();

        boolean empty0 = deque.isEmpty();

        deque.addFirst("A");
        deque.addFirst("B");
        deque.addFirst("C");
        deque.addFirst("D");
        deque.addFirst("E");

        int size2 = deque.size();

        String v5 = deque.removeLast();
        String v6 = deque.removeLast();
        String v7 = deque.removeFirst();
        String v8 = deque.removeFirst();

        int size3 = deque.size();

        boolean empty1 = deque.isEmpty();
    }

}
