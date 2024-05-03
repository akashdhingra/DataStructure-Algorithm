class Solution {
    public boolean isValid(String s) {
        boolean result = false;
        Stack<Character> stack = new Stack<>();
        char[] c = s.toCharArray();
        for(char ch : c){
            if(ch == '(' || ch == '{' || ch == '['){
                stack.push(ch);
            }
            else{
                if(stack.isEmpty()){
                    return false;
                }
                
                char top = stack.pop();
                if((ch == ')' && top != '(') || (ch == '}' && top != '{') || (ch == ']' && top != '[')){
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}