class Solution {
public:
    bool containsDuplicate(vector<int>& nums) {
        unordered_map<int,int>check;
        for(int i=0;i<nums.size();i++){
            if(check[nums[i]] >= 1){
                check[nums[i]]++;
            }else{
                check[nums[i]] =1;
            }
        }
        
        for(auto i : check){
            if(i.second >1){
                return true;
            }
        }
        
        return false;
    }
};