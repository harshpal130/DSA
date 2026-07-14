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
    public ListNode removeNodes(ListNode head) {
        Stack<ListNode> stack = new Stack<>();
        //insert all node into stack
        
        ListNode temp = head;
        while(temp!=null){
            stack.push(temp);
            temp = temp.next;
        }

        //crete ans list

        ListNode newHead = stack.pop();
        int maxVal = newHead.val;

        while(!stack.isEmpty()){
            ListNode node = stack.pop();
            if(node.val<maxVal){
                continue;
            }
            else{//insert at head  
                node.next = newHead;
                newHead  = node;
                maxVal = newHead.val;
            }
        }
        return newHead;
        
    }
}