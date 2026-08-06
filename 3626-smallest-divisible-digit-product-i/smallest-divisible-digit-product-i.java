class Solution {
    public int smallestNumber(int n, int t) {
        int product=1;
        int m=n;
        while(product%t!=0){
            int digit=n%10;
            product*=digit;
            n/=10;
            if(n==0&&product%t!=0){
                product=1;
                m+=1;
                n=m;
            }
        }
        return m;
    }
}