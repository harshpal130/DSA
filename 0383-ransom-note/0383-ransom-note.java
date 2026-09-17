class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int n=ransomNote.length();
        int m = magazine.length();
        char arr[]= ransomNote.toCharArray();
        Arrays.sort(arr);

        String sorted = new String(arr);

        char arrr[]= magazine.toCharArray();
        Arrays.sort(arrr);

        String sortedd = new String(arrr);

        int i =0;
        int j=0;

        while(i<n && j<m){
            if(sorted.charAt(i)==sortedd.charAt(j)){
                i++;
                j++;
                if(i==n){
                    return true;
                }
            }else{
                j++;
            }
        }
        return false;
    }
}