"""

Given two integers - the number of rows m and columns n of m×n 2d list - and subsequent m rows of n integers, followed by one integer c. Multiply every element by c and print the result.

Example input
3 4
11 12 13 14
21 22 23 24
31 32 33 34
2

Example output
22 24 26 28
42 44 46 48
62 64 66 68

"""

rows, columns = input().split()

matrix = []

for row in range(int(rows)):
  # add the row to the matrix
  matrix.append(input().split())
  
c = int(input())

# Create a row index variable
row_index = 0

for row in matrix:
  # Create a number_index variable
  num_index = 0
  for num in row:
    matrix[row_index][num_index] = int(matrix[row_index][num_index]) * c
    num_index += 1
  row_index +=1

# print the matrix all nicely

for row in matrix:
  temp_string = ""
  for num in row:
    temp_string += str(num) + " "
  print(temp_string)
