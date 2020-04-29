class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        int start ;
        int end;
        //Sorting the array 
        Arrays.sort(nums);
        //Outer loop to fix the first element
        for(int i=0;i<=nums.length-3;i++){
            start = i+1;
            end = nums.length-1;
            if((i==0) || (nums[i] > nums[i-1] )){
                while(start<end){
                    
                    //Perfect scenario
                    if((nums[i]+nums[start]+nums[end]) == 0){
                        List<Integer> tempList = new ArrayList<Integer>();
                        tempList.add(nums[i]);
                        tempList.add(nums[start]);
                        tempList.add(nums[end]);
                        result.add(tempList);
                    }
                    //If the added value is lesser than 0 then we move the start pointer
                     if((nums[i]+nums[start]+nums[end]) <0){
                        int currentStart = start;
                        while((nums[currentStart] == nums[start]) && (start<end)){
                            start++;
                        }
                    }
                    //If the added value is greater than 0 then we move the end pointer
                    else{
                        int currentEnd = end;
                        while((nums[currentEnd] == nums[end]) && (start < end)){
                            end --;
                        }
                    }
                }
            }
        }
        return result;
    }
}