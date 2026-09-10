class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        int n = strs.length;

        //List<List<String>> result = new List<>();

        HashMap<String, List<String>> map = new HashMap<>();

        for(String s: strs){
            char ch[] = s.toCharArray();

            Arrays.sort(ch);
            String key = new String(ch);

            if(!map.containsKey(key)){
                map.put(key, new ArrayList<>());
            }
            map.get(key).add(s);


        }
        return new ArrayList<>(map.values());
        
    }
}