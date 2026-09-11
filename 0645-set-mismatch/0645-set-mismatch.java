class Solution {
    public int[] findErrorNums(int[] nums) {
        int n = nums.length;
        int arr[] = new int[2];
        int a =0;
        Arrays.sort(nums);
        HashSet<Integer> set = new HashSet<>();
        for(int i =0;i<n;i++){
            if(!set.contains(nums[i])){
                set.add(nums[i]);
            }else{
                a=nums[i];
            }
        }
        int k = nums[n-1];
        int b=0;

        for(int i=1;i<=k+1;i++){
            if(set.contains(i)){
                continue;
            }else{
                b=i;
                break;
            }
        }
        if(a==1 && !set.contains(a+1)){
            arr[0]=1;
            arr[1]=2;
        }else{
            arr[0]=a;
            arr[1]=b;
        }
        return arr;
        
        

    }
}