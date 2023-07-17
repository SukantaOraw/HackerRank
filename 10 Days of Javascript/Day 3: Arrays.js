// Objective
// In this challenge, we learn about Arrays.

// Function Description
// Complete the getSecondLargest function in the editor below.
// getSecondLargest has the following parameters:

// int nums[n]: an array of integers

// Returns
// int: the second largest number in nums

// Input Format
// The first line contains an integer, n, the size of the nums array.
// The second line contains n space-separated numbers that describe the elements in nums.

// Constraints
// 1 <= n <= 10
// 0 <= numsi <= 100, where numsi is the number at index i.
// The numbers in nums may not be distinct.
  
// Sample Input 0
// 5
// 2 3 6 6 5

// Sample Output 0
// 5

// Explanation 0
// Given the array nums = [2, 3, 6, 6, 5], we see that the largest value in the array is 6 and the second largest value is 5. Thus, we return 5 as our answer.

'use strict';

process.stdin.resume();
process.stdin.setEncoding('utf-8');

let inputString = '';
let currentLine = 0;

process.stdin.on('data', inputStdin => {
    inputString += inputStdin;
});

process.stdin.on('end', _ => {
    inputString = inputString.trim().split('\n').map(string => {
        return string.trim();
    });
    
    main();    
});

function readLine() {
    return inputString[currentLine++];
}

/**
*   Return the second largest number in the array.
*   @param {Number[]} nums - An array of numbers.
*   @return {Number} The second largest number in the array.
**/
function getSecondLargest(nums) {
    // Complete the function
    let firstLargestNum = 0;
  let secondLargestNum = 0;

  for (let i = 0; i < nums.length; i++) {
    if (nums[i] > firstLargestNum) {
      secondLargestNum = firstLargestNum;
      firstLargestNum = nums[i];
    }
    if (nums[i] > secondLargestNum && nums[i] < firstLargestNum) {
      secondLargestNum = nums[i];
    }
  }
  return secondLargestNum;
}


function main() {
    const n = +(readLine());
    const nums = readLine().split(' ').map(Number);
    
    console.log(getSecondLargest(nums));
}
