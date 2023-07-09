// Problem
// Static initialization blocks are executed when the class is loaded, and you can initialize static variables in those blocks.

// It’s time to test your knowledge of Static initialization blocks. You can read about it here.

// You are given a class Solution with a main method. Complete the given code so that it outputs the area of a parallelogram with breadth B
// and height H. You should read the variables from the standard input.

// If B <= 0 or H <= 0, the output should be “java.lang.Exception: Breadth and height must be positive” without quotes.

// Input Format
// There are two lines of input. The first line contains B : the breadth of the parallelogram. The next line contains H : the height of the parallelogram.

// Constraints
// -100 <= B <= 100
// -100 <= H <= 100
  
// Output Format
// If both values are greater than zero, then the main method must output the area of the parallelogram. Otherwise, print “java.lang.Exception: Breadth and height must be positive” without quotes.

// Sample Input 1
//  1
//  3
  
// Sample Output 1
//  3
  
// Sample Input 2
//  -1
//  2
  
// Sample Output 2
// java.lang.Exception: Breadth and height must be positive

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner scan = new Scanner(System.in);
        int B = scan.nextInt();
        int H = scan.nextInt();
        
        if(B > 0 && H > 0){
            System.out.println(B*H);
        }
        else{
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        }
        
    }
}
