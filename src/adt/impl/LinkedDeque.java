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

public class LinkedDeque<T> implements Deque<T> {

    private DoublyLinkedNode<T> tmp;
    private DoublyLinkedNode<T> head;
    private int size;

    public LinkedDeque() {
        head = null;
        tmp = null;
        size = 0;
    }

    @Override
    public void addFirst(T item) {
        DoublyLinkedNode<T> node = new DoublyLinkedNode<>(item);
        if (size == 0) {
            head = node;
            tmp = node;
        } else {
            node.setNext(head);
            head.setPrev(node);
            head = node;
        }
        size++;
    }

    @Override
    public void addLast(T item) {
        DoublyLinkedNode<T> node = new DoublyLinkedNode<>(item);
        if (size == 0) {
            head = node;
            tmp = node;
        } else {
            tmp.setNext(node);
            node.setPrev(tmp);
            tmp = node;
        }
        size++;
    }

    @Override
    public T removeFirst() {
        if (size == 0) {
            throw new IllegalStateException("Deque is empty!");
        }
        T item = head.getData();
        head = head.getNext();
        if (head == null) {
            tmp = null;
        } else {
            head.setPrev(null);
        }
        size--;
        return item;
    }

    @Override
    public T removeLast() {
        if (size == 0) {
            throw new IllegalStateException("Deque is empty!");
        }
        T item = tmp.getData();
        tmp = tmp.getPrev();
        if (tmp == null) {
            head = null;
        } else {
            tmp.setNext(null);
        }
        size--;
        return item;
    }

    @Override
    public T peekFirst() {
        if (size == 0) {
            throw new IllegalStateException("Deque is empty!");
        }
        return head.getData();
    }

    @Override
    public T peekLast() {
        if (size == 0) {
            throw new IllegalStateException("Deque is empty!");
        }
        return tmp.getData();
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