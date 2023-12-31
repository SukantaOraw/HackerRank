// Objective
// Today, we’re discussing data types. Check out the attached tutorial for more details.

// Task
// Variables named firstInteger, firstDecimal, and firstString are declared for you in the editor below. You must use the  operator to perform the following sequence of operations:

// Convert secondInteger to an integer (Number type), then sum it with firstInteger and print the result on a new line using console.log.
// Convert secondDecimal to a floating-point number (Number type), then sum it with firstDecimal and print the result on a new line using console.log.
// Print the concatenation of firstString and secondString on a new line using console.log. Note that firstString must be printed first.

// Input Format
// Data Type	Parameter	Description
// string	secondInteger	The string representation of an integer you must sum with firstInteger.
// string	secondDecimal	The string representation of a floating-point number you must sum with firstDecimal.
// string	secondString	A string of one or more space-separated words you must append to secondString.
  
// Output Format
// Print the following three lines of output:

// On the first line, print the sum of firstInteger and the integer representation of secondInteger.
// On the second line, print the sum of firstDecimal and the floating-point representation of secondDecimal.
// On the third line, print firstString concatenated with secondString. You must print firstString before secondString.
  
// Sample Input 0
// 12
// 4.32
// is the best place to learn and practice coding!

// Sample Output 0
// 16
// 8.32
// HackerRank is the best place to learn and practice coding!

// Explanation 0
// When we sum the integers 4 and 12, we get the integer 16.
// When we sum the floating-point numbers 4.0 and 4.32, we get 8.32. When we concatenate HackerRank with is the best place to learn and practice coding!, we get HackerRank is the best place to learn and practice coding!.

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
*   The variables 'firstInteger', 'firstDecimal', and 'firstString' are declared for you -- do not modify them.
*   Print three lines:
*   1. The sum of 'firstInteger' and the Number representation of 'secondInteger'.
*   2. The sum of 'firstDecimal' and the Number representation of 'secondDecimal'.
*   3. The concatenation of 'firstString' and 'secondString' ('firstString' must be first).
*
*	Parameter(s):
*   secondInteger - The string representation of an integer.
*   secondDecimal - The string representation of a floating-point number.
*   secondString - A string consisting of one or more space-separated words.
**/

function performOperation(secondInteger, secondDecimal, secondString) {
    // Declare a variable named 'firstInteger' and initialize with integer value 4.
    const firstInteger = 4;
    
    // Declare a variable named 'firstDecimal' and initialize with floating-point value 4.0.
    const firstDecimal = 4.0;
    
    // Declare a variable named 'firstString' and initialize with the string "HackerRank".
    const firstString = 'HackerRank ';
    
    // Write code that uses console.log to print the sum of the 'firstInteger' and 'secondInteger' (converted to a Number        type) on a new line.
    
    console.log(firstInteger + Number(secondInteger));

    // Write code that uses console.log to print the sum of 'firstDecimal' and 'secondDecimal' (converted to a Number            type) on a new line.
    
    console.log(firstDecimal + Number(secondDecimal));
    // Write code that uses console.log to print the concatenation of 'firstString' and 'secondString' on a new line. The        variable 'firstString' must be printed first.
    console.log(firstString.concat(secondString));
}


function main() {
    const secondInteger = readLine();
    const secondDecimal = readLine();
    const secondString = readLine();
    
    performOperation(secondInteger, secondDecimal, secondString);
}
