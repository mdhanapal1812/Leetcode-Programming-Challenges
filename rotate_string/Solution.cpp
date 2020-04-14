class Solution {
public:
    bool rotateString(string A, string B) {
        char a [A.size()+1];
        char b[B.size()+1];
        strcpy(a,A.c_str());
        strcpy(b,B.c_str());
        if((A.size() == B.size()) && (A.size() >= 0) ){
            string newString = A + A ;
            char c[newString.size()+1];
            strcpy(c,newString.c_str());
            if(strstr(c,b) == NULL){
                return false;
    
            }else{
                return true;
            }
        }else{
        return false;
        }
    }
};