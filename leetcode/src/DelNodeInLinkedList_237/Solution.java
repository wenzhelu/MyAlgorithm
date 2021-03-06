package DelNodeInLinkedList_237;

import SinglyList.ListNode;

/**
 * Write a function to delete a node (except the tail)
 * in a singly linked list, given only access to that node.
 *
 * Supposed the linked list is 1 -> 2 -> 3 -> 4
 * and you are given the third node with value 3,
 * the linked list should become 1 -> 2 -> 4 after calling your function.
 */
public class Solution {
    public void deleteNode(ListNode node) {
        ListNode cur = node;
        while(cur!=null){
            cur.val = cur.next.val;
            if(cur.next.next==null){
                cur.next = null;
                return;
            }
            cur = cur.next;
        }
    }
}
