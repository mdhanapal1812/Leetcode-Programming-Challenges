class Solution {
    public int twoSumLessThanK(int[] A, int K) {
        Arrays.sort(A);
        int startPointer = 0;
        int endPointer = A.length-1;
        int maxLen = Integer.MIN_VALUE;
        
        while(startPointer < endPointer){
            int sum = A[startPointer]+A[endPointer];
            if(sum < K){
                startPointer++;
            }else{
                endPointer--;
            }
            
            if((sum > maxLen) && (sum <K)){
                maxLen = sum;
            }
        }
        
        if(maxLen == Integer.MIN_VALUE){
            return -1;
        }
        return maxLen;
    }
}