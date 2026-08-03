class Solution {
    public String stoneGameIII(int[] stoneValue) {
        int n=stoneValue.length;
        int d1=0,d2=0,d3=0;
        for(int i=n-1;i>=0;i--){
            int sum=0;
            int best=Integer.MIN_VALUE;
            if(i+1<=n){
               sum+=stoneValue[i];
               best=Math.max(best,(sum-d1));
            }
            if(i+2<=n){
                sum+=stoneValue[i+1];
                best=Math.max(best,(sum-d2));
            }
            if(i+3<=n){
                sum+=stoneValue[i+2];
                best=Math.max(best,(sum-d3));
            }
            d3=d2;
            d2=d1;
            d1=best;
        }
        if(d1<0){
            return "Bob";
        }else if(d1>0){
            return "Alice";
        }
        return "Tie";
    }
}