import java.lang.reflect.Array;

import ArraysExercices.Arrays;
import LinkedListExercises.LinkedList;

public class App {
    public static void main(String[] args) throws Exception {
        // Arrays numbers = new Arrays(3);
        // numbers.insert(10);
        // numbers.insert(20);
        // numbers.insert(30);
        // numbers.insert(40);
        // System.out.println(numbers.indexOf(40));

        LinkedList list = new LinkedList();
        list.addLast(10);
        list.addLast(20);
        list.addLast(30);
        list.addLast(40);
        list.addLast(50);
        System.out.println(list.getKthFromTheEnd(3));
        // [10 -> 20 -> 30]
        // list.reverse();
        // [10 <- 20 <- 30]
        // var array = list.toArray();
        // System.out.println(java.util.Arrays.toString(array));
    }
}
