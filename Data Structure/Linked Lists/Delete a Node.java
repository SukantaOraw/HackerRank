// Problem Statement :

// Delete the node at a given position in a linked list and return a reference to the head node. The head is at position 0. The list may be empty after you delete the node. In that case, return a null value.

// Example:
// list=0->1->2->3
// position=2

// After removing the node at position 2, list'= 0->1->-3.

// Function Description:

// Complete the deleteNode function in the editor below.

// deleteNode has the following parameters:
// - SinglyLinkedListNode pointer llist: a reference to the head node in the list
// - int position: the position of the node to remove

// Returns
// - SinglyLinkedListNode pointer: a reference to the head of the modified list

// Input Format:

// The first line of input contains an integer n, the number of elements in the linked list.
// Each of the next n lines contains an integer, the node data values in order.
// The last line contains an integer, position, the position of the node to delete.

// Constraints:
//      1.  1<=n<=1000
//      2.  1<=list[i]<=1000
  
// Sample Input
// 8
// 20
// 6
// 2
// 19
// 7
// 4
// 15
// 9
// 3
  
// Sample Output
// 20 6 2 7 4 15 9

public static SinglyLinkedListNode deleteNode(SinglyLinkedListNode llist, int position) {
    // Write your code here
        
        if(position == 0){
            llist = llist.next;
            return llist;
        }
        
        SinglyLinkedListNode traverse = llist;
        int count = 0;
        while((count < position - 1) && traverse != null){
            
            traverse = traverse.next;
            count++;
        }
        
        if (traverse == null) {
            // The given position is beyond the length of the list.
            return llist;
        }

        traverse.next = traverse.next.next;

        return llist;
    }
