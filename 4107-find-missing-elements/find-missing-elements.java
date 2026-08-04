class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        Arrays.sort(nums);
        int low=nums[0];
        int high=nums[nums.length-1];
        List<Integer> list=new ArrayList<>();
        for(int i=low+1;i<high;i++){
             int target=i;
              boolean b=false;
              for(int j=1;j<nums.length-1;j++){
                if(target==nums[j]){
                    b=true;
                    break;
                }
              }if(!b){
                list.add(target);
              }
        }
        return list;
    }
}