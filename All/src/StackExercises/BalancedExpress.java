package StackExercises;

import java.util.*;

public class BalancedExpress {
    private final List<Character> leftBrackets = Arrays.asList('(', '[', '<', '{');
    private final List<Character> rightBrackets = Arrays.asList(')', ']', '>', '}');

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
        return leftBrackets.contains(character);
    }

    private boolean idRightBrackets(Character character) {
        return rightBrackets.contains(character);
    }

}
