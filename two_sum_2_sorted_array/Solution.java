class Solution {
    public int[] twoSum(int[] nums, int target) {
        int startPtr = 0;
        int endPtr = nums.length-1;
        int[] result  = new int[2];
        Arrays.sort(nums);
        
        while(endPtr > startPtr){
            if(nums[endPtr]+nums[startPtr] > target){
                endPtr--;
            }else if(nums[endPtr]+nums[startPtr] < target){
                startPtr++;
            }else{
                result[0] = startPtr+1;
                result[1] = endPtr+1;
                break;
            }
        }
        return result;
    }
}