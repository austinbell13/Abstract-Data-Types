/**
 * Copyright (c) 2025 Sami Menik, PhD. Original work.
 * Modified by Austin Bell, 2025.
 *
 * This file has been modified from its original version.
 * Some portions may still reflect the original work of Sami Menik, PhD.
 *
 * Unauthorized copying of this file, via any medium, is strictly prohibited
 * unless permitted under applicable licensing terms.
 * This software is provided "as is," without warranty of any kind.
 */
package adt.impl;

import adt.api.Stack;

public class ArrayStack<T> implements Stack<T> {

    private final ArrayList<T> stack;
    private int top = -1;

    public ArrayStack() {
       stack = new ArrayList<>();
    }

    @Override
    public void push(T item) {
        stack.insertItem(item);
        top++;
    }

    @Override
    public T pop() {
        if (top == -1) {
            throw new IllegalStateException("Stack is empty!");
        }
        T topItem = stack.getItem(top);
        top--;
        return topItem;
    }

    @Override
    public T peek() {
        if (top == -1) {
            throw new IllegalStateException("Stack is empty!");
        }
        return stack.getItem(top);
    }

    @Override
    public boolean isEmpty() {
        return (top == -1);
    }

    @Override
    public int size() {
        return (top + 1);
    }
}