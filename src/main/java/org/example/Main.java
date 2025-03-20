package org.example;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        System.out.println(checkForPalindrome("I did, did I?"));
        System.out.println(checkForPalindrome("Racecar"));
        System.out.println(checkForPalindrome("hello"));
        System.out.println(checkForPalindrome("Was it a car or a cat I saw ?"));
    }

    public static boolean checkForPalindrome(String str) {
        Deque<Character> deque = new LinkedList<>();
        StringBuilder cleanedString = new StringBuilder();

        str = str.toLowerCase();


        for (char ch : str.toCharArray()) {
            if (Character.isLetterOrDigit(ch)) {
                deque.addLast(ch);
                cleanedString.append(ch);
            }
        }


        while (deque.size() > 1) {
            if (!deque.pollFirst().equals(deque.pollLast())) {
                return false;
            }
        }

        return true;
    }

    public static String convertDecimalToBinary(int number) {
        if (number == 0) return "0";

        Stack<Integer> stack = new Stack<>();
        StringBuilder binary = new StringBuilder();

        while (number > 0) {
            stack.push(number % 2);
            number /= 2;
        }

        while (!stack.isEmpty()) {
            binary.append(stack.pop());
        }

        return binary.toString();
    }
}
