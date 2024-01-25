package code.stack;

import java.util.Stack;

public class ValidParentheses {

    /**
     *
     * Check if the length of the string is even; if not, the string is not balanced.
     * Initialize a stack to keep track of open symbols.
     * Iterate through each character in the string.
     * Handle the case when the stack is empty and the current character is a closing symbol.
     * Check and match open and closing symbols, pop from the stack if a match is found.
     * If not a closing symbol, add it to the stack.
     * The string is valid if the stack is empty after processing all characters.
     */
    public boolean isValid(String s) {
        if (s.length() % 2 != 0) return false;

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            if (stack.isEmpty() && (s.charAt(i) == ')' || s.charAt(i) == '}' || s.charAt(i) == ']')) return false;
            else {
                if (s.charAt(i) == ')' && stack.peek() == '(') stack.pop();
                else if (s.charAt(i) == '}' && stack.peek() == '{') stack.pop();
                else if (s.charAt(i) == ']' && stack.peek() == '[') stack.pop();
                else stack.add(s.charAt(i));
            }
        }
        return stack.isEmpty();
    }

    /**
     * Time Complexity: O(n) - Linear time complexity, where n is the length of the input string.     *
     * Space Complexity: O(n) - Linear space complexity, as the space used is proportional to the length of the input.
     */
}
