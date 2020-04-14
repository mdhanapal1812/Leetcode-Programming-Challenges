class Solution {
    public int singleNumber(int[] nums) {
        int count =1;
        int i,j;
        for( i=0;i<nums.length-1;i++){

            for( j=0;j<=nums.length-1;j++){
  
                if((nums[i] == nums[j]) && (i!=j)) {
          
                 count++;   
                              
                    break;
                }
                
             
            }
               if(count ==1){
      
                    break;
                }else{
     
                    count = 1;
                }
        }
        
        return nums[i];
    }
}