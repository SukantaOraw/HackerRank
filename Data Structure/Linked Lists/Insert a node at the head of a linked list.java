// Problem Statement :

// Given a pointer to the head of a linked list, insert a new node before the head. The next value in the new node should point to head and the data value should be replaced with a given value. Return a reference to the new head of the list. The head pointer given may be null meaning that the initial list is empty.

// Function Description:

// Complete the function insertNodeAtHead in the editor below.

// insertNodeAtHead has the following parameter(s):
//       1. SinglyLinkedListNode llist: a reference to the head of a list
//       2. data: the value to insert in the data field of the new node

// Input Format:
// The first line contains an integer n, the number of elements to be inserted at the head of the list.
// The next n lines contain an integer each, the elements to be inserted, one per function call.

// Constraints:
//       1.   1<=n<=1000
//       2.   1<=list[i]<=1000

// Sample Input
// 5
// 383
// 484
// 392
// 975
// 321
  
// Sample Output
// 321
// 975
// 392
// 484
// 383
  
// Explanation
// Intially the list in NULL. After inserting 383, the list is 383 -> NULL.
// After inserting 484, the list is 484 -> 383 -> NULL.
// After inserting 392, the list is 392 -> 484 -> 383 -> NULL.
// After inserting 975, the list is 975 -> 392 -> 484 -> 383 -> NULL.
// After inserting 321, the list is 321 -> 975 -> 392 -> 484 -> 383 -> NULL.

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        
        LinkedList<Integer> ll = new LinkedList<>();
        
        int loop = scan.nextInt();
        
        for(int i = 0; i < loop; i++){
            
            int temp = scan.nextInt();
            ll.addFirst(temp);
        }
        
        for(int i : ll){
            System.out.println(i);
        }
    }
}
