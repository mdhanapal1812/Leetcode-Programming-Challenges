class Solution {
    public int myAtoi(String str) {
     
        //Handling exceptional cases
        if((str == null) ||(str.length() == 0)){
            return 0;
        }
        //Handle white spaces
        str = str.trim();
          double result = 0;
        if(str.length() >= 1){
        //Handle postive and negative
        Boolean isNegative = false;
        int startIndex = 0;
        if(str.charAt(0) == '+'){
            startIndex = 1;
        }else if(str.charAt(0) == '-'){
            startIndex = 1;
            isNegative = true;
        }
        
        //Handle Normal case
      
        for(int i = startIndex;i<str.length();i++){
            if(!Character.isDigit(str.charAt(i))){
                break;
            }
            int temp = Character.getNumericValue(str.charAt(i));
            result = result * 10 + temp;
        }
        
        if(result == Integer.MAX_VALUE){
    
            if(isNegative == true){
                return -Integer.MAX_VALUE;
            }
            return Integer.MAX_VALUE;
        }else if(result == Integer.MIN_VALUE){
            return Integer.MIN_VALUE;
        }
        
        if(isNegative == true){
            result = - result;
        }
        }
        
        return (int)result;
}
}