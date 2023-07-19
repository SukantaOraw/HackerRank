// Problem Statement :

// You’re given the pointer to the head nodes of two linked lists. Compare the data in the nodes of the linked lists to check if they are equal. If all data attributes are equal and the lists are the same length, return 1. Otherwise, return 0.

// Example:
// list1=1->2->3->Null
// list2=1->2->3->4->Null

// The two lists have equal data attributes for the first 3 nodes. list2 is longer, though, so the lists are not equal. Return 0.

// Function Description:

// Complete the compare_lists function in the editor below.

// compare_lists has the following parameters:
//       1. SinglyLinkedListNode llist1: a reference to the head of a list
//       2. SinglyLinkedListNode llist2: a reference to the head of a list

// Returns:
// int: return 1 if the lists are equal, or 0 otherwise


// Input Format:
// The first line contains an integer t, the number of test cases.

// Each of the test cases has the following format:
// The first line contains an integer n, the number of nodes in the first linked list.
// Each of the next n lines contains an integer, each a value for a data attribute.
// The next line contains an integer m, the number of nodes in the second linked list.
// Each of the next m lines contains an integer, each a value for a data attribute.

// Constraints:
//     1.    1<=t<=10
//     2.    1<=n,m<=1000
//     3.    1<=list1[i], list2[i]<=1000

// Output Format
// Compare the two linked lists and return 1 if the lists are equal. Otherwise, return 0. Do NOT print anything to stdout/console.
// The output is handled by the code in the editor and it is as follows:
// For each test case, in a new line, print 0 if the two lists are equal, else print 1.

// Sample Input
// 2
// 2
// 1
// 2
// 1
// 1
// 2
// 1
// 2
// 2
// 1
// 2
  
// Sample Output
// 0
// 1

static boolean compareLists(SinglyLinkedListNode head1, SinglyLinkedListNode head2) {
            
        if (head1 == null && head2 == null) {
            return true;
        } else if (head1 == null || head2 == null) {
            return false;
        } else if (head1.data != head2.data) {
            return false;
        }
        return compareLists(head1.next,head2.next);

    }
