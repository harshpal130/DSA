class Solution {
    public boolean uniformArray(int[] nums1) {
        int n = nums1.length;

        int evenCount = 0;
        int oddCount = 0;

        for(int i = 0; i<n;i++){
            if(nums1[i]%2==0){
                evenCount++;
            }
        }
        if(evenCount==n){
            return true;
        }
        
        oddCount = 0;
        for(int i = 0; i<n;i++){
            if(nums1[i]%2!=0){
                oddCount++;
            }
        }
        if(oddCount==n){
            return true;
        }
        evenCount = 0;
        oddCount = 0;
        int smallestEven = Integer.MAX_VALUE;
        int smallestOdd = Integer.MAX_VALUE;

        
        for(int i =0;i<n;i++){
            if(nums1[i]%2==0){
                smallestEven = Math.min(nums1[i],smallestEven);
            }else{
                smallestOdd = Math.min(nums1[i],smallestOdd);
            }

           
        }
         if(smallestOdd-smallestEven>=1){
            return false;
        }
        
        return true;
    }
}