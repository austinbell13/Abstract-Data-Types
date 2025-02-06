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

/**
 * A stack implementation using a linked list.
 * 
 * @param <T> The type of elements stored in the stack.
 */
public class LinkedStack<T> implements Stack<T> {

    private LinkedNode<T> head;
    private int size;

    /**
     * Constructs an empty LinkedStack.
     */
    public LinkedStack() {
        this.head = null;
        this.size = 0;
    }

    @Override
    public void push(T item) {
        LinkedNode<T> node = new LinkedNode<>(item);    // constructs 'node' from item
        node.setNext(head);                             // node points to previous head node
        head = node;                                    // updates head node to reference newly inserted node
        size++;
    }

    @Override
    public T pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty!");
        }
        T item = head.getValue();
        head = head.getNext();
        size--;
        return item;
    }

    @Override
    public T peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty!");
        }
        return head.getValue();
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

}