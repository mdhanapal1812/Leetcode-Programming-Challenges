class Solution {
public:
    int hammingWeight(uint32_t n) {
        uint32_t count = 0;
        while(n){
             count = count + (n & 1);
             n = n >>1;
        }
        return  count;
    }
};