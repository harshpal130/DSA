class Solution {
    public int strStr(String haystack, String needle) {
        
        if(needle.length()>haystack.length()){
            return -1;
        }
        int n = needle.length();
        int m = haystack.length();

       

        for(int start = 0; start<=m-n; start++){
            int h = start;
            int j =0;

            while(j<n && needle.charAt(j)==haystack.charAt(h)){
                j++;
                h++;
            }
            if(j==n){
                return start;
            }
        }
        return -1; 
    }
}