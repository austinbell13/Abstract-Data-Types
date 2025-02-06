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

import adt.api.Deque;

public class ArrayDeque<E> implements Deque<E> {

    private E[] store;
    private int front;
    private int back;
    private int size;
    private static final int INIT_SIZE = 4;

    @SuppressWarnings("unchecked")
    public ArrayDeque() {
        store = (E[]) new Object[INIT_SIZE];
        front = 0;
        back = 0;
        size = 0;
    }

    @Override
    public void addFirst(E element) {
        if (size == store.length) {
            resize(store.length * 2);
        }
        front = (front - 1 + store.length) % store.length;
        store[front] = element;
        size++;
    }

    @Override
    public void addLast(E element) {
        if (size == store.length) {
            resize(store.length * 2);
        }
        store[back] = element;
        back = (back + 1) % store.length;
        size++;
    }

    @Override
    public E removeFirst() {
        if (isEmpty()) {
            throw new IllegalStateException("Deque is empty!");
        }
        E item = store[front];
        store[front] = null;
        front = (front + 1) % store.length;
        size--;

        if (store.length >= INIT_SIZE * 2 && size == store.length / 4) {
            resize(store.length / 2);
        }

        return item;
    }

    @Override
    public E removeLast() {
        if (isEmpty()) {
            throw new IllegalStateException("Deque is empty!");
        }
        back = (back - 1 + store.length) % store.length;
        E item = store[back];
        store[back] = null;
        size--;
        if (store.length >= INIT_SIZE * 2 && size == store.length / 4) {
            resize(store.length / 2);
        }
        return item;
    }

    @Override
    public E peekFirst() {
        if (isEmpty()) {
            throw new IllegalStateException("Deque is empty!");
        }
        return store[front];
    }

    @Override
    public E peekLast() {
        if (isEmpty()) {
            throw new IllegalStateException("Deque is empty!");
        }
        return store[(back - 1 + store.length) % store.length];
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    private void resize(int capacity) {
        @SuppressWarnings("unchecked")
        E[] newStore = (E[]) new Object[capacity];
        for (int i = 0; i < size; i++) {
            newStore[i] = store[(front + i) % store.length];
        }
        store = newStore;
        front = 0;
        back = size;
    }

}