package StackExercises;

import java.util.Stack;

public class ReverseString {
    public String reverse(String input) {
        Stack<Character> stack = new Stack<Character>();
        for (Character character : input.toCharArray()) {
            stack.push(character);
        }

        StringBuffer reversed = new StringBuffer();
        while (!stack.isEmpty()) {
            reversed.append(stack.pop());
        }

        return reversed.toString();
    }
}
