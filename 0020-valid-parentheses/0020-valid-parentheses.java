class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        
        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);
            
            if (currentChar == '(' || currentChar == '{' || currentChar == '[') {
                stack.push(currentChar);
            } else if (currentChar == ')' && !stack.isEmpty() && stack.peek() == '(') {
                stack.pop();
            } else if (currentChar == '}' && !stack.isEmpty() && stack.peek() == '{') {
                stack.pop();
            } else if (currentChar == ']' && !stack.isEmpty() && stack.peek() == '[') {
                stack.pop();
            } else {
                return false; // Invalid closing parenthesis
            }
        }
        
        return stack.isEmpty(); // True if all parentheses are balanced
    }}