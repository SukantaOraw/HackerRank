// Problem
// Two strings, a and b, are called anagrams if they contain all the same characters in the same frequencies. For this challenge, the test is not case-sensitive. For example, the anagrams of CAT are CAT, ACT, tac, TCA, aTC, and CtA.

// Function Description
// Complete the isAnagram function in the editor.

// isAnagram has the following parameters:

// string a : the first string
// string b : the second string
// Returns
// boolean: If a and b are case-insensitive anagrams, return true. Otherwise, return false.

// Input Format
// The first line contains a string a.
// The second line contains a string b.

// Constraints
// 1 <= length(a), length(b) <= 50
// Strings a and b consists of English alphabetic characters.
// The comparison should NOT be case sensitive.
  
// Sample Input 0
//  anagram
//  margana
  
// Sample Output 0
//  Anagrams
  
// Explanation 0
// Character	Frequency: anagram	Frequency: margana
// A or a	3	3
// G or g	1	1
// N or n	1	1
// M or m	1	1
// R or r	1	1
// The two strings contain all the same letters in the same frequencies, so we print “Anagrams”.

import java.io.*;
import java.util.*;

public class Solution {
    
     static boolean isAnagram(String a, String b) {
        // Complete the function
        a = a.toUpperCase();
        b = b.toUpperCase();
        
        char[] charArrayA = a.toCharArray();
        char[] charArrayB = b.toCharArray();

        // Sort the character array
        Arrays.sort(charArrayA);
        Arrays.sort(charArrayB);

        // Convert the sorted character array back to a string
        a = new String(charArrayA);
        b = new String(charArrayB);
        
        // System.out.println(a);
        // System.out.println(b);
        
        if(a.equals(b)){
            return true;
        }
        else{
            return false;
        }
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
