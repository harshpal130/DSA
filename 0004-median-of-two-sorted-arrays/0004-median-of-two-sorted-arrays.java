class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int arr[] = new int[nums1.length+ nums2.length];
        int i = 0;
        int j = 0;
        int k = 0;
        int n = nums1.length;
        int m = nums2.length;
        int N = n+m;
        while(i<n && j<m){
            if(nums1[i]<=nums2[j]){
                arr[k]= nums1[i];
                i++;
                k++;
            }else{
                arr[k]=nums2[j];
                j++;
                k++;
            }
        }
        while(i<n){
            arr[k]=nums1[i];
            i++;
            k++;
        }
        while(j<m){
            arr[k]=nums2[j];
            j++;
            k++;
        }

        if(N%2!=0){
            return arr[N/2];
        }else{
            return (double)(arr[N/2 -1]+arr[N/2])/2.0;
        }

        }
        
    }
