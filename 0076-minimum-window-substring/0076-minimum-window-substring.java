class Solution {
    public String minWindow(String s, String t) {
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i = 0; i<t.length(); i++){
            map.put(t.charAt(i),map.getOrDefault(t.charAt(i),0)+1);
        }
        int count = map.size();
        int st = 0;
        int end = 0;
        int minlen = Integer.MAX_VALUE;
        int n =s.length();
        int startIdx =-1;

        while(end<n){
            char ch = s.charAt(end);
            if(map.containsKey(ch)){
                map.put(ch,map.getOrDefault(ch,0)-1);
                if(map.get(ch)==0){
                    count--;
                }
            }
            while(count==0){
                int len = end-st+1;
                if(len<minlen){
                    minlen = len;
                    startIdx = st;
                }
                ch=s.charAt(st);
                if(map.containsKey(ch)){
                    map.put(ch,map.get(ch)+1);
                    if(map.get(ch)>0){
                        count++;
                    }
                }
                
                st++;
            }
            end++;
        }
       
        if(startIdx==-1){
            return "";
        }

        return s.substring(startIdx,startIdx+minlen);
        
        
        
    }
}