// Objective
// In this challenge, we learn about switch statements.

// Task
// Complete the getLetter(s) function in the editor. It has one parameter: a string, s, consisting of lowercase English alphabetic letters (i.e., a through z). It must return A, B, C, or D depending on the following criteria:

// If the first character in string s is in the set {a, e, i, o, u}, then return A.
// If the first character in string s is in the set {b, c, d, f, g}, then return B.
// If the first character in string s is in the set {h, j, k, l, m}, then return C.
// If the first character in string s is in the set {n, p, q, r, s, t, v, w, x, y, z}, then return D.
// Hint: You can get the letter at some index i in s using the syntax s[i] or s.charAt(i).

// Function Description
// Complete the getLetter function in the editor below.
// getLetter has the following parameters:

// string s: a string

// Returns
// string: a single letter determined as described above

// Input Format
// Stub code in the editor reads a single string denoting s from stdin.

// Constraints
// 1 <= |s| <= 100, where |s| is the length of s.
// String s contains lowercase English alphabetic letters (i.e., a through z) only.
  
// Sample Input 0
// adfgt

// Sample Output 0
// A

// Explanation 0
// The first character of string s = adfgt is a. Because the given criteria stipulate that we print A any time the first character is in {a, e, i, o, u}, we return A as our answer.

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

function getLetter(s) {
    let letter;
    // Write your code here
    switch (true) {
    case "aeiou".includes(s[0]):
      letter = "A";
      break;
    case "bcdefg".includes(s[0]):
      letter = "B";
      break;
    case "hijklm".includes(s[0]):
      letter = "C";
      break;
    case "nopqrstuvwxyz".includes(s[0]):
      letter = "D";
      break;
    }
    return  letter;
}

function main() {
    const s = readLine();
    
    console.log(getLetter(s));
}
