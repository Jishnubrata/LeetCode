class Solution {
    public String reverseParentheses(String s) {
        Stack<StringBuilder> stack = new Stack<>();
        StringBuilder current = new StringBuilder();

        for (char ch : s.toCharArray()) {

            if (ch == '(') {
                // Save the current string
                stack.push(current);
                current = new StringBuilder();

            } else if (ch == ')') {
                // Reverse the substring inside parentheses
                current.reverse();

                // Restore the previous level and append
                StringBuilder previous = stack.pop();
                previous.append(current);
                current = previous;

            } else {
                // Normal character
                current.append(ch);
            }
        }

        return current.toString();
    }
}