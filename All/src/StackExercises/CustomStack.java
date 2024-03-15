package StackExercises;

import java.util.*;
import java.lang.StringBuffer;

public class CustomStack {
    private final List<Character> rightBrackets = Arrays.asList('(', '[', '<', '{');
    private final List<Character> leftBrackets = Arrays.asList(')', ']', '>', '}');

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
            if (isLeftBrackets(character)) {
                stack.push(character);
            }

            if (idRightBrackets(character)) {
                if (stack.empty())
                    return false;

                if (!bracketsMatch(stack.pop(), character))
                    return false;
            }
        }

        return stack.empty();
    }

    private boolean bracketsMatch(Character left, Character right) {
        return leftBrackets.indexOf(left) == rightBrackets.indexOf(right);
    }

    private boolean isLeftBrackets(Character character) {
        return rightBrackets.contains(character);
    }

    private boolean idRightBrackets(Character character) {
        return leftBrackets.contains(character);
    }

}
