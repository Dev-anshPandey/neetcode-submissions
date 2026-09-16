class Solution {
    public boolean isPalindrome(String s) {
        int startPointer =0;
        int endPointer=s.length()-1;
        if(endPointer==startPointer){
            return true;
        }
        while(startPointer <endPointer){
            while(!Character.isLetterOrDigit(s.charAt(startPointer))){
                if(startPointer ==s.length()-1){
                    return true;
                }
                else{
                      startPointer++;
                }
              
            }
            while(!Character.isLetterOrDigit(s.charAt(endPointer))){
                if(endPointer ==0){
                    return true;
                }
                else{
                      endPointer--;
                }
              
            }
            if( Character.toLowerCase(s.charAt(startPointer++))!=Character.toLowerCase(s.charAt(endPointer--))){
                return false;
            }
        }
        return true;
    }
}
