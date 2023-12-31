// You are given the pointer to the head node of a linked list and you need to print all its elements in reverse order from tail to head, one element per line. The head pointer may be null meaning that the list is empty – in that case, do not print anything!

// Input Format

// You have to complete the void reversePrint(SinglyLinkedListNode head) method which takes one argument – the head of the linked list. You should NOT read any input from stdin/console.

// The first line of input contains t, the number of test cases.
// The input of each test case is as follows:

// The first line contains an integer n , denoting the number of elements in the list.
// The next n lines contain one element each, denoting the elements of the linked list in the order.
// Constraints

// 1 <= n <= 1000
// 1<= list’i<= 1000 ,where list i is the i’th element in the list.
  
// Output Format
// Complete the reversePrint function in the editor below and print the elements of the linked list in the reverse order, each in a new line.

// Sample Input
// 1
// 2
// 3
// 4
// 5
// 6
// 7
// 8
// 9
// 10
// 11
// 12
// 13
// 14
// 15
// 16
// 17
// 3
// 5
// 16
// 12
// 4
// 2
// 5
// 3
// 7
// 3
// 9
// 5
// 5
// 1
// 18
// 3
// 13
  
// Sample Output
// 1
// 2
// 3
// 4
// 5
// 6
// 7
// 8
// 9
// 10
// 11
// 12
// 13
// 5
// 2
// 4
// 12
// 16
// 9
// 3
// 7
// 13
// 3
// 18
// 1
// 5
  
// Explanation

// There are three test cases.
// The first linked list has 5 elements: 16 -> 12 -> 4 -> 2 -> 5. Printing this in reverse order will produce: 5 -> 2 -> 4 -> 12 -> 16.
// The second linked list has 3 elements: 7 -> 3 -> 9. Printing this in reverse order will produce: 9 -> 3 -> 7.
// The third linked list has 5 elements: 5 -> 1 -> 18 -> 3 -> 13. Printing this in reverse order will produce: 13 -> 3 -> 18 -> 1 -> 5.

public static void reversePrint(SinglyLinkedListNode llist) {
    // Write your code here
    if (llist.next != null) {
        reversePrint(llist.next);
    }
    
    System.out.println(llist.data);
        
    }
