class Solution {
    public int minimumDeletions(int[] nums) {
        int n = nums.length;
        int arr[] = new int[n];
        for(int i =0; i<n;i++){
            arr[i]=nums[i];
        }

        
        Arrays.sort(nums);

        int small = nums[0];
        int large = nums[n-1];

        int idxs = 0;
        int idxl = 0;
        for(int i = 0; i<n; i++){
            if(arr[i]==small){
                idxs = i;
            }else if(arr[i]==large){
                idxl = i;
            }
        }

        int a = Math.min(idxs,idxl);
        int b = Math.max(idxs,idxl);

        int case1 = b+1;
        int case2 = n-a;
        int case3 = (a+1)+(n-b);

        
        // int s=0;
        // int l=0;

        // if(n==1 || n==2){
        //     return n;
        // }

        // if((idxs<=n/2 && idxl<=n/2)){
        //     return Math.max(idxs,idxl)+1;
        // }else if(idxs>=n/2 && idxl>=n/2){
        //     return Math.max(n-1-idxs , n-1-idxl)+1;
        // }else{
        //    s = Math.min(idxs-0, n-1-idxs)+1;
        //    l = Math.min(idxl-0, n-1-idxl)+1;

        //    return s+l;
        // }
        return Math.min(case1, (Math.min(case2,case3)));
    }
}