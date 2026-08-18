class Solution {
    public int largestInteger(int[] nums, int k) {
        int[] count=new int[51];
        for(int i=0;i<=nums.length-k;i++){
            boolean b[]=new boolean[51];
            for(int j=i;j<i+k;j++){
                b[nums[j]]=true;
            }
            for(int c=0;c<51;c++){
                if(b[c]) count[c]++;
            }
        }
        for(int i=50;i>=0;i--){
            if(count[i]==1) return i;
        }
        return -1;
    }
}