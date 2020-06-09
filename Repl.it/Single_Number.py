"""
Given a non-empty array of integers, every element appears twice except for one. Find that single one.

Example 1:
Input: [2,2,1]
Output: 1

Example 2:
Input: [4,1,2,1,2]
Output: 4

--------------------------------------------------------------------------------------------------------------------

For my solution, i realised that if the array was sorted, that every number would be next to its complementing pair.
This ment that we could loop through the array by 2's and check to see if the next number in the array was the same.
If the number next to it was not the same, then that number was the single number that does not have a duplicate.
We also had to check for endcases because if we had an odd amount of elements, the last element would not be checked. 
"""

def single_number(integers):
  integers.sort()
  
  #check for endcases
  if integers.count(integers[-1]) == 1:
    return integers[-1]
  
  for i in range(0, len(integers)-1, 2):
    if not integers[i] == integers[i+1]:
      return integers[i]
    
print(single_number([2,2,1])) #1
print(single_number([4,1,2,1,2])) #4
print(single_number([1,2,1,2,3,4,3,4,5,6,5,6,7])) #7
