// Objective
// Given a string, s, consisting of alphabets and digits, find the frequency of each digit in the given string.

// Input Format
// The first line contains a string, num which is the given number.

// Constraints
// 1 <= len(num) <= 1000

// All the elements of num are made of english alphabets and digits.

// Output Format
// Print ten space-separated integers in a single line denoting the frequency of each digit from 0 to 9.

// Sample Input 0
// a11472o5t6

// Sample Output 0
// 0 2 1 0 1 1 1 1 0 0 
  
// Explanation 0
// In the given string:
// 1 occurs two times.
// 2,4,5,6 and 7 occur one time each.
// The remaining digits 0, 3, 8 and 9 don’t occur at all.
  
// Sample Input 1
// lw4n88j12n1

// Sample Output 1
// 0 2 1 0 1 0 0 0 2 0 
  
// Sample Input 2
// 1v88886l256338ar0ekk
  
// Sample Output 2
// 1 1 1 2 0 1 2 0 5 0 

#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>

int main() {

    /* Enter your code here. Read input from STDIN. Print output to STDOUT */    
    int flag = 0;
    char *str = malloc(sizeof(char)*1024);
    gets(str);
    int len = strlen(str);
    char arr[] = {'0','1','2','3','4','5','6','7','8','9'};
    
    for(int i = 0; i < 10; i++){
        
        for(int j = 0; j < len; j++){
            
            if(arr[i] == str[j]){
                
                flag++;
                
                if(flag >= 2){
                    
                    for(int k = j; k <len; k++){
                         str[k] = str[k+1];
                    }
                    j--;
                    len--;
                }
            } 
        }
        printf("%d ", flag);
        flag = 0;
    }
}
