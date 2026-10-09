class Solution {
    public boolean checkIfPangram(String sentence) {
        Set<Character> set = new HashSet<>();
        int count=0;
        for(int i=0;i<sentence.length(); i++){
            if(!set.contains(sentence.charAt(i))){
                set.add(sentence.charAt(i));
                count++;
            }
        }
        return count==26;
        
    }
}