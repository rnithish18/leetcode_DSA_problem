
class Solution {
    public String reverseWords(String s) {
       s=s.trim();
       String[] st=s.split("\\s+");
       String result="";
       for(int i=st.length-1;i>=0;i--){
          result+=st[i];
          if(i!=0){
            result+=" ";
          }
       } 
       return result;
    }
}