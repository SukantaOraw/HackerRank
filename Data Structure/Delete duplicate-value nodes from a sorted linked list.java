// Problem Statement :

// This challenge is part of a tutorial track by MyCodeSchool

// You are given the pointer to the head node of a sorted linked list, where the data in the nodes is in ascending order. Delete nodes and return a sorted list with each distinct value in the original list. The given head pointer may be null indicating that the list is empty.

// Example

// head refers to the first node in the list 1 -> 2 -> 2- >  3 -> 3 -> 3 -> 3 -> NULL.

// Remove 1 of the 2 data values and return  pointing to the revised list 1 -> 2 -> 3 -> NULL.

// Function Description

// Complete the removeDuplicates function in the editor below.

// removeDuplicates has the following parameter:

// SinglyLinkedListNode pointer head: a reference to the head of the list


// Returns

// SinglyLinkedListNode pointer: a reference to the head of the revised list


// Input Format

// The first line contains an integer t, the number of test cases.

// The format for each test case is as follows:

// The first line contains an integer n, the number of elements in the linked list.
// Each of the next n lines contains an integer, the data value for each of the elements of the linked list.

// Constraints
// • 1 <= t <= 10
// • 1 <= n <= 1000
// • 1 <= list[i] <= 1000

public static SinglyLinkedListNode removeDuplicates(SinglyLinkedListNode llist) {
    // Write your code here
        SinglyLinkedListNode temp = llist;

        while (temp != null) {
        SinglyLinkedListNode nnode = temp;

        while (nnode.next != null) {
            if (temp.data == nnode.next.data) {
                
                nnode.next = nnode.next.next;
            } else {
        
                nnode = nnode.next;
            }
        }

        temp = temp.next;
    }

    return llist;
    }
