package StackExercises;

public class StringReverser {
    public String reverse(String input) {
        var reversed = "";
        var chars = input.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            reversed = chars[i] + reversed;
        }
        return reversed;
    }
}
