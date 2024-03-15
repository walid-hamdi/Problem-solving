package StackExercises;

import java.util.*;
import java.lang.StringBuffer;

public class CustomStack {

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

    public boolean balancedExpression(String str) {
        Stack<Character> stack = new Stack<Character>();
        for (Character character : str.toCharArray()) {
            if (character == '(' || character == '[' || character == '<') {
                stack.push(character);
            }
            if (character == ')')
                if (stack.pop() != '(')
                    return false;

            if (character == ']')
                if (stack.pop() != '[')
                    return false;

            if (character == '>')
                if (stack.pop() != '<')
                    return false;
        }

        return true;
    }

}
