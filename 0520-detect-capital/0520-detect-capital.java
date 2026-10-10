class Solution {
    public boolean detectCapitalUse(String word) {
        String s = word.toUpperCase();
        if(s.equals(word)){
            return true;
        }
        String ss = word.toLowerCase();
        if(ss.equals(word)){
            return true;
        }
        char ch = word.charAt(0);
        if(Character.isUpperCase(ch)){
            for(int i=1;i<word.length();i++){
                char c = word.charAt(i);
                if(Character.isLowerCase(c)){
                    continue;
                }else{
                    return false;
                }
            }
            return true;
        }
        return false;
        
    }
}