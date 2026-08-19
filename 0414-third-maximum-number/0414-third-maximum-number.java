class Solution {
    public int thirdMax(int[] nums) {
        Integer max1= null,
            max2= null,
            max3= null;

        for(int i = 0; i<nums.length; i++){
            int curr = nums[i];
            if(max1!=null && max1==curr){
                continue;
            }
            if(max2!=null && max2==curr){
                continue;
            }
            if(max3!=null && max3==curr){
                continue;
            }
            if(max1==null ||curr>max1){
                max3=max2;
                max2= max1;
                max1= curr;
            }else if(max2==null ||curr>max2){
                max3=max2;
                max2 = curr;
            }else if(max3==null ||curr>max3){
                max3= curr;
            }
            
        }
        if(max3!=null){
            return max3;
        }
        return max1;
    }
}