class Solution {
    public int minSwaps(String s) {
        Stack<Character> stack = new Stack<>();
        for(int i = 0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(ch=='['){
                stack.push(ch);
            }else{
                if(stack.isEmpty() || stack.peek()==']'){
                    stack.push(ch);
                }else{
                    stack.pop();
                }
            }
        }
        int totalBracket = stack.size();
        int openBracket = totalBracket/2;

        return ((openBracket+1)/2);
        
    }
}