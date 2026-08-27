class Solution {
    StringBuilder result = new StringBuilder();
    boolean solve(StringBuilder sb , char count[],String target,int i, boolean greater ){
        if(i==target.length()){
            if(greater){
                result=sb;
                return true;
            }
            return false;
        }
        for(char ch='a'; ch<='z';ch++){
            if(count[ch-'a']==0){
                continue;
            }
            if(greater==false && ch< target.charAt(i)){
                continue;
            }

            sb.append(ch);
            count[ch-'a']--;

            boolean isGreater = greater||ch>target.charAt(i);

            if(solve(sb, count, target, i+1, isGreater)){
                return true;
            }
            sb.deleteCharAt(sb.length()-1);
            count[ch-'a']++;
        }
        return false;
    }
    public String lexGreaterPermutation(String s, String target) {
        char count[] = new char[26];

        for(int i = 0; i<s.length(); i++){
            count[s.charAt(i)-'a']++;
        }
        StringBuilder sb = new StringBuilder();
        solve(sb, count,target,0,false);

        return result.toString();
        
    }
}