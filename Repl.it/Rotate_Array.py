"""
Given an array, rotate the array to the right by k steps, where k is non-negative.

Input: [1,2,3,4,5,6,7] and k = 3
Output: [5,6,7,1,2,3,4]
Explanation:
rotate 1 steps to the right: [7,1,2,3,4,5,6]
rotate 2 steps to the right: [6,7,1,2,3,4,5]
rotate 3 steps to the right: [5,6,7,1,2,3,4]

Input: [-1,-100,3,99] and k = 2
Output: [3,99,-1,-100]
Explanation: 
rotate 1 steps to the right: [99,-1,-100,3]
rotate 2 steps to the right: [3,99,-1,-100]

--------------------------------------------------------------------------------------------------------
In order for us to shift our array by k amount of spots, we would need some sort of way to 
loop through the array without getting an index error. I also realised that instead of shifting
each index by k, we had to shift by the length of the array minus k in order for us to account
for an array that had an odd amount of elements. We also had to use modulo as a way of adding 
the right element to the result array. 
"""

def rotate_array(input_array, k):
  result = []
  shift = len(input_array) - k
  for i in range(0, len(input_array)):
    if i + shift >= len(input_array):
      result.append(input_array[(i+shift) % len(input_array)])
      continue
    result.append(input_array[i + shift])
  return result
      
    
print(rotate_array([1,2,3,4,5,6,7], 3)) # [5,6,7,1,2,3,4]
print(rotate_array([-1,-100,3,99],2)) # [3,99,-1,-100]
print(rotate_array([1, 2, 3, 4, 5, 6], 1)) # [6,1,2,3,4,5]
