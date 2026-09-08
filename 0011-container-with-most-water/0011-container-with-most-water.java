class Solution {
    public int maxArea(int[] height) {
        int maxArea = Integer.MIN_VALUE;
        int n = height.length;
        
        int lp = 0;
        int rp = n-1;

        while(lp<rp){
            int w = rp-lp;
            int area = Math.min(height[lp], height[rp])*w;
            maxArea = Math.max(area, maxArea);

           if (height[lp] < height[rp]) {
                lp++;
            } else {
                 rp--;
            }

        }
        return maxArea;
        
    }
}