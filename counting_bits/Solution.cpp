class Solution {
public:
    vector<int> countBits(int num) {
        int count = 0;
        int n;
        vector<int>bits;
        for(int i=0;i<=num;i++){
       
            n = i;
            while(n){
             count = count + (n & 1 )   ;
             
                n= n>>1;
              
            }
       
            bits.push_back(count);
      
            count = 0;
        }
        return bits;
    }
};