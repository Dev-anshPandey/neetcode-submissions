class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer , Integer> map = new HashMap<>();
        // adding elements to hashMap (number ,frequency)
        for(int num:nums){
            map.put(num, map.getOrDefault(num,0)+1);
        }
        // each index will contain list of element having freq=index
        List<Integer>[] freq = new List[nums.length+1];
        //assign an empty array to each index
        for(int i=0;i<freq.length;i++){
            freq[i]=new ArrayList<>();
        }

        for(Map.Entry<Integer,Integer> entry: map.entrySet()){
            freq[entry.getValue()].add(entry.getKey());
        }

        int[] res = new int[k];
        int index=0;

        for(int i=freq.length-1; i>0&& index<k;i--){
            for(int n:freq[i]){
                res[index++]=n;
                if(index==k){
                    return res;
                }
            }
        }
        return res;

    }
}
