class Solution {
public:
    int singleNumber(vector<int>& nums) {
       map<int,int>numsSize;
        for(int i=0;i<nums.size();i++){
            if(numsSize[nums[i]] >=1){
                numsSize[nums[i]]++;
            }else{
                numsSize[nums[i]] = 1;
            }
        }
        
        for(auto i  :numsSize){
            if(i.second == 1){
                return i.first;
            }
        }
               return 0;
    }
        
 
};