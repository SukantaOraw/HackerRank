// Problem:
// You have an empty sequence, and you will be given N queries. Each query is one of these three types:
// 1 x  -Push the element x into the stack.
// 2    -Delete the element present at the top of the stack.
// 3    -Print the maximum element in the stack.

// Function Description

// Complete the getMax function in the editor below.

// getMax has the following parameters:
// - string operations[n]: operations as strings

// Returns
// - int[]: the answers to each type 3 query

// Input Format
// The first line of input contains an integer, n. The next n lines each contain an above mentioned query.

// Constraints
// 1 <= n <= 10^5
// 1 <= n <= 10^9
// 1 <= type <= 3
// All queries are valid.

// Sample Input
// STDIN   Function
// -----   --------
// 10      operations[] size n = 10
// 1 97    operations = ['1 97', '2', '1 20', ....]
// 2
// 1 20
// 2
// 1 26
// 1 20
// 2
// 3
// 1 91
// 3
  
// Sample Output
// 26
// 91

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);
        int loop = scan.nextInt();
        
        Stack<Integer> store = new Stack<>();
        Stack<Integer> maxStack = new Stack<>();
        
        for(int i = 0; i < loop; i++){
            
            int check = scan.nextInt();
            switch(check){
                
                case 1:
                    int x = scan.nextInt();
                    store.push(x);
                    if(maxStack.isEmpty() || x >= maxStack.peek()) {
                        maxStack.push(x);
                    }
                    break;
 
                case 2:
                    int popitm = store.pop();
                    if(popitm == maxStack.peek()) {
                        maxStack.pop();
                    }
                    break;
 
                case 3:
                    System.out.println(maxStack.peek());
                    break;
 
                default: break;
            }
        }
    }
}
