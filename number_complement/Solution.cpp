class Solution {
public:
    int findComplement(int num) {

        int tempcopy = num;
        int i=0;
        while( tempcopy >0){
            num = num ^ (1<<i);
             tempcopy = tempcopy >>1;
            i++;
        }

        
        return num;
        
        
    }
};