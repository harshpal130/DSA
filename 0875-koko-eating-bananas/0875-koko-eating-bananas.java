class Solution {
    boolean canEat(int[] piles , int mid, int h){
        int actualHours = 0;
        for(int i: piles){
            actualHours+=i/mid;

            if(i%mid!=0){
                actualHours++;
            }
        }
        return actualHours<=h;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int l=1;
        int max  =0;
        for(int i =0;i<piles.length;i++){
            max = Math.max(max,piles[i]);
        }
        while(l<max){
            int mid = l+(max-l)/2;
            if(canEat(piles,mid,h)){
                max=mid;
            }else{
                l=mid+1;
            }
        }
        return max;
        
    }
}