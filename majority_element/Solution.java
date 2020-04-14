class Solution {
    public int majorityElement(int[] nums) {
        
        HashMap<Integer,Integer> majorityTable = new HashMap<>();
        
        for(int i=0;i<nums.length;i++){
            
            if(majorityTable.containsKey(nums[i])){
                int value = majorityTable.get(nums[i]);
                majorityTable.put(nums[i],value+1);
            }else{
                majorityTable.put(nums[i],1);
            }
            
        }
        
        int max = Collections.max(majorityTable.values());
       int key=0;
       for (HashMap.Entry<Integer, Integer> entry : majorityTable.entrySet()) {
           if (entry.getValue()==max) {
           key = entry.getKey();
       }
     }
       return key; 
    }
}