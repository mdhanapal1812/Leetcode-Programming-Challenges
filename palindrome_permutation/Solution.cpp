class Solution {
public:
    bool canPermutePalindrome(string s) {
        int alreadyFound = 0;
        unordered_map<char,int> check;
        for(int i=0;i<s.size();i++){
            if(check[s[i]] >=1){
                check[s[i]]++;
            }else{
                check[s[i]] = 1;
            }
        }
        
        for(auto i : check){
     
            if((i.second) %2 == 1){
                if(alreadyFound){
                    return false;
                }else{
                alreadyFound = 1;
                }
            }
        }
               
        
        
    
               
               
     return true;
               }
};