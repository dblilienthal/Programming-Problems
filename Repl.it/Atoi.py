"""
Implement atoi which converts a string to an integer.

The function first discards as many whitespace characters as necessary until the first non-whitespace character is found. Then, starting from this character, takes an optional initial plus or minus sign followed by as many numerical digits as possible, and interprets them as a numerical value.

The string can contain additional characters after those that form the integral number, which are ignored and have no effect on the behavior of this function.

If the first sequence of non-whitespace characters in str is not a valid integral number, or if no such sequence exists because either str is empty or it contains only whitespace characters, no conversion is performed.

If no valid conversion could be performed, a zero value is returned.

Note:
Only the space character ' ' is considered as whitespace character.
Assume we are dealing with an environment which could only store integers within the 32-bit signed integer range: [−231,  231 − 1]. If the numerical value is out of the range of representable values, INT_MAX (231 − 1) or INT_MIN (−231) is returned.
"""

def atoi(a):
  
  # First: discard white spaces
  # Second: takes an optional initial plus or minus
  # Third: takes as many numerical digits as possible
  
  a = a.lstrip() # remove the white spaces from the left
  temp_string = "" # Create a temporary string 
  
  # check to see if the first character is a minus sign
  if a[0] == "-":
    temp_string += a[0]
    a = a.lstrip("-")

  # Loop through the string and add only the numbers
  for char in a:
    if char.isdigit():
      temp_string += char
    else:
      break
  
  # If the string has nothing, then return 0
  if temp_string == "":
    return 0
  
  INT_MIN = -2147483648
  INT_MAX = 2147483648
  
  # Check to see if the string value is out of range
  if int(temp_string) > INT_MAX:
    return INT_MAX
  if int(temp_string) < INT_MIN:
    return INT_MIN
  
  return int(temp_string)
  
print(atoi("42")) # 42
print(atoi("     -42")) # -42
print(atoi("4193 with words")) # 4193
print(atoi("words and 987")) # 0
print(atoi("-91283472332")) # -2147483648
