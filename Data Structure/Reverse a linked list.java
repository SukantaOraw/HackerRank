// Problem Statement :

// Given the pointer to the head node of a linked list, change the next pointers of the nodes so that their order is reversed. The head pointer given may be null meaning that the initial list is empty.

// Example:
//  head references the list 1->2->3->Null.

// Manipulate the next pointers of each node in place and return head, now referencing the head of the list 3->2->1->Null.


// Function Description:

// Complete the reverse function in the editor below.

// reverse has the following parameter:
//            SinglyLinkedListNode pointer head: a reference to the head of a list
// Returns
//            SinglyLinkedListNode pointer: a reference to the head of the reversed list

// Input Format:

// The first line contains an integer t, the number of test cases.
// Each test case has the following format:
//        1. The first line contains an integer n, the number of elements in the linked list.
//        2. Each of the next n lines contains an integer, the data values of the elements in the linked list.

// Constraints:
//        1.   1<=t<=10
//        2.   1<=n<=1000
//        3.   1<=list[i]<=1000

// Sample Input
// 1
// 5
// 1
// 2
// 3
// 4
// 5
  
// Sample Output
// 5 4 3 2 1 

public static SinglyLinkedListNode reverse(SinglyLinkedListNode llist) {
    // Write your code here
        SinglyLinkedListNode prev = null, current, next = null;
        current = llist;
        
        while(current != null){
            
            next = current.next;
            current.next = prev;
            
            prev = current;
            current = next; 
        }
        llist = prev;
        return llist;
    }
