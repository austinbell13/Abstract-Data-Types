/**
 * Copyright (c) 2025 Sami Menik, PhD. All rights reserved.
 * 
 * Unauthorized copying of this file, via any medium, is strictly prohibited.
 * This software is provided "as is," without warranty of any kind.
 */
package adt.examples;

import adt.api.Queue;
import adt.impl.ArrayQueue;
import adt.viz.Graph;

public class ArrayQueueExample {
    
    public static void main(String[] args) {
        // We internally use a singly linked list with a tail reference.
        Queue<String> queue = new ArrayQueue<>();

        Graph.i().setRef("queue", queue); // For visualization.

        queue.enqueue("A");
        queue.enqueue("B");
        queue.enqueue("C");
        queue.enqueue("D");
        queue.enqueue("E");

        int size0 = queue.size();

        String v1 = queue.dequeue();
        String v2 = queue.dequeue();
        String v3 = queue.dequeue();
        String v4 = queue.dequeue();

        queue.enqueue("F");
        queue.enqueue("G");
        queue.enqueue("H");
        queue.enqueue("I");
        queue.enqueue("J");
        queue.enqueue("K");
        queue.enqueue("L");
        queue.enqueue("M");

        int size1 = queue.size();

        boolean empty0 = queue.isEmpty();
    }

}
