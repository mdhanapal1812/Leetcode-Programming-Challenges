class Solution {
    public String minWindow(String s, String t) {
        
        //Edge cases
        if((s.isEmpty()) || (t.isEmpty())){
            return "";
        }
        
       String result = "";
        int left = 0;
        int count = 0;
        int min = Integer.MAX_VALUE;
        int[] numerical = new int[128];
        for(int i=0;i<t.length();i++){
            ++numerical[t.charAt(i)];
        }
        
        for(int right = 0;right<s.length();++right){
            if(--numerical[s.charAt(right)] >=0){
             
              
                ++count;
        
            }
            while(count == t.length()){
         
                if(min > right-left+1){
                    min = right-left+1;
                    result = s.substring(left,right+1);
                }
                
                if(++numerical[s.charAt(left)] >0){
                      
          
                    --count;
                              
                }
              
                ++left;
             
            }
        }
        
        
        return result;
    }
}