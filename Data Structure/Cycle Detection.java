// Problem Statement :

// A linked list is said to contain a cycle if any node is visited more than once while traversing the list. Given a pointer to the head of a linked list, determine if it contains a cycle. If it does, return 1. Otherwise, return 0.

// Example
// head refers 1 -> 2 -> 3 -> NUL
// The numbers shown are the node numbers, not their data values. There is no cycle in this list so return 0.
// head refers 1 -> 2 -> 3 -> 1 -> NULL
// There is a cycle where node 3 points back to node 1, so return 1.

// Function Description
// Complete the has_cycle function in the editor below.
  
// It has the following parameter:
// SinglyLinkedListNode pointer head: a reference to the head of the list
  
// Returns
// int: 1 if there is a cycle or 0 if there is not
// Note: If the list is empty, head will be null.

// Input Format
// The code stub reads from stdin and passes the appropriate argument to your function. The custom test cases format will not be described for this question due to its complexity. Expand the section for the main function and review the code if you would like to figure out how to create a custom case.

  static boolean hasCycle(SinglyLinkedListNode head) {

        ArrayList<SinglyLinkedListNode> alist = new ArrayList<>();
        SinglyLinkedListNode temp = head;
        while(temp.next != null){
            
            if(alist.contains(temp)){
                return true;
            }
            
            alist.add(temp);
            temp = temp.next;
        }
        
        return false;
    }
