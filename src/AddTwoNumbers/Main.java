package AddTwoNumbers;

public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();

        ListNode headNode1 = new ListNode(9);
//        ListNode secNode1 = new ListNode(4);
//        ListNode thirdNode1 = new ListNode(3);

//        secNode1.next = thirdNode1;
//        headNode1.next = secNode1;

        ListNode headNode2 = new ListNode(1);
        ListNode node2 = new ListNode(9);
        ListNode node3 = new ListNode(9);
        ListNode node4 = new ListNode(9);
        ListNode node5 = new ListNode(9);
        ListNode node6 = new ListNode(9);
        ListNode node7 = new ListNode(9);
        ListNode node8 = new ListNode(9);
        ListNode node9 = new ListNode(9);
        ListNode node10 = new ListNode(9);

        node9.next = node10;
        node8.next = node9;
        node7.next = node8;
        node6.next = node7;
        node5.next = node6;
        node4.next = node5;
        node3.next = node4;
        node2.next = node3;
        headNode2.next = node2;
        ListNode solutionNode = sol.addTwoNumbers(headNode1, headNode2);
        ListNode currentNode = solutionNode;
        System.out.println(currentNode.val);
        while(currentNode.next != null){
            System.out.println(currentNode.next.val);
            currentNode = currentNode.next;
        }
    }
}

