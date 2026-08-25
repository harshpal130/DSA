class Solution {
    public int[] singleNumber(int[] nums) {
        Arrays.sort(nums);
        Stack<Integer> st = new Stack<>();
        ArrayList<Integer> list = new ArrayList<>();

        for(int i =0;i<nums.length;i++){
            if(st.size()>0 && (st.peek()==nums[i])){
                st.pop();
            }else{
                st.push(nums[i]);
            }
            
            
        }
        while(!st.isEmpty()){
            list.add(st.pop());
        }
        return list.stream().mapToInt(i -> i).toArray();
        
    }
}