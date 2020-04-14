class Solution {
    public int missingNumber(int[] nums) {
        int[] sortedNums = new int[nums.length];
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            if(((i+1)<nums.length) && (nums[i+1]!=nums[i]+1)){
                return nums[i]+1;
            }
        }
        if(nums[0] ==0){
            return nums[nums.length-1]+1;
        }
      
        return 0;
    }
}