import java.util.Stack;

public class ArrayReverser {

    // Reverse an int array using Stack
    public static int[] reverse(int[] numbers) {
        Stack<Integer> stack = new Stack<>();

        // Push all elements to stack
        for (int n : numbers) {
            stack.push(n);
        }

        // Pop back into array (reversed)
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = stack.pop();
        }

        return numbers;
    }
}
