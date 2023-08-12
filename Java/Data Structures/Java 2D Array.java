// Problem Statement
// You are given a 2D array with dimensions 6*6. An hourglass in an array is defined as a portion shaped like this:

// a b c
//   d
// e f g
  
// For example, if we create an hourglass using the number 1 within an array full of zeros, it may look like this:

// 1 1 1 0 0 0
// 0 1 0 0 0 0
// 1 1 1 0 0 0
// 0 0 0 0 0 0
// 0 0 0 0 0 0
// 0 0 0 0 0 0
  
// Actually, there are many hourglasses in the array above. The three topmost hourglasses are the following:

// 1 1 1     1 1 0     1 0 0
//   1         0         0
// 1 1 1     1 1 0     1 0 0
  
// The sum of an hourglass is the sum of all the numbers within it. The sum for the hourglasses above are 7, 4, and 2, respectively.

// In this problem, you have to print the largest sum among all the hourglasses in the array.

// Note: If you have already solved the problem "Java 2D array" in the data structures chapter of the Java domain, you may skip this challenge.

// /*Input Format
// There will be exactly 6 lines of input, each containing 6 integers separated by spaces. Each integer will be between -9 and 9, inclusively.

// Output Format
// Print the answer to this problem on a single line.

// Sample Input
// 1 1 1 0 0 0
// 0 1 0 0 0 0
// 1 1 1 0 0 0
// 0 0 2 4 4 0
// 0 0 0 2 0 0
// 0 0 1 2 4 0
  
// Sample Output
// 19

// Explanation
// The hourglass possessing the largest sum is:

// 2 4 4
//   2
// 1 2 4

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {

    /*
     * Complete the 'hourglassSum' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts 2D_INTEGER_ARRAY arr as parameter.
     */

    public static int hourglassSum(List<List<Integer>> arr) {
    // Write your code here
        
        ArrayList<Integer> sum = new ArrayList<>();
        
        for(int i = 0; i < 4; i++){
            
            for(int j = 0; j < 4; j++){
                
                int temp = arr.get(i).get(j) + arr.get(i).get(j + 1) + arr.get(i).get(j + 2) +
                       arr.get(i + 1).get(j + 1) +
                       arr.get(i + 2).get(j) + arr.get(i + 2).get(j + 1) + arr.get(i + 2).get(j + 2);
                
                sum.add(temp);
            }
        }       
        
        Integer max = Collections.max(sum);
        return max;
    }

}

public class Solution {
    
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<List<Integer>> arr = new ArrayList<>();

        for (int i = 0; i < 6; i++) {
            String[] arrRowTempItems = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

            List<Integer> arrRowItems = new ArrayList<>();

            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowTempItems[j]);
                arrRowItems.add(arrItem);
            }

            arr.add(arrRowItems);
        }
        
        int result = Result.hourglassSum(arr);
        
        System.out.println(result);

        bufferedReader.close();
    }
}
