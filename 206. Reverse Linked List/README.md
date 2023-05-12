# 206. Reverse Linked List

Given the head of a singly linked list, reverse the list, and return the reversed list.

#### Example 1:
<img width="508" alt="Screenshot 2023-05-13 at 12 04 06 AM" src="https://github.com/Kumushai9919/Leetcode/assets/83897840/fb37cd0f-d410-450e-b8cd-8f2298ff8592">

````
Input: head = [1,2,3,4,5]
Output: [5,4,3,2,1]
````
#### Example 2:
<img width="179" alt="Screenshot 2023-05-13 at 12 04 18 AM" src="https://github.com/Kumushai9919/Leetcode/assets/83897840/0b2790e9-59f5-4d8b-9f67-e4f9ae77f3d3">

````
Input: head = [1,2]
Output: [2,1]
````
#### Example 3:
````
Input: head = []
Output: []
 ````````

#### Constraints:
````
The number of nodes in the list is the range [0, 5000].
-5000 <= Node.val <= 5000
````




#### Java Solution Code:
````
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
    public ListNode reverseList(ListNode head) { 
        ListNode prev = null;  //we need prev node to reverse
        
        while(head != null){  //to traverse the list we gonna to loop while head is not equal to null, head = head.next
            ListNode next_node = head.next;
            
            head.next = prev;   //prev (<-) head.next
            prev = head;        
            head = next_node;    
        }
        
        return prev;  //it's now a head 
    }
}


 
````
