Problem
Mr. Vincent works in a door mat manufacturing company. One day, he designed a new door mat with the following specifications:

Mat size must be N X M. (N is an odd natural number, and M is 3 times N.)
The design should have ‘WELCOME’ written in the center.
The design pattern should only use |, . and – characters.

Sample Designs
Size: 7 x 21 
    ---------.|.---------
    ------.|..|..|.------
    ---.|..|..|..|..|.---
    -------WELCOME-------
    ---.|..|..|..|..|.---
    ------.|..|..|.------
    ---------.|.---------
    
    Size: 11 x 33
    ---------------.|.---------------
    ------------.|..|..|.------------
    ---------.|..|..|..|..|.---------
    ------.|..|..|..|..|..|..|.------
    ---.|..|..|..|..|..|..|..|..|.---
    -------------WELCOME-------------
    ---.|..|..|..|..|..|..|..|..|.---
    ------.|..|..|..|..|..|..|.------
    ---------.|..|..|..|..|.---------
    ------------.|..|..|.------------
    ---------------.|.---------------

Input Format
A single line containing the space separated values of N and M.

Constraints
5 < N < 101
15 < M < 303

Output Format
Output the design pattern.

Sample Input
9 27

Sample Output
------------.|.------------
---------.|..|..|.---------
------.|..|..|..|..|.------
---.|..|..|..|..|..|..|.---
----------WELCOME----------
---.|..|..|..|..|..|..|.---
------.|..|..|..|..|.------
---------.|..|..|.---------
------------.|.------------

# Enter your code here. Read input from STDIN. Print output to STDOUT

N,M = map(int, input().split())

loop = int(N/2)

j = 1

for i in range(1,loop + 1):
    print((".|."*j).center(M,"-"))
    j += 2
    
print(("WELCOME").center(M,"-"))

k = N - 2

for i in range(1,loop + 1):
    print((".|."*k).center(M,"-"))
    k -= 2
