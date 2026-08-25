class Solution {
    public int missingMultiple(int[] nums, int k) {
        int n = nums.length;
        HashMap<Integer, Integer> map = new HashMap<>();



        int j =1;

        for(int i =0; i<n; i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }

        while(j<n+1){
            if(!map.containsKey(k*j)){
                return k*j;
            }
            j++;
        }
        return k*j;
    }
}