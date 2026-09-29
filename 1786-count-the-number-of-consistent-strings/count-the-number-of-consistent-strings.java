class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
       int count=0;
       for(int i=0;i<words.length;i++){
         String s=words[i];
         boolean b=false;
         for(int j=0;j<s.length();j++){
            char ch=s.charAt(j);
            if(allowed.contains(String.valueOf(ch))){
                 b=true;
            }else{
                b=false;
                break;
            }
         }
         if(b) count++;
       } 
       return count;
    }
}