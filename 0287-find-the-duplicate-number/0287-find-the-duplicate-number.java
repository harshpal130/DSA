class Solution {
    public int findDuplicate(int[] nums) {
        int count = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i: nums){
            map.put(i, map.getOrDefault(i,0)+1);
        }
        return Collections.max(map.entrySet(),Map.Entry.comparingByValue()).getKey();
        
    }
}