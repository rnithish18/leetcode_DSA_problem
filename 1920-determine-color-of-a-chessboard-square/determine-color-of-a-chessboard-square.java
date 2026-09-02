class Solution {
    public boolean squareIsWhite(String coordinates) {
        int a=coordinates.charAt(0);
        int b=coordinates.charAt(1);
        if((a+b)%2!=0){
            return true;
        }
        return false;
    }
}