// Objective

// The fundamental data types in c are int, float and char. Today, we're discussing int and float data types.

// The printf() function prints the given statement to the console. The syntax is printf("format string",argument_list);. In the function, if we are using an integer, character, string or float as argument, then in the format string we have to write %d (integer), %c (character), %s (string), %f (float) respectively.

// The scanf() function reads the input data from the console. The syntax is scanf("format string",argument_list);. For ex: The scanf("%d",&number) statement reads integer number from the console and stores the given value in variable number.
// To input two integers separated by a space on a single line, the command is scanf("%d &n, &m), where n
// and m are the two integers.

// Task
// Your task is to take two numbers of int data type, two numbers of float data type as input and output their sum:
// 1. Declare 4 variables: two of type int and two of type float.
// 2. Read 2 lines of input from stdin (according to the sequence given in the 'Input Format' section below) and
// initialize your 4 variables.
// 3. Use the + and — operator to perform the following operations:
// o Print the sum and difference of two int variable on a new line.
// o Print the sum and difference of two float variable rounded to one decimal place on a new line.

// Input Format

// The first line contains two integers.
// The second line contains two floating point numbers.

// Constraints
// • I integer variables 104
// • I < float variables < 104

// Output Format
// Print the sum and difference of both integers separated by a space on the first line, and the sum and difference
// of both float (scaled to I decimal place) separated by a space on the second line.

// Sample Input
// 10 4
// 4.0 2.0
  
// Sample Output
// 14 6
// 6.0 2.0

// Explanation
// When we sum the integers IO and 4, we get the integer 14. When we subtract the second number 4 from the
// first number IO, we get 6 as their difference.
// When we sum the floating-point numbers 4.0 and 2.0, we get 6.0. When we subtract the second number 2.0
// from the first number 4.0, we get 2.0 as their difference.

#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>

int main()
{
	int n,m,sum,diff;
  float a,b,fsum,fdiff;
  
  scanf("%d %d\n", &n, &m);
  scanf("%f %f", &a, &b);
  
  sum = n + m;
  diff = n - m;
  
  fsum = a + b;
  fdiff = a - b;
  
  printf("%d %d\n", sum, diff);
  printf("%.1f %.1f", fsum, fdiff);
    return 0;
}
