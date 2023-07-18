// Problem Statement :
// Given the pointer to the head node of a linked list and an integer to insert at a certain position, create a new node with the given integer as its data attribute, insert this node at the desired position and return the head node.

// A position of 0 indicates head, a position of 1 indicates one node away from the head and so on. The head pointer given may be null meaning that the initial list is empty.

// Example
//  head refers to the first node in the list 1->2->3 
//  data=4.
//  position=2

// Insert a node at position 2 with data=4. The new list is 1->2->4->3

// Function Description Complete the function insertNodeAtPosition in the editor below. It must return a reference to the head node of your finished list.

// insertNodeAtPosition has the following parameters:
//       1. head: a SinglyLinkedListNode pointer to the head of the list
//       2. data: an integer value to insert as data in your new node
//       3. position: an integer position to insert the new node, zero based indexing

// Returns:
//       1. SinglyLinkedListNode pointer: a reference to the head of the revised list

// Input Format:

// The first line contains an integer n, the number of elements in the linked list.
// Each of the next n lines contains an integer SinglyLinkedListNode[i].data.
// The next line contains an integer dta, the data of the node that is to be inserted.
// The last line contains an integer position.

// Constraints:
//      1.  1<=n<=1000
//      2.  1<=Singly_LinkedListNode[i].data<1000
//      3.  0<=position<=n

// Sample Input
// 3
// 16
// 13
// 7
// 1
// 2
  
// Sample Output
// 16 13 1 7

public static SinglyLinkedListNode insertNodeAtPosition(SinglyLinkedListNode llist, int data, int position) {
    // Write your code here
        SinglyLinkedListNode newNode = new SinglyLinkedListNode(data);
        
        if(position == 0){
            newNode.next = llist;
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

        newNode.next = traverse.next;
        traverse.next = newNode;

        return llist;
        
    }
