import java.util.Arrays;

public class App {
    public static void main(String[] args) {

        // ===== Test reverse int array =====
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println("Original array: " + Arrays.toString(numbers));

        int[] reversed = ArrayReverser.reverse(numbers);
        System.out.println("Reversed array: " + Arrays.toString(reversed));

        // ===== Test reverse words in string =====
        String input = "Hello world I am Chuong";
        System.out.println("Original string: " + input);

        String reversedWords = StringReverser.reverseWords(input);
        System.out.println("Reversed words: " + reversedWords);
    }
}