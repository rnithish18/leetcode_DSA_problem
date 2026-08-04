class Solution {
    public int maxArea(int[] height) {
        int left=0;
        int right=height.length-1;
        int max=Integer.MIN_VALUE;
        while(left<right){
            int len=Math.min(height[left],height[right]);
            int width=right-left;
            int product=len*width;
            max=Math.max(max,product);
            if(height[left]<height[right]){
                left++;
            }else{
                right--;
            }
        }
        return max;
    }
}