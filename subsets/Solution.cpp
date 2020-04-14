class Solution {
public:
    vector<vector<int>> subsets(vector<int>& nums) {
         int n=nums.size();
    int s=pow(2,n)-1;
    
    vector<vector<int>>result;
    vector<int>v;
    for(int i=0;i<=s;i++){
        for(int j=0;j<n;j++){
            
            if(i & (1<<j))
                v.push_back(nums[j]);
        }
        result.push_back(v);
        v.clear();
    }
    return result;
    }
};