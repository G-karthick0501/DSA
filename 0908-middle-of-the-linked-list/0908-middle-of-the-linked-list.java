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
    public ListNode middleNode(ListNode head) {
        ListNode curr=head;
        int x=0;
        while(curr!=null){
            x++;
            curr=curr.next;
        }
        ListNode curr2=head;
        x=(int)Math.ceil(x/2);
        for(int i=0;i<x;i++){
            curr2=curr2.next;
        }
        return curr2;
        
    }
}