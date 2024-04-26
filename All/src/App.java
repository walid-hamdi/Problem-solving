
import java.util.*;
// import LinkedListExercises.LinkedList;
// import QueueExercises.ArrayQueue;
import QueueExercises.PriorityQueue;
// import QueueExercises.ReverseQueue;
// import QueueExercises.QueueWith2Stacks;
// import StackExercises.BalancedExpress;
// import StackExercises.CustomStack;
// import StackExercises.ReverseString;

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

        // CustomStack customStack = new CustomStack();
        // customStack.push(10);
        // customStack.push(20);
        // customStack.push(30);
        // System.out.println(customStack.pop());
        // System.out.println(customStack.pop());
        // System.out.println("Peek is : " + customStack.peek());
        // System.out.println("Does the array empty :" + customStack.isEmpty());
        // System.out.println(customStack);

        // Queue
        // Queue<Integer> queue = new ArrayDeque<>();
        // queue.add(10);
        // queue.add(20);
        // queue.add(30);
        // ReverseQueue.reverse(queue);
        // System.out.println(queue);

        // ArrayQueue arrayQueue = new ArrayQueue(5);
        // arrayQueue.enqueue(10);
        // arrayQueue.enqueue(20);
        // arrayQueue.enqueue(30);
        // arrayQueue.enqueue(40);
        // arrayQueue.enqueue(50);
        // arrayQueue.dequeue();
        // arrayQueue.dequeue();
        // arrayQueue.enqueue(60);
        // arrayQueue.enqueue(70);
        // arrayQueue.dequeue();
        // arrayQueue.dequeue();
        // arrayQueue.enqueue(80);
        // // var peek = arrayQueue.peek();
        // // System.out.println(peek);
        // System.out.println(arrayQueue);

        // QueueWith2Stacks stackQueue = new QueueWith2Stacks();
        // stackQueue.enqueue(10);
        // stackQueue.enqueue(20);
        // stackQueue.enqueue(30);
        // var item1 = stackQueue.dequeue();
        // var item2 = stackQueue.dequeue();
        // var item3 = stackQueue.dequeue();
        // var item4 = stackQueue.dequeue();
        // System.out.println(item3);

        // PriorityQueue priorityQueue = new PriorityQueue(5);
        // priorityQueue.insert(1);
        // priorityQueue.insert(2);
        // priorityQueue.insert(4);
        // priorityQueue.insert(7);
        // priorityQueue.insert(3);
        // while (!priorityQueue.isEmpty())
        // System.out.println(priorityQueue.remove());

        // Working with Hashtable
        // Map<Integer, String> map = new HashMap<>();
        // map.put(1, "Walid");
        // map.put(2, "Ahmed");
        // map.put(3, "Ali");
        // map.put(null, null);
        // map.put(4, null);

        // System.out.println(map.remove(null));

        // System.out.println(map.get(1));

        // for (var string : map.entrySet()) {
        // System.out.println(string.getKey());
        // }

        // Working solution for the first non repeated character
        // a green apple (g)
        System.out.println("First non repeated character: " + nonRepeatedCharacter("a green apple"));

        // int[] numbers = { 1, 2, 2, 3, 4, 5 };
        // Set<Integer> set = new HashSet<>();
        // for (var num : numbers) {
        // set.add(num);
        // }

        // System.out.println(set);

        // green apple (e)
        System.out.println("First repeated character: " + repeatedCharacter("green apple"));
    }

    public static char nonRepeatedCharacter(String entry) {
        var chars = entry.toCharArray();

        Map<Character, Integer> map = new HashMap<Character, Integer>();
        for (Character character : chars) {
            var count = map.containsKey(character) ? map.get(character) : 0;
            map.put(character, count + 1);
        }
        for (Character character : chars) {
            if (map.get(character) == 1)
                return character;
        }

        return Character.MIN_VALUE;
    }

    // public static char repeatedCharacter(String entry) {

    // var chars = entry.toCharArray();

    // Map<Character, Integer> map = new HashMap<Character, Integer>();
    // for (Character character : chars) {
    // var count = map.containsKey(character) ? map.get(character) : 0;
    // map.put(character, count + 1);
    // }
    // for (Character character : chars) {
    // if (map.get(character) > 1)
    // return character;
    // }

    // return Character.MIN_VALUE;
    // }

    public static char repeatedCharacter(String entry) {
        Set<Character> set = new HashSet<>();
        for (var character : entry.toCharArray()) {
            if (set.contains(character))
                return character;

            set.add(character);
        }

        return Character.MAX_VALUE;
    }

}
