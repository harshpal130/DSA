class Solution {
    public boolean sumGame(String num) {
        int ls= 0;
        int  rs = 0;
        int lc = 0;
        int rc = 0;
        int n = num.length();

        for(int i = 0; i<n/2; i++){
            if(num.charAt(i)!='?'){
                ls+=num.charAt(i)-'0';
            }else {
                lc++;
            }
        }
        for(int i = n/2; i<n; i++){
            if(num.charAt(i)!='?'){
                rs+=num.charAt(i)-'0';
            }else{
                rc++;
            }
        }

        if((lc+rc)%2==1){
            return true;
        }
        if(lc+rc==0){
            return ls!=rs;
        }
        int mini = Math.min(lc,rc);
        lc = lc - mini;
        rc  = rc - mini;

        if(lc>0){
            if(ls>rs){
                return true;
            }
            if(9*(lc/2)==rs-ls){
                return false;
            }else{
                return  true;
            }
        }else{
            if(rs>ls){
                return true;
            }
            if(9*(rc/2)==ls-rs){
                return false;
            }else{
                return true;
            }
        }  
    }
}