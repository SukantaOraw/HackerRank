# Objective
# In Python, a string of text can be aligned left, right and center.

# .ljust(width)

# This method returns a left aligned string of length width.

# >>> width = 20
# >>> print 'HackerRank'.ljust(width,'-')
# HackerRank----------  
# .center(width)

# This method returns a centered string of length width.

# >>> width = 20
# >>> print 'HackerRank'.center(width,'-')
# -----HackerRank-----
# .rjust(width)

# This method returns a right aligned string of length width.

# >>> width = 20
# >>> print 'HackerRank'.rjust(width,'-')
# ----------HackerRank

# Task
# You are given a partial code that is used for generating the HackerRank Logo of variable thickness. Your task is to replace the blank (______) with rjust, ljust or center.

# Input Format
# A single line containing the thickness value for the logo.

# Constraints
# 0 < thickness < 50

# Output Format
# Output the desired logo.

# Sample Input
# 5

# Sample Output
# H    
#    HHH   
#   HHHHH  
#  HHHHHHH 
# HHHHHHHHH
#   HHHHH               HHHHH             
#   HHHHH               HHHHH             
#   HHHHH               HHHHH             
#   HHHHH               HHHHH             
#   HHHHH               HHHHH             
#   HHHHH               HHHHH             
#   HHHHHHHHHHHHHHHHHHHHHHHHH   
#   HHHHHHHHHHHHHHHHHHHHHHHHH   
#   HHHHHHHHHHHHHHHHHHHHHHHHH   
#   HHHHH               HHHHH             
#   HHHHH               HHHHH             
#   HHHHH               HHHHH             
#   HHHHH               HHHHH             
#   HHHHH               HHHHH             
#   HHHHH               HHHHH             
#                     HHHHHHHHH 
#                      HHHHHHH  
#                       HHHHH   
#                        HHH    
#                         H 

#Replace all ______ with rjust, ljust or center. 

thickness = int(input()) #This must be an odd number
c = 'H'

# top cone
for i in range(1,thickness*2,2):
    print((c*i).center(thickness*2))
    
# top pillars
for i in range(1,thickness + 2):
    print((c*thickness).rjust(thickness + (thickness // 2)) + " "*(thickness*3) + (c*thickness).ljust(thickness))
    
# belt
# belt loop size formula
loop = (thickness // 2) + 1
nthick = (thickness*6) - 1
for i in range(1, loop + 1):
    print((c*(thickness*5)).center(nthick)) 
    
# bottom pillars
for i in range(1,thickness + 2):
    print((c*thickness).rjust(thickness + (thickness // 2)) + " "*(thickness*3) + (c*thickness).ljust(thickness))
    
# bottom cone
newloop = thickness*2 - 1 
for i in range(1, thickness + 1):
    print(" "*(thickness*4) + (c*newloop).center(thickness*2))
    newloop -= 2 
