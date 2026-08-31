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
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        
        ListNode prev = head;
        ListNode curr = head.next;
        ListNode nex = curr.next;
        int index = 1;

        int first = -1;
        int last =-1;
        int min = Integer.MAX_VALUE;
        int arr[] = {-1,-1};

        while(nex!=null){
            if((curr.val<prev.val && curr.val<nex.val)|| (curr.val>prev.val && curr.val>nex.val)){
                if(first==-1){
                    first = index;
                }else{
                    min = Math.min(min, index-last);
                }
                last = index;

               
            }
            prev=curr;
            curr=nex;
            nex = nex.next;
            index++;
        }
        if(first ==-1 || first==last){
            return arr;
        }


        arr[0]=min;
        arr[1]=last-first;

        return arr;
    }
}