class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> numbers= new HashSet<>();
        for(int num:nums){
            numbers.add(num);
        }
       int longest=0;
       for(int i=0;i<nums.length;i++){
         if(!numbers.contains(nums[i]-1)){
            int sequence=1;
            int length=1;
            while(numbers.contains(nums[i]+length)){
                sequence++;
                length++;
            }
            longest=Math.max(longest,sequence);
         }
       }
       return longest;
    }
}

