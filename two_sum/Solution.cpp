class Solution {
public:
    vector<int> twoSum(vector<int>& nums, int target) {
        int sum = 0;
        vector<int> result ;
        int found = 0;
        for(int i=0;i<nums.size();i++){
           
            for(int j=0;j<nums.size();j++){
                if(i!=j){
                 sum = nums[i]+nums[j];
                    if(sum == target){
                       result.push_back(i);
                        result.push_back(j);
                          found = 1;
                        break;
                      
                    }
                }
                sum = 0;
            }
            if(found == 1){
                break;
            }
           
        }
        return result;
    }
};