class Solution {
    public boolean isPossible(int[] time, long givenTime ,int totalTrips){
        long actualTime =0;
        for(int i : time){
            actualTime+=givenTime/i;
        }
        return actualTime>=totalTrips;
    }
    public long minimumTime(int[] time, int totalTrips) {
        int minn =Integer.MAX_VALUE;
        for(int i =0;i<time.length;i++){
            minn = Math.min(minn,time[i]);
        }
        long l=1;
        long r = (long)minn*totalTrips;
        while(l<r){
            long mid_time = l+(r-l)/2;
            if(isPossible(time, mid_time, totalTrips)){
                r=mid_time;
            }else{
                l=mid_time+1;
            }
        }
        return l;

        
    }
}