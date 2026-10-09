class Solution {
    public boolean halvesAreAlike(String s) {
        int n= s.length();
        int count=0;
        int rcount=0;

        for(int i=0; i<n/2;i++){
            if(s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u' || s.charAt(i)=='A' || s.charAt(i)=='E' ||  s.charAt(i)=='I' || s.charAt(i)=='O' || s.charAt(i)=='U'){
                count++;
            }
        }
        for(int i=n/2; i<n;i++){
            if(s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u' || s.charAt(i)=='A' || s.charAt(i)=='E' ||  s.charAt(i)=='I' || s.charAt(i)=='O' || s.charAt(i)=='U'){
                rcount++;
            }
        }
        return count==rcount;
        
    }
}