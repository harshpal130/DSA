class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder sb = new StringBuilder();
        StringBuilder s = new StringBuilder();

        for(int i=0;i<word1.length;i++){
            String n = word1[i];
            sb.append(n);
        }
        for(int i=0;i<word2.length;i++){
            String n = word2[i];
            s.append(n);
        }
        return sb.compareTo(s)==0;
        
    }
}