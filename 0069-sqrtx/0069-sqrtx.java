class Solution {
    public int mySqrt(int x) {
        int n=x;
        if(x==1 || x==2){
            return 1;
        }
     for(int i=0;i<n;i++){
        if((long)i*i> n){
            return (i-1);
        }else{
            continue;
        }
     }
     return 0;
    }
}