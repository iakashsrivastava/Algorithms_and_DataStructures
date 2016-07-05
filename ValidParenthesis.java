//Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
//
//        The brackets must close in the correct order, "()" and "()[]{}" are all valid but "(]" and "([)]" are not.

public class ValidParenthesis {

    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for(int i=0; i< s.length(); i++){
            char ch = s.charAt(i);

            if(ch =='(' || ch=='{' || ch =='[')
                stack.push(ch);
            else if(ch==')' && !stack.empty() && stack.peek()=='(')
                stack.pop();
            else if(ch=='}' && !stack.empty() && stack.peek()=='{')
                stack.pop();
            else if(ch==']' && !stack.empty() && stack.peek()=='[')
                stack.pop();
            else
                return false;
        }

        return stack.empty();
    }

}
