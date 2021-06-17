package Stacks;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;
import java.util.regex.Pattern;

public class StackReview {
    static Map<Integer, String> map = new HashMap<>();

    static {
        map.put(10, "A");
        map.put(11, "B");
        map.put(12, "C");
        map.put(13, "D");
        map.put(14, "E");
        map.put(15, "F");
    }

    public static void main(String[] args) {
        String str = "acba";
        // abba


        //printOddNumbers(13);
        isLetterInString("abcdefghijklmnop", 'e');
        //System.out.println(convertDecimalToBinary(500, 20));
        //System.out.println(isPalindrome(str));
        //System.out.println(delimiterMatching("while (m < n[8 + o))"));
    }

    private static boolean isLetterInString(String str, char letter) {
        if (str.charAt(0) == letter) {
            return true;
        }
        return isLetterInString(str.substring(1), letter);
    }

    private static void printOddNumbersToN(int n) {
        printOddNumbersToN(1, n);
    }

    private static void printOddNumbersToN(int start, int end) {
        if (start == end && start % 2 != 0) {
            System.out.println(start);
            return;
        }

        if (start % 2 != 0) {
            System.out.println(start);
        }

        printOddNumbersToN(++start, end);
    }

    private static boolean delimiterMatching(String string) {
        Map<Character, Character> delimiters = new HashMap<>();
        delimiters.put('[', ']');
        delimiters.put('{', '}');
        delimiters.put('(', ')');

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < string.length(); i++)  {
            if (delimiters.containsKey(string.charAt(i))) {
                stack.push(string.charAt(i));
            } else {
                if (!stack.isEmpty() && string.charAt(i) == delimiters.get(stack.peek())) {
                    stack.pop();
                }
             }
        }

        return stack.isEmpty();

    }

    private static boolean isPalindrome(String str) {
        int middleIndex = 0;
        if (str.length() % 2 == 0) {
            middleIndex = (str.length() / 2) - 1;
        } else {
            middleIndex = str.length() / 2;
        }

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i <= middleIndex; i++) {
            stack.push(str.charAt(i));
        }

        if (str.length() % 2 != 0) {
            stack.pop();
        }


        while (!stack.isEmpty()) {
            for (int i = middleIndex + 1; i < str.length(); i++) {
                if (str.charAt(i) != stack.pop()) {
                    return false;
                }
            }
        }

        return true;
    }

    private static String convertDecimalToBinary(int nbr, int base) {

        int number = nbr;
        StringBuilder str = new StringBuilder();
        Stack<Integer> st = new Stack<>();
        while (number > 0) {

            st.push(number % base);
            number /= base;


        }

        while (!st.isEmpty()) {
            int remainder = st.peek();
            if (remainder > 9) {
                str.append(map.get(remainder));
                st.pop();
            } else {
                str.append(st.pop());
            }
        }

        return str.toString();
    }






}
