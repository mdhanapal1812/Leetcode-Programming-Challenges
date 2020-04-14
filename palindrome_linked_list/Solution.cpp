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
    bool isPalindrome(ListNode* head) {
 vector<int> vals;
            ListNode * current = head;
        while(current != NULL){
            vals.push_back(current->val);
            current = current->next;
        }
        
        int front = 0;
        int back = vals.size()-1;
        while(front<back){
            if(vals.at(front) != vals.at(back)){
                return false;
            }
            front ++;
            back--;
        }
        return true;
    }
};