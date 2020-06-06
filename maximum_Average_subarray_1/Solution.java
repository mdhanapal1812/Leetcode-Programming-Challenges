class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int windowStart = 0;
        double sum =0 , maxSum = Double.NEGATIVE_INFINITY;
        
        for(int windowEnd = 0;windowEnd < nums.length;windowEnd++){
            
            sum = sum + nums[windowEnd];
            
            //The condition to check if the window has reached the maximum size k
            if((windowEnd-windowStart+1) == k){
                
                //update the maximum sum value calculated upto now
                if(sum > maxSum){
                    maxSum = sum;
                }
                
                sum = sum - nums[windowStart];
                windowStart++;
                
            }
        }
        
        return maxSum / k;
        
        
        
    }
}