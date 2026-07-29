class Solution {
    boolean isPalin(String s){
        String r = new StringBuilder(s).reverse().toString();
        return s.equals(r);
    }
    void getAllPairs(String s ,List<String> partition,List<List<String>> ans){
        if(s.length()==0){
            ans.add(new ArrayList<>(partition));
            return;
        }
        for(int i = 0; i<s.length(); i++){
            String part = s.substring(0,i+1);
            if(isPalin(part)){
                partition.add(part);
                getAllPairs(s.substring(i+1) , partition ,ans );
                partition.remove(partition.size()-1);
            }
        }
    }
    public List<List<String>> partition(String s) {
        List<List<String>> ans = new ArrayList<>();
        List<String> partition = new ArrayList<>();
        getAllPairs(s, partition, ans);
        return ans;

        
    }
}