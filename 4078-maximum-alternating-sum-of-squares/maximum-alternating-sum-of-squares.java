class Solution {
    public long maxAlternatingSum(int[] nums) {
        int n = nums.length;
        long[] arr = new long[n];
        for (int i = 0; i < n; i++) {
              arr[i]=(long)(nums[i]*nums[i]);
        }
        Arrays.sort(arr);
        long res=0;
        int left=0;
        int right=n-1;
        while(left<right){
           res+=arr[right];
           res-=arr[left];
           left++;
           right--;
        }if(left==right){
        res+=arr[left];}
     return res;
    }
}