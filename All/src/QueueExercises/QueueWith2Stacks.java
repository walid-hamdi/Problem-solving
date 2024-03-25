package QueueExercises;

import java.util.Stack;

public class QueueWith2Stacks {
    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();

    public void enqueue(int item) {
        stack1.add(item);
    }

    public int dequeue() {
        if (stack1.empty() && stack2.empty())
            throw new IllegalStateException();

        moveStack1ToStack2();

        return stack2.pop();
    }

    public int peek() {
        moveStack1ToStack2();

        return stack2.peek();
    }

    private void moveStack1ToStack2() {
        if (stack2.isEmpty())
            while (!stack1.isEmpty())
                stack2.add(stack1.pop());
    }

}
