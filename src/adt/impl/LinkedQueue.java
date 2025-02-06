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

import adt.api.Queue;

public class LinkedQueue<T> implements Queue<T> {

    private LinkedNode<T> head;
    private LinkedNode<T> tmp;
    private int size;

    public LinkedQueue() {
        head = null;
        tmp = null;
        size = 0;
    }

    @Override
    public void enqueue(T item) {
        LinkedNode<T> node = new LinkedNode<>(item);
        if (size == 0) {
            head = node;
            tmp = node;
        }
        tmp.setNext(node);
        tmp = node;
        size++;
    }

    @Override
    public T dequeue() {
        if (size == 0) {
            throw new IllegalStateException("Deque is empty!");
        }
        T item = head.getValue();
        head = head.getNext();
        size--;
        return item;
    }

    @Override
    public T peek() {
        if (size == 0) {
            throw new IllegalStateException("Deque is empty!");
        }
        return head.getValue();
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public int size() {
        return size;
    }

}