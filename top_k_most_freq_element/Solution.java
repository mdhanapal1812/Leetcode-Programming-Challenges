class Solution {
    public int[] topKFrequent(int[] nums, int k) {
  
        
        HashMap<Integer,Integer>map = new HashMap<Integer,Integer>();
        
        for(int i = 0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                int key = map.get(nums[i]);
                map.put(nums[i],key+1);
            }else{
                map.put(nums[i],1);
            }
        }
              
        List<Integer>resultant = new ArrayList<Integer>(map.keySet());
        Collections.sort(resultant,(number1,number2)->map.get(number2)-map.get(number1));
        int[] result = new int[k];
        for(int i=0;i<k;i++){
            result[i] = resultant.get(i);
        }
        
        
        return result;
        
    }
}