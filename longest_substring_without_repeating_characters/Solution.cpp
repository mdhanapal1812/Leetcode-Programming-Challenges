class Solution {
public:
    int lengthOfLongestSubstring(string s) {
        int longest = 0;
        string toCheck = "";
        
        for(int i=0;i<s.size();i++){
            toCheck = toCheck+s[i];
            for(int j=i+1;j<=s.size()-1;j++){
                if((toCheck.find(s[j])) != string::npos){
                    break;
                }else{
                    toCheck = toCheck+s[j];
                }
            }
            if(toCheck.size() > longest){
                longest = toCheck.size();
            }
          
            toCheck= "";
        }
        return longest;
    }
};