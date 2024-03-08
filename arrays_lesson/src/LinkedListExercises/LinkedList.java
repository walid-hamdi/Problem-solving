package LinkedListExercises;

import java.util.NoSuchElementException;

public class LinkedList {
    private class Node {
        private int value;
        private Node next;

        private Node(int value) {
            this.value = value;
        }
    }

    private Node first;
    private Node last;
    private int size;

    public void addLast(int value) {
        var node = new Node(value);
        if (isEmpty())
            first = last = node;
        else {
            last.next = node;
            last = node;
        }

        size++;
    }

    public void addFirst(int value) {
        var node = new Node(value);
        if (isEmpty())
            first = last = node;
        else {
            node.next = first;
            first = node;
        }

        size++;
    }

    public int indexOf(int value) {
        int index = 0;
        Node current = first;
        while (current.next != null) {
            if (current.value == value)
                return index;
            else {
                current = current.next;
                index++;
            }
        }

        return -1;
    }

    public boolean contains(int value) {
        return indexOf(value) != -1;
    }

    public void removeFirst() {
        if (isEmpty())
            throw new NoSuchElementException();

        if (first == last) {
            first = last = null;
            size = 0;
            return;
        }

        var second = first.next;
        first.next = null;
        first = second;
    }

    public void removeLast() {
        if (isEmpty())
            throw new NoSuchElementException();

        if (first == last) {
            first = last = null;
            size = 0;
            return;
        }

        var previous = getPrevious(last);
        last = previous;
        last.next = null;
    }

    public int size() {
        return size;
    }

    private Node getPrevious(Node node) {
        var current = first;
        while (current != null) {
            if (current.next == node)
                return current;
            else
                current = current.next;
        }
        return null;
    }

    public int[] toArray() {
        int index = 0;
        Node current = first;
        int[] array = new int[size];
        while (current != null) {
            array[index++] = current.value;
            current = current.next;
        }

        return array;
    }

    public void reverse() {
        if (isEmpty())
            return;

        var previous = first;
        var current = first.next;
        while (current != null) {
            var next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }

        last = first;
        last.next = null;
        first = previous;
    }

    public int getKthFromTheEnd(int k) {
        var distance = k - 1; // 2
        var current = first;
        var index = 0;
        while (current != null) {
            var start = current;
            var end = current;
            current = current.next;
            while (index != distance) {
                index++; // 1 - 2
                current = current.next;
            }
            end = current;
            if (end.next == null)
                return start.value;
        }
        return -1;
    }

    private boolean isEmpty() {
        return first == null;
    }
}
