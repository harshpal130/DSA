class Solution {
    public boolean isPalindrome(String s) {
        
        int n = s.length();

        String w = s.toLowerCase();

        char [] p = w.toCharArray();
        
        int i = 0;
        int j = n-1;

        while(i<=j){
           while(i<j && !Character.isLetterOrDigit(p[i])){
            i++;
           }
            while(i<j && !Character.isLetterOrDigit(p[j])){
            j--;
           }
           if(p[i]!=p[j]){
            return false;
           }
           i++;
           j--;
        }
        return true;
        
    }
}