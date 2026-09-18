class Solution {
    public boolean wordPattern(String pattern, String s) {
        int n = pattern.length();
        HashMap<Character, String> map1 = new HashMap<>();
        HashMap<String, Character> map2 = new HashMap<>();

        


        String word[] = s.split(" ");
        if(n!=word.length){
            return false;
        }
        for(int i = 0;i<n;i++){
            char ch= pattern.charAt(i);
            String s1 = word[i];
            
            if(!map1.containsKey(ch)){
                map1.put(ch,s1);
            }
            if(!map2.containsKey(s1)){
                map2.put(s1,ch);
            }
            if(!map1.get(ch).equals(s1) || map2.get(s1)!=ch){
                return false;
            }
        }
        return true;
    }
}