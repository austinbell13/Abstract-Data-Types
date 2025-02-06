/**
 * Copyright (c) 2025 Sami Menik, PhD. All rights reserved.
 * 
 * Unauthorized copying of this file, via any medium, is strictly prohibited.
 * This software is provided "as is," without warranty of any kind.
 */
package adt.examples;

import adt.api.List;
import adt.impl.LinkedList;
import adt.viz.Graph;

public class LinkedListExample {
    
    public static void main(String[] args) {
        List<String> lst = new LinkedList<>();

        Graph.i().setRef("lst", lst); // For visualization.

        lst.insertItem("A");
        lst.insertItem("B");
        lst.insertItem("C");
        lst.insertItem("D");
        lst.insertItem("E");
    }

}
