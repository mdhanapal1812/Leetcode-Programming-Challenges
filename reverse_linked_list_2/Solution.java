/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode reverseBetween(ListNode head, int m, int n) {
        ListNode currentNode = head;
        ListNode previous = null;
        if(head == null){
            return null;
        }
        
        while(m >1){
            previous = currentNode;
            currentNode = currentNode.next;
            m--;
            n--;
        }
        
        ListNode connection = previous;
        ListNode tail = currentNode;
        
        while(n >0){
            ListNode next = currentNode.next;
            currentNode.next = previous;
            previous = currentNode;
            currentNode = next;
            n--;
        }
        
        if(connection == null){
            head = previous;
        }else{
            connection.next = previous;
        }
        
        tail.next = currentNode;
        
        return head;
        
    }
}