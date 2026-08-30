class Solution {
    public int minimumDeletions(int[] nums) {
        int min = Integer.MAX_VALUE, min_index = 0;
        int max = Integer.MIN_VALUE, max_index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (min > nums[i]){
                min = nums[i];
                min_index = i+1;}
            if (max < nums[i]){
                max = nums[i];
                max_index = i+1;
        }}
       int first=Math.min(min_index,max_index);
       int last=Math.max(min_index,max_index);
       int n = nums.length;

        int option1 = last;
        int option2 = n - first + 1;
        int option3 = first + n - last + 1;

        return Math.min(option1, Math.min(option2, option3));
    }
}