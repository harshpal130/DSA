/*
// Definition for a Node.
class Node {
    public int val;
    public Node prev;
    public Node next;
    public Node child;
};
*/

class Solution {
    public Node flatten(Node head) {
        Node curr = head;

        while(curr!=null){
            if(curr.child!=null){
                // flatten the child
                Node next = curr.next;
                curr.next = flatten(curr.child);
                curr.next.prev  = curr;
                curr.child = null;

                // find tail
                while(curr.next!=null){
                    curr = curr.next;

                }
                if(next!=null){
                    curr.next = next;
                    next.prev = curr;
                }

                // attach tail to next ptr


            }
            curr = curr.next;

        }
        return head;
        
    }
}