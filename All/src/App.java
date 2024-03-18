import java.util.*;

import StackExercises.BalancedExpress;
import StackExercises.CustomStack;
import StackExercises.ReverseString;

// import ArraysExercises.Arrays;
// import LinkedListExercises.LinkedList;

public class App {
    public static void main(String[] args) throws Exception {
        // arrays
        // Arrays numbers = new Arrays(3);
        // numbers.insert(10);
        // numbers.insert(20);
        // numbers.insert(30);
        // numbers.insert(40);
        // System.out.println(numbers.indexOf(40));

        // linkedList
        // LinkedList list = new LinkedList();
        // list.addLast(10);
        // list.addLast(20);
        // list.addLast(30);
        // list.addLast(40);
        // list.addLast(50);
        // System.out.println(list.getKthFromTheEnd(3));
        // [10 -> 20 -> 30]
        // list.reverse();
        // [10 <- 20 <- 30]
        // var array = list.toArray();
        // System.out.println(java.util.Arrays.toString(array));

        // stack
        // ReverseString reverseString = new ReverseString();
        // var reversed = reverseString.reverse("abcd");
        // System.out.println(reversed);

        // BalancedExpress obj = new BalancedExpress();
        // Boolean isBalanced = obj.balancedExpression("([]");
        // System.out.println(isBalanced);

        CustomStack customStack = new CustomStack();
        customStack.push(10);
        customStack.push(20);
        customStack.push(30);
        System.out.println(customStack.pop());
        System.out.println(customStack.pop());
        System.out.println("Peek is : " + customStack.peek());
        System.out.println("Does the array empty :" + customStack.isEmpty());
        System.out.println(customStack);
    }

}
