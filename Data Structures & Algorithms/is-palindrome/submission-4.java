class Solution {
    public boolean isPalindrome(String s) {
        int startPointer =0;
        int endPointer=s.length()-1;
        if(endPointer==startPointer){
            return true;
        }
        while(startPointer <endPointer){
            while(!Character.isLetterOrDigit(s.charAt(startPointer)) && startPointer <endPointer){
                
                      startPointer++;
                
              
            }
            while(!Character.isLetterOrDigit(s.charAt(endPointer))&& endPointer>startPointer){
                
                      endPointer--;
                
              
            }
            if( Character.toLowerCase(s.charAt(startPointer++))!=Character.toLowerCase(s.charAt(endPointer--))){
                return false;
            }
        }
        return true;
    }
}
