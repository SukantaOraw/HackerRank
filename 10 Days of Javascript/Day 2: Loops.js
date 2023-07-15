// Objective
// In this challenge, we practice looping over the characters of string.

// Task
// First, print each vowel in s on a new line. The English vowels are a, e, i, o, and u, and each vowel must be printed in the same order as it appeared in s.
// Second, print each consonant (i.e., non-vowel) in s on a new line in the same order as it appeared in s.
  
// Function Description
// Complete the vowelsAndConsonants function in the editor below.
// vowelsAndConsonants has the following parameters:

// string s: the string to process

// Prints
// Print each vowel of s in order on a new line, then print each consonant in order on a new line. Return nothing.
  
// Input Format
// There is one line of input with the string s.

// Output Format
// First, print each vowel in s on a new line (in the same order as they appeared in s). Second, print each consonant (i.e., non-vowel) in s on a new line (in the same order as they appeared in s).

// Sample Input 0
// javascriptloops

// Sample Output 0
// a
// a
// i
// o
// o
// j
// v
// s
// c
// r
// p
// t
// l
// p
// s

// Explanation 0
// Observe the following:

// Each letter is printed on a new line.
// Then the vowels are printed in the same order as they appeared in s.
// Then the consonants are printed in the same order as they appeared in s.

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

/*
 * Complete the vowelsAndConsonants function.
 * Print your output using 'console.log()'.
 */
function vowelsAndConsonants(s) {
    const vowels = ["a", "e", "i", "o", "u"];
    const string = s.split("");
    let vowelArr = [];
    let consonantArr = [];
    for (let i = 0; i < string.length; i++) {
    vowels.includes(string[i])
      ? vowelArr.push(string[i])
      : consonantArr.push(string[i]);
  }
  for (let i = 0; i < vowelArr.length; i++) {
    console.log(vowelArr[i]);
  }
  for (let i = 0; i < consonantArr.length; i++) {
    console.log(consonantArr[i]);
  }
}


function main() {
    const s = readLine();
    
    vowelsAndConsonants(s);
}
