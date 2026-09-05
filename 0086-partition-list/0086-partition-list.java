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
    public ListNode partition(ListNode head, int x) {
        ListNode small = new ListNode(0);
        ListNode large = new ListNode(0);
        
        ListNode smallP= small;
        ListNode largeP = large;

        while(head!=null){
            if(head.val<x){
                smallP.next=head;
                head=head.next;
                smallP = smallP.next;
            }else{
                largeP.next=head;
                head=head.next;
                largeP= largeP.next;
            }
        }
        smallP.next=large.next;
        largeP.next=null;

        return small.next;
        
    }
}