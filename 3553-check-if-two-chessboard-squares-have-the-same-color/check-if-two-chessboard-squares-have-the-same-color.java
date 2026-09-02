class Solution {
    public boolean checkTwoChessboards(String coordinate1, String coordinate2) {
        int a=coordinate1.charAt(0);
        int b=coordinate1.charAt(1);
        int c=coordinate2.charAt(0);
        int d=coordinate2.charAt(1);
        if(((a+b)%2!=0&&(c+d)%2==0)||((a+b)%2==0&&(c+d)%2!=0)){
            return false;
        }
        return true;
        
    }
}