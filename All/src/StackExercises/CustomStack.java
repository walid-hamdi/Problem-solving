package StackExercises;

import ArraysExercises.Arrays;

public class CustomStack {
    private int[] arr = new int[5];
    private int count = 0;

    public void push(int value) {
        if (arr.length == count)
            throw new StackOverflowError();

        arr[count++] = value;
    }

    public int pop() {
        if (count == 0)
            throw new IllegalStateException();

        return arr[--count];
    }

    public int peak() {
        if (count == 0)
            throw new IllegalStateException();

        return arr[count - 1];
    }

    public boolean isEmpty() {
        return count == 0;
    }

    @Override
    public String toString() {
        var content = java.util.Arrays.copyOfRange(arr, 0, count);
        return java.util.Arrays.toString(content);
    }
}
