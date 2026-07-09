class Solution {
    public boolean backspaceCompare(String s, String t) {
        StringBuilder sb = new StringBuilder();
        StringBuilder bs = new StringBuilder();

        for(char ch: s.toCharArray()){
            if(ch=='#'){
                if(sb.length()>0){
                    sb.deleteCharAt(sb.length()-1);
                }
            }
            else{
                sb.append(ch);
            } 
               
            
            
        }

        for(char ch: t.toCharArray()){
            if(ch=='#'){
                if(bs.length()>0){
                    bs.deleteCharAt(bs.length()-1);
                }
            }
            else{
                bs.append(ch);
            }  
                
            
                
        }

        if(sb.toString().equals(bs.toString())){
            return true;
        }
        else{
            return false;
        }
        
    }
}