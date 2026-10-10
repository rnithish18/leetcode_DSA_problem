
import java.util.Stack;

class Solution {
    public String removeOuterParentheses(String s) {
        Stack<Character> stack = new Stack<>();
        Stack<Character> stack1 = new Stack<>();

        for (char c : s.toCharArray()) {

            if (c == '(') {
                if (!stack.isEmpty()) {
                    stack1.push(c);
                }
                stack.push(c);
            } else {
                stack.pop();

                if (!stack.isEmpty()) {
                    stack1.push(c);
                }
            }
        }

        String result = "";

        while (!stack1.isEmpty()) {
            result += stack1.remove(0);
        }

        return result;
    }
}
