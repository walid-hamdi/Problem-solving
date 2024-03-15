package StackExercises;

public class CustomStack {
    // stack
    // push
    // pop
    // peek
    // isEmpty
    int[] arr;
    int size;

    CustomStack() {
        size = 1;
        arr = new int[size];
    }

    public void push(int value) {

        arr[size++] = value;
    }

    public int pop() {
        return 0;
    }

    public int peek() {
        return 1;
    }

    public boolean isEmpty() {
        return false;
    }
}
