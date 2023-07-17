package day_355;

import utils.list.ListNode;

import java.util.Stack;

/**
 * <a href = "https://leetcode.com/problems/add-two-numbers-ii/" >
 * 445. Add Two Numbers II </a>
 * <p>
 * You are given two non-empty linked lists representing two non-negative integers. The most significant digit comes first and each of their nodes contains a single digit. Add the two numbers and return the sum as a linked list.
 * <p>
 * You may assume the two numbers do not contain any leading zero, except the number 0 itself.
 */

public class AddTwoNumbersTwo {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode curr1 = l1;
        ListNode curr2 = l2;

        Stack<ListNode> stack1 = new Stack<>();
        Stack<ListNode> stack2 = new Stack<>();
        while(curr1 != null || curr2 != null){
            if(curr1 != null){
                stack1.push(curr1);
                curr1 = curr1.next;
            }

            if(curr2 != null){
                stack2.push(curr2);
                curr2 = curr2.next;
            }
        }

        return addTwoNumbers(stack1, stack2);
    }

    private ListNode  addTwoNumbers(Stack<ListNode> stack1, Stack<ListNode> stack2){
        ListNode head = new ListNode();

        int carry = 0;
        while(!stack1.empty() || !stack2.empty()){

            int sum = carry;

            if(!stack1.empty()){
                sum += stack1.pop().val;
            }

            if(!stack2.empty()){
                sum += stack2.pop().val;
            }


            ListNode newNode = new ListNode(sum % 10);
            newNode.next = head.next;
            head.next = newNode;

            carry = sum / 10;
        }

        if(carry == 1){
            ListNode newNode = new ListNode(1);
            newNode.next = head.next;
            head.next = newNode;
        }

        return head.next;
    }
}
