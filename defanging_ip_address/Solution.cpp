class Solution {
public:
    string defangIPaddr(string address) {
 
        string newString;
        
        for(int i=0;i<address.size();i++){
            if(address[i] == '.'){
                newString = newString+"[.]";
            }else{
                newString = newString+address[i];
            }
        }
        
     
        
        return newString;
    }
};