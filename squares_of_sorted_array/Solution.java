class Solution {
    public int[] sortedSquares(int[] A) {
        int result[] = new int[A.length];
        int left = 0;
        int right = A.length-1;
        
        for(int i=result.length-1;i >=0;i--){
            
            if(A[left]* A[left] >A[right]*A[right]){
                result[i] = A[left] * A[left];
                left++;
            }else{
                result[i] = A[right]* A[right];
                right--;
            }
        }
        return result;
    }
}