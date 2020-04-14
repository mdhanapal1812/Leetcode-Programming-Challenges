class Solution {
    public int reverse(int x) {
        int rev_numb = 0;
        int temp;
        int prev_numb = 0;
        if(x<0){
            temp = -x;
        }else{
            temp = x;
        }
        
        while(temp>0){
            rev_numb = (rev_numb*10) + (temp%10);
            if(((rev_numb - (temp%10))/10) != prev_numb){
                return 0;
            }
            temp = temp/10;
            prev_numb = rev_numb;
        }
        
        if(x<0){
            rev_numb = - rev_numb;
        }
        return rev_numb;
    }
}