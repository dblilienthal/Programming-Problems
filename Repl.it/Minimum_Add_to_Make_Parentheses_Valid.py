"""
Given a string S of '(' and ')' parentheses, we add the minimum number of parentheses ( '(' or ')', and in any positions ) so that the resulting parentheses string is valid.

Formally, a parentheses string is valid if and only if:
It is the empty string, or
It can be written as AB (A concatenated with B), where A and B are valid strings, or
It can be written as (A), where A is a valid string.

Given a parentheses string, return the minimum number of parentheses we must add to make the resulting string valid.

Input
S.length <= 1000
S only consists of '(' and ')' characters.
"""

def minAddToMakeValid(S):
  
  # Create a stack
  stack = []
  
  # Create an index variable
  index = 0
  
  # Loop through the string
  while index < len(S):
    if S[index] == "(":
      
      # Check to make sure you don't index out of bounds
      if index +1 != len(S):
        
        # If there is a closed parathesies, skip
        if S[index+1] == ")":
          index += 2
          continue
        
    # If there is not a closed parathesies, push to the stack
    stack.append(S[index])
    
    # Increment the index
    index += 1
  
  return len(stack)
	
print(minAddToMakeValid( '()))((' )) #4
print(minAddToMakeValid( '(((' )) #3
print(minAddToMakeValid( '())' )) #1
print(minAddToMakeValid( '()' )) #0
print(minAddToMakeValid( '))))((((' )) #8
