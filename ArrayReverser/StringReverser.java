import java.util.Stack;

public class StringReverser {

    // Reverse word order in a sentence using Stack
    public static String reverseWords(String input) {
        if (input == null || input.isEmpty()) {
            return input;
        }

        Stack<String> stack = new Stack<>();

        // Split by spaces to get words
        String[] words = input.trim().split("\\s+");

        // Push all words to stack
        for (String w : words) {
            stack.push(w);
        }

        // Pop words to build reversed sentence
        StringBuilder result = new StringBuilder();
        while (!stack.isEmpty()) {
            result.append(stack.pop());
            if (!stack.isEmpty()) {
                result.append(" ");
            }
        }

        return result.toString();
    }
}
