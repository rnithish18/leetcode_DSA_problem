class Solution {
    public int smallestIndex(int[] nums) {
       int n=nums.length;
       int result=-1;
       for(int i=0;i<n;i++){
        int sum=0;
        int digit=nums[i];
        while(digit!=0){
           int temp=digit%10;
           sum+=temp;
           digit/=10;
        }if(sum==i){
           result=sum;
           break; 
        }
       }  
       return result;  
    }
}