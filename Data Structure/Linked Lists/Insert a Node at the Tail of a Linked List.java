// Problem Statement :

// You are given the pointer to the head node of a linked list and an integer to add to the list. Create a new node with the given integer. Insert this node at the tail of the linked list and return the head node of the linked list formed after inserting this new node. The given head pointer may be null, meaning that the initial list is empty.


// Input Format:

// You have to complete the SinglyLinkedListNode insertAtTail(SinglyLinkedListNode head, int data) method. It takes two arguments: the head of the linked list and the integer to insert at tail. You should not read any input from the stdin/console.

// The input is handled by code editor and is as follows:
// The first line contains an integer n, denoting the elements of the linked list.
// The next n lines contain an integer each, denoting the element that needs to be inserted at tail.


// Constraints:
//     1. 1<=n<=1000
//     2. 1<=list[i]<=1000

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
            ll.add(temp);
        }
        
        for(int i : ll){
            System.out.println(i);
        }
    }
}
