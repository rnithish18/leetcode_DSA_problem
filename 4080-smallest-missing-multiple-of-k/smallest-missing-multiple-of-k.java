class Solution {
    public int missingMultiple(int[] nums, int k) {
        int n=nums.length;
        for(int i=1; ;i++){
            int tem=k*i;
            boolean b=false;
            for(int j=0;j<n;j++){
                if(tem==nums[j]){
                    b=true;;
                    break;
                }}if(!b){
                return tem;
            }
        }
    }
}