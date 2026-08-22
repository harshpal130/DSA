class Solution {
    public boolean checkDivisibility(int n) {
        int sum = 0;
        int product = 1;
        
int num=n;
        while(n>0){
            int rem = n%10;
            sum+=rem;
            product*=rem;

            n=n/10;
            
        }
        if(num%(sum+product)!=0){
            return false;
        }else {
            return true;
        }
        
        
    }
}