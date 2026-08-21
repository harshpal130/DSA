class Solution {
    int max = 0;
    int idx=0;
    public boolean palindrome(String s, int i , int j){
        if(i>=j){
            return true;
        }
        
        if(s.charAt(i)==s.charAt(j)){
            return palindrome(s,i+1,j-1);
        }
        
       return false;
    }
    public String longestPalindrome(String s) {
       for(int i = 0; i<s.length(); i++){
        for(int j= i; j<s.length(); j++){
            if(palindrome(s,i,j)){
                if(j-i+1>max){
                    max= j-i+1;
                    idx = i;
                }
            }
        }
       }
       return s.substring(idx,idx+max);
       
    }
}