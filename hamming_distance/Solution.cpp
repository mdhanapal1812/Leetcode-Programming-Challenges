class Solution {
public:
    int hammingDistance(int x, int y) {
        int xored = x ^ y;
        int count = 0;
   
        while(xored){
         count = count + (xored & 1);
        xored = xored>>1;
        }
        return count;
    }
};