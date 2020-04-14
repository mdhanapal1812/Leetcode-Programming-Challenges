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
    ListNode* addTwoNumbers(ListNode* l1, ListNode* l2) {
         ListNode* ans=NULL;
        ListNode *prev=NULL;
        bool carry=0;
        int sum;
        while(l1!=NULL || l2!=NULL){
            sum=carry+(l1?l1->val:0)+(l2?l2->val:0);
            carry=(sum>=10)?1:0;
            sum=sum%10;
            ListNode* temp=new ListNode(sum);
            if(not ans){
                ans=temp;
                prev=ans;
            }else{
                prev->next=temp;
                prev=prev->next;
            }
            
            if(l1){
                l1=l1->next;
            } 
            if(l2){
                l2=l2->next;
            }
        }
        if(carry){
            prev->next=new ListNode(carry);
        }
        return ans;
    }
        
        
    
};