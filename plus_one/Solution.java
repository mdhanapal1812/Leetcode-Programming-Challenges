class Solution {
    public int[] plusOne(int[] digits) {
        int carry = 0;
        int number = 0;
        ArrayList<Integer>check = new ArrayList<Integer>();
        
        if(digits.length == 1){
           number = digits[0]+1;
            check.add(number%10);
            carry = number/10;
            if(carry!=0){
                check.add(carry);
            }
            
        }else{
        for(int i = digits.length-1;i>=0;i--){

            if(i == digits.length-1){
           number = digits[i]+1;
            check.add(number %10);
            carry = number / 10;
                
    
            }else{
                number = digits[i]+carry;
                if(carry!=0){
                    
                carry = number/10;
                }
                check.add(number%10);
                
                if((i == 0 ) && (carry != 0)){
                    check.add(carry);
                }
            }
        }
        }
        
      Collections.reverse(check);
        
        int[]result = new int[check.size()];
        for(int i=0;i<check.size();i++){
            result[i] = check.get(i);
        }
        
   
        
        return result;
    }
}