// Problem Statement :
// An array is a type of data structure that stores elements of the same type in a contiguous block of memory. In an array, A, of size N, each memory location has some unique index, i (where 0<=i<N), that can be referenced as A[i] or Ai.

// Reverse an array of integers.

// Note: If you've already solved our C++ domain's Arrays Introduction challenge, you may want to skip this.

// Example:
// A=[1,2,3]
// Return [3,2,1].

// Function Description:
// Complete the function reverseArray in the editor below.
// reverseArray has the following parameter(s):

//  1. int A[n]: the array to reverse
// Returns
//  1 .int[n]: the reversed array

// Input Format:
// The first line contains an integer, N, the number of integers in A.
// The second line contains N space-separated integers that make up A.

// Constraints:
// 1<=N<=10^3
// 1<=N<=10^4 where A[i] is ith integer in A.

// Sample Input 1
// Array: arr
// 1
// 4
// 3
// 2

// 4
// 1 4 3 2
  
// Sample Output 1
// 2 3 4 1

public static List<Integer> reverseArray(List<Integer> a) {
    // Write your code here
        int size = a.size();
        int start = 0;
        int end = size - 1;
        
        while(start < end){
            
            int temp = a.get(start);
            a.set(start, a.get(end));
            a.set(end, temp);
            start++;
            end--;
        }
        return a;
    }
