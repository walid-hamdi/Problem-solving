package QueueExercises;

public class ArrayQueue {

    // [0,0,0,0,0]
    // F R
    private int[] arr = new int[5];
    private int count = 0;
    private int rear = 0;
    private int front = 0;

    // [0,0,0,0,0]
    // F R
    // enqueue (add the item on the Rear)
    public void enqueue(int item) {
        if (isFull())
            throw new StackOverflowError();

        arr[rear] = item;
        count++;
        rear = count;
    }

    // [0,0,0,0,0]
    // F R
    // dequeue (add the item on the front)
    public void dequeue() {
        if (isEmpty())
            throw new IllegalStateException();
        // todo : needed to be solved
        front++;
        count--;
    }

    // peek (pick the the item on front)
    public int peek() {
        return arr[front];
    }

    // isFull
    public boolean isFull() {
        return count == arr.length;
    }

    // isEmpty
    public boolean isEmpty() {
        return count == 0;
    }

    @Override
    public String toString() {
        var content = java.util.Arrays.copyOfRange(arr, 0, count);
        return java.util.Arrays.toString(content);
    }

}
