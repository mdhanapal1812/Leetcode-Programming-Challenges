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
    bool hasCycle(ListNode *head) {
        unordered_set<ListNode*> cycle;
        
        while(head != NULL){
            if(cycle.find(head) == cycle.end()){
                
               cycle.insert(head);
            }else{
           
                return true;
            }
            head = head->next;
        }
        
        return false;
    }
};