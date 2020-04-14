class Solution {
  public int rob(int[] nums) {
      if(nums.length == 0){
          return 0;
      }
     
          int incl = nums[0]; 

        int excl = 0; 
        int excl_new; 
        int i; 
  
        for (i = 1; i < nums.length; i++) 
        {
   
            excl_new = (incl > excl) ? incl : excl; 
     
  
          
            incl = excl + nums[i]; 
  
            excl = excl_new; 
   
        } 
  
        /* return max of incl and excl */
        return ((incl > excl) ? incl : excl); 
  }
}