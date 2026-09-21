class Solution {
    public int longestConsecutive(int[] nums) {
       Arrays.sort(nums);
       int max=1;
       int n= nums.length;
       int count=1;
       
       if(n==0){
        return 0;
       }
       int prev=nums[0];
       for(int i=0;i<n;i++){
        if(prev==nums[i]){
            continue;
        }
        if(nums[i]==prev+1){
            count++;
            prev=nums[i];
        }else{
            count=1;
            prev=nums[i];
        }
        max=Math.max(max,count);
       }
       return max;

       
    }
}