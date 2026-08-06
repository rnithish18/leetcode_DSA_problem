class Solution {
    public void moveZeroes(int[] nums) {
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
            count++;}
        }
        int arr[]=new int[nums.length-count];
        int a=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
              arr[a]=nums[i];
              a++;
            }
        }
        for(int i=0;i<nums.length;i++){
            if(arr.length>i){
                nums[i]=arr[i];
            }else{
                nums[i]=0;
            }
        }
    }
}