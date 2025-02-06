/**
 * Copyright (c) 2025 Sami Menik, PhD. All rights reserved.
 * 
 * Unauthorized copying of this file, via any medium, is strictly prohibited.
 * This software is provided "as is," without warranty of any kind.
 */
package adt.examples;

import adt.api.List;
import adt.impl.ArrayList;
import adt.viz.Graph;

public class ArrayListExample {
    
    public static void main(String[] args) {
        List<String> lst = new ArrayList<>();

        Graph.i().setRef("lst", lst); // For visualization.

        lst.insertItem("A");
        lst.insertItem("B");
        lst.insertItem("C");
        lst.insertItem("D");
        lst.insertItem("E");

        lst.searchItem("D");
        lst.searchItem("Z");

        for (int i = 0; lst.size() <= 8; ++i ) {
            lst.insertItem(String.valueOf(i));
        }

        for (int i = 0; lst.size() > 0; ++i) {
            lst.deleteItemAt(lst.size() - 1);
        }
    }

}
