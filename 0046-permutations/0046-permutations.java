class Solution {

    public void backtrack(
        int[] nums , boolean[] used,  List<Integer> curr , List<List<Integer>> result ){

        if(curr.size()==nums.length){
            result.add(new ArrayList<>(curr));
        }

        for(int i  =0; i<nums.length; i++){

            
            if(used[i]){
                continue;
            }
            curr.add(nums[i]);
            used[i]= true;

            backtrack(nums, used, curr, result);

            used[i]= false;
            curr.remove(curr.size()-1);
        }
    }
    public List<List<Integer>> permute(int[] nums) {
        boolean used[] = new boolean[nums.length];
        List<Integer> curr = new ArrayList<>();
        List<List<Integer>> result = new ArrayList<>();

        backtrack(nums, used, curr, result); 

        return result;
    }
}