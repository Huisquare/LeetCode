package AddTwoNumbers;

import java.math.BigDecimal;
import java.math.BigInteger;

public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode currentNode1 = l1;

        ListNode currentNode2 = l2;

        int posNode1 = 0;

        int posNode2 = 0;

        ListNode headNode = new ListNode((currentNode1.val + currentNode2.val) % 10);

        ListNode currentResultNode = headNode;

        int value1 = currentNode1.val;
        int value2 = currentNode2.val;
        int leftover = (value1 + value2) >= 10 ? 1 : 0;

        while (currentNode1.next != null || currentNode2.next != null || leftover != 0){

            if (currentNode1.next != null) {
                currentNode1 = currentNode1.next;
                value1 = currentNode1.val;
            } else {
                value1 = 0;
            }

            if (currentNode2.next != null) {
                currentNode2 = currentNode2.next;
                value2 = currentNode2.val;
            } else {
                value2 = 0;
            }

            int sum = value1 + value2 + leftover;

            int toPutInNode = sum % 10;

            leftover = sum >= 10 ? 1 : 0;

            ListNode newNode = new ListNode(toPutInNode);
            currentResultNode.next = newNode;
            currentResultNode = newNode;
        }
        return headNode;
    }
}
