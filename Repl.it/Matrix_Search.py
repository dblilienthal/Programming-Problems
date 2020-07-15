"""
Write an efficient algorithm that searches for a value in an m x n matrix.
This matrix has the following properties:
Integers in each row are sorted from left to right.
The first integer of each row is greater than or equal to the last integer of the previous row.
Example:
Consider the following matrix:
[
  [1,   3,  5,  7],
  [10, 11, 16, 20],
  [23, 30, 34, 50]
]


Given target = 3, return 1 ( 1 corresponds to true )

Return 0 / 1 ( 0 if the element is not present, 1 if the element is present ) for this problem
"""

def matrix_search(matrix, target):
  
  # Create a boolean variable
  flag = False
  
  # Loop through the matrix
  for row_num, row in enumerate(matrix):
    
    # If the target is inbetween the first number in the row and the last,
    # Loop through that row 
    if matrix[row_num][0] <= target and matrix[row_num][-1] >= target:
      for i in range(len(row)):
        if matrix[row_num][i] == target:
          flag = True
          break
      
  # If the number is found, return 1. Otherwise, 0
  if flag == True:
    return 1
  return 0
