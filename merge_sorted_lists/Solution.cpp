/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode(int x) : val(x), next(NULL) {}
 * };
 */
class Solution {
public:
    ListNode* mergeTwoLists(ListNode* l1, ListNode* l2) {
        map<int,int> count ;
        ListNode * result = NULL;
        ListNode * prev  = NULL;
   
   
        if((l1 == NULL) && (l2 == NULL)){
          return NULL;
            
        }else if((l1 == NULL) && (l2 != NULL)){
            return l2;
        }else if((l2 == NULL) && (l1 != NULL)){
            return l1;
        }
    
        while(l1 != NULL){
         if((count[l1->val]) >=1){
                count[l1->val]++;
            }else{
                count[l1->val] = 1;
            }
            l1 = l1->next;
        }
        
        while(l2!= NULL){
            if(count[l2->val] >=1){
                count[l2->val]++;
            }else{
                count[l2->val] = 1;
            }
            l2 = l2->next;
        }
        
        for(auto i : count){
        
            if(i.second >= 1){
        
                for(int j=0;j<i.second;j++){
                    if(result == NULL){
                     
                        result = new ListNode(i.first);
                        prev = result;
                    }else{
                  
                        ListNode * temp = new ListNode(i.first);
                        prev->next = temp;
                        prev = temp;
                    }
                }
            }else{
                if(result == NULL){
                    result = new ListNode(i.first);
                    result = prev;
                }else{
                        ListNode * temp = new ListNode(i.first);
                        prev->next = temp;
                        prev = temp;
                }
            }
        }
        return result;
    }
};