class Solution {
    public int findKthPositive(int[] arr, int k) {
        int n = arr.length;
        int nums[] = new int[n+k];

        for(int i=1;i<nums.length;i++){
            nums[i]=i;
        }
        Set<Integer> set = new HashSet<>();
        for(int i=0;i<n;i++){
            set.add(arr[i]);
        }
        for(int i=0;i<nums.length; i++){
            if(set.contains(nums[i])){
                continue;
            }
            else if(!set.contains(nums[i]) && k==0){
                return nums[i];
            }else if(!set.contains(nums[i]) && k>0){
                k--;
            }
        }
        return nums.length;

        
    }
}