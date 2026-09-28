class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;
        List<Integer>list = new ArrayList<>();

        Map<Integer, Integer> map = new HashMap<>();
        for(int i =0;i<n;i++){
            map.put(nums1[i],map.getOrDefault(nums1[i],0)+1);
        }

        for(int i=0;i<m;i++){
            if(map.containsKey(nums2[i])){
                if(map.get(nums2[i])==0){
                    continue;
                }
                list.add(nums2[i]);
                map.put(nums2[i],map.get(nums2[i])-1);
            }
        }
        int arr[] = new int[list.size()];
        for(int i =0;i<list.size();i++){
            arr[i]=list.get(i);
        }
        return arr;
        
    }
}