class Solution {
    public boolean isSubsequence(String s, String t) {
        int n = s.length();
        int m = t.length();

        int i=0;
        int j=0;

        if(n==0){
            return true;
        }

        while(i<n && j<m){
            
            if(s.charAt(i)==t.charAt(j)){

                if(i==n-1){
                    return true;
                }
                i++;
                j++;
            }else{
                j++;
            }
        }
        return false;
    }
}