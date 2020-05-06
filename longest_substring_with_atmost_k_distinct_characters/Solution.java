class Solution {
    public int lengthOfLongestSubstringKDistinct(String s, int k) {
       int windowStart = 0;
        int windowEnd = 0;
        char[] temp = s.toCharArray();
        char[] ch = new char[128];
        int uniqueCharacter = 0;
        int maxLen = 0;

        while(windowEnd != temp.length){
    
           if(ch[temp[windowEnd]] == 0){
                uniqueCharacter++;
            }
            
            ch[temp[windowEnd]]++;

            while(uniqueCharacter >k ){
                  ch[temp[windowStart]] --;
              
              
                if(ch[temp[windowStart]] == 0){
                    uniqueCharacter--;
                }
                  windowStart ++;
               
            }
                  if(maxLen < windowEnd-windowStart+1){
              maxLen = windowEnd-windowStart+1;
          }
                    windowEnd++;
        }
        
        return maxLen;
    }
}