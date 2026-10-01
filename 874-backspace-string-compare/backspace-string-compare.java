class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> stack=new Stack<Character>();
        Stack<Character> stack1=new Stack<Character>();
        char[] chs=s.toCharArray();
        char[] cht=t.toCharArray();
        for(int i=0;i<chs.length;i++){
            if(chs[i]!='#'){
                stack.push(chs[i]);
            
            }else{
                if(!stack.isEmpty()) stack.pop(); 
            }
        }
        for(int i=0;i<cht.length;i++){
            if(cht[i]!='#'){
                stack1.push(cht[i]);
            }else{
                if(!stack1.isEmpty()) stack1.pop();
            }
        }
       return stack.equals(stack1);
    }
}