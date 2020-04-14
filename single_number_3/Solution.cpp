class Solution {
public:
    vector<int> singleNumber(vector<int>& nums) {
        map<int,int>numsCount;
        vector<int>check;
        for(int i=0;i<nums.size();i++){
            if(numsCount[nums[i]] >= 1){
                numsCount[nums[i]]++;
            }else{
                numsCount[nums[i]] = 1;
            }
        }
        
        for(auto i : numsCount){
            if(i.second == 1){
                check.push_back(i.first);
            }
        }
        
        return check;
    }
};