class Solution {
    public void back(int nums [], boolean used[], List<Integer>curr,List<List<Integer>> result){
        if(curr.size()==nums.length){
            if(!result.contains(curr)){
                result.add(new ArrayList<>(curr));
            }
            
        }
        for(int i = 0; i<nums.length ;i++){
            if(used[i]){
                continue;
            }
            curr.add(nums[i]);
            used[i]= true;

            back(nums, used, curr, result);

            curr.remove(curr.size()-1);
            used[i]= false;
        }
    }
    public List<List<Integer>> permuteUnique(int[] nums) {
        boolean used[] = new boolean[nums.length];
        List<Integer> curr = new ArrayList<>();
        List<List<Integer>> result = new ArrayList<>();
        back(nums, used, curr, result); 
        return result;       
    }
}