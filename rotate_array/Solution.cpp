class Solution {
public:
    void rotate(vector<int>& nums, int k) {
        int copy[nums.size()];
        for(int i=0;i<nums.size();i++){
            copy[(i+k)%nums.size()] = nums[i];
        }
        
        for(int i=0;i<nums.size();i++){
            nums[i] = copy[i];
        }
    }
};