// Problem Statement :

// A left rotation operation on an array of size n shifts each of the array's elements 1 unit to the left. Given an integer, d, rotate the array that many steps left and return the result.

// Example:
// d=2
// arr=[1,2,3,4,5]

// After 2 rotations, arr'=[3,4,5,1,2].

// Function Description:
// Complete the rotateLeft function in the editor below.
// rotateLeft has the following parameters:
//    1. int d: the amount to rotate by
//    2. int arr[n]: the array to rotate

// Returns 
//    1. int[n]: the rotated array

// Input Format:
// The first line contains two space-separated integers that denote n, the number of integers, and d, the number of left rotations to perform.
// The second line contains n space-separated integers that describe arr[].


// Constraints:
//    1. 1<=n<=10^5 
//    2. 1<=d<=n 
//    3. 1<=a[i]<=10^6

// Sample Input
// 5 4
// 1 2 3 4 5
  
// Sample Output
// 5 1 2 3 4

public static List<Integer> rotateLeft(int d, List<Integer> arr) {
    // Write your code here
        int n = arr.size();
        d = d % n; // To handle cases where d is greater than the size of the list

        // Reverse the first 'd' elements
        reverse(arr, 0, d - 1);

        // Reverse the remaining 'n-d' elements
        reverse(arr, d, n - 1);

        // Reverse the entire list
        reverse(arr, 0, n - 1);

        return arr;
        
    }
    
    private static void reverse(List<Integer> arr, int start, int end) {
        while (start < end) {
            int temp = arr.get(start);
            arr.set(start, arr.get(end));
            arr.set(end, temp);
            start++;
            end--;
        }
    }
