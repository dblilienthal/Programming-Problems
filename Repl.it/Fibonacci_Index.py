"""
Fibonacci numbers are the numbers in the integer sequence starting with 1, 1 where every number after the first two is the sum of the two preceding ones:

1, 1, 2, 3, 5, 8, 13, 21, 34, ...

Given a positive integer, determine if it's the nth Fibonacci number for some n. If it is, print such n, otherwise print -1.

Example input
8

Example output
6

"""

def fibonacci_index(input):
  
  # Create a list with the first two numbers
  fibonacci_list = [1,1]
  
  # Create an index variable and a next_num variable
  index = 0
  next_num = 0
  
  while next_num < input:
  
    # add the last two numbers to get the next number
    next_num = fibonacci_list[index] + fibonacci_list[index+1]
      
    # add that number to the list
    fibonacci_list.append(next_num)
    
    # check to see if that number equals the input
    if next_num == input:
      return index +3 # Add three to the index in order to get to index of the number
    
    # increment the index
    index += 1
    
  return -1
