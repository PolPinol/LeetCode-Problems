class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<Character>();
                
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else {
                if (stack.empty()) {
                    return false;
                }
                
                char opened = stack.pop().charValue();
                if (c == ')' && opened != '(') {
                    return false;
                } else if (c == '}' && opened != '{') {
                    return false;
                } else if (c == ']' && opened != '[') {
                    return false;
                }
            }
        }
        
        return stack.empty();
    }
}