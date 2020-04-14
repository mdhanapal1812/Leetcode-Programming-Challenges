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
    ListNode *getIntersectionNode(ListNode *headA, ListNode *headB) {
        unordered_set<ListNode *>intersect;
        while(headA != NULL){
            intersect.insert(headA);
            headA = headA->next;
        }
        
        while(headB != NULL){
            if(intersect.find(headB) == intersect.end()){
                intersect.insert(headB);
                headB = headB->next;
            }else{
                return headB;
            }
        }
        return NULL;
    }
};