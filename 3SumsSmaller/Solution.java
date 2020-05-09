class Solution {
    public int threeSumSmaller(int[] nums, int target) {
        int startPointer;
        int endPointer;
        int result = 0;
        Arrays.sort(nums);
        for(int i=0;i<nums.length-2;i++){
            startPointer = i+1;
            endPointer = nums.length-1;
          
           while(startPointer < endPointer){
               int currentSum = nums[i]+nums[startPointer]+nums[endPointer];
               if(currentSum < target){
                   result = result+(endPointer-startPointer);
                   
               }else{
                   int tempPointer = endPointer -1;
              
                   while(startPointer < tempPointer){
                       currentSum  = nums[i]+nums[startPointer]+nums[tempPointer];
                       if(currentSum < target){
                           result++;
                       }
                      tempPointer--;
                   }
               }
               startPointer++;
           }
        }
        return result;
    }
}