// Problem
// This exercise is to test your understanding of Java Strings. A sample String declaration:

// String myString = "Hello World!"
// The elements of a String are called characters. The number of characters in a String is called the length, and it can be retrieved with the String.length() method.

// Given two strings of lowercase English letters, A and B, perform the following operation:

// Sum of length of A and B.
// Determine if A is lexicographically larger than B(i.e.: B comes after A in dictionary?).
// Capitalize the first letter of A and B and print them on a single line, separated by a space.
// Input Format
// The first line contains a string A. The second line contains another string B. The strings are comprised of only lowercase English letters.

// Output Format
// There are three lines of output:
// For the first line, sum the lengths of A and B.
// For the second line, write Yes if is A lexicographically greater than B otherwise print No instead.
// For the third line, capitalize the first letter in both A and B and print them on a single line, separated by a space.

// Sample Input
//  hello
//  java
  
// Sample Input
//  9
//  No
//  Hello Java
  
// Explanation
// String A is “hello” and B is “java”. A has a length of 5, and B has a length of 4; the sum of their lengths is 9.
// When sorted alphabetically/lexicographically, “hello” precedes “java”; therefore, A is not greater than B and the answer is No. When you capitalize the first letter of both A and B and then print them separated by a space, you get “Hello Java”.

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        
        String str1 = scan.nextLine();
        String str2 = scan.nextLine();
        
        System.out.println(str1.length() + str2.length());
        
        int check = str1.compareTo(str2);
        if(check > 0){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
        
        System.out.println(str1.substring(0,1).toUpperCase() + str1.substring(1) + " " + str2.substring(0,1).toUpperCase() + str2.substring(1));
    }
}
