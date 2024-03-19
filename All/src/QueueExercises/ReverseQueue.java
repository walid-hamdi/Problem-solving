package QueueExercises;

import java.util.*;

public class ReverseQueue {

    public static void reverse(Queue<Integer> queue) {

        Stack<Integer> stack = new Stack<Integer>();
        while (!queue.isEmpty())
            stack.push(queue.remove());

        while (!stack.isEmpty())
            queue.add(stack.pop());
    }
}
