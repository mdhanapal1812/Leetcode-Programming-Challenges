class Solution {
public:
    bool isValid(string s) {
        stack<int> validPara;
        for(int i=0;i<s.size();i++){
            if(s[i] == '}'){
                if((validPara.size() >=1) && (validPara.top() == '{')){
                validPara.pop();
                }else{
                    return false;
                }
            }else if(s[i] == ']'){
                if((validPara.size() >=1) && (validPara.top() == '[')){
                    validPara.pop();
                }else{
                    return false;
                }
            }else if(s[i] == ')'){
                if((validPara.size() >=1) && (validPara.top() == '(')){
                    validPara.pop();
                }else{
                    return false;
                }
            }else{
                validPara.push(s[i]);
            }
        }
        
        if(validPara.empty()){
            return true;
        }else{
        return false;
        }
    }
};