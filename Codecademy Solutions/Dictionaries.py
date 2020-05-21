# -*- coding: utf-8 -*-
"""
Created on Fri Apr 17 23:00:52 2020

@author: dlili
"""


"""
Write a function named sum_values that takes a dictionary named my_dictionary 
as a parameter. The function should return the sum of the values of the 
dictionary
"""

def sum_values(my_dictionary):
  total = 0
  for i in my_dictionary.values():
    total += i
  return total


"""
Create a function called sum_even_keys that takes a dictionary named 
my_dictionary, with all integer keys and values, as a parameter. This function 
should return the sum of the values of all even keys.
"""

def sum_even_keys(my_dictionary):
  result = 0
  for key, value in my_dictionary.items():
    if key%2 == 0:
      result += value
  return result


"""
Create a function named add_ten that takes a dictionary with integer values 
named my_dictionary as a parameter. The function should add 10 to every value 
in my_dictionary and return my_dictionary
"""

def add_ten(my_dictionary):
  for key, value in my_dictionary.items():
    value += 10
    my_dictionary[key] = value
  return my_dictionary


"""
Create a function named values_that_are_keys that takes a dictionary named 
my_dictionary as a parameter. This function should return a list of all values 
in the dictionary that are also keys.
"""

def values_that_are_keys(my_dictionary):
  result = []
  for key in my_dictionary.keys():
    for value in my_dictionary.values():
      if key == value:
        result.append(key)
  return result


"""
Write a function named max_key that takes a dictionary named my_dictionary as 
a parameter. The function should return the key associated with the largest 
value in the dictionary.
"""

def max_key(my_dictionary):
  max_k = 0
  max_v = 0
  for key, value in my_dictionary.items():
    if max_v < value:
      max_v = value
      max_k = key
  return max_k


"""
Write a function named word_length_dictionary that takes a list of strings 
named words as a parameter. The function should return a dictionary of 
key/value pairs where every key is a word in words and every value is the 
length of that word.
"""

def word_length_dictionary(words):
  result = {}
  for word in words:
    word_length = len(word) 
    result[word] = word_length
  return result 


"""
Write a function named frequency_dictionary that takes a list of elements 
named words as a parameter. The function should return a dictionary containing 
the frequency of each element in words.
"""

def frequency_dictionary(words):
  result = {}
  for word in words:
    if not result.get(word):
      result[word] = 1
      continue
    result[word] = result.get(word) + 1
  return result


"""
Create a function named unique_values that takes a dictionary named 
my_dictionary as a parameter. The function should return the number of unique 
values in the dictionary.
"""

def unique_values(my_dictionary):
  seen_values = []
  for value in my_dictionary.values():
    try:
      if not seen_values.index(value):
        continue
    except:
      seen_values.append(value)
  return len(seen_values)


"""
Create a function named count_first_letter that takes a dictionary named names 
as a parameter. names should be a dictionary where the key is a last name and 
the value is a list of first names.

The function should return a new dictionary where each key is the first letter 
of a last name, and the value is the number of people whose last name begins 
with that letter.
"""

def count_first_letter(names):
  result = {}
  for key, values in names.items():
    temp_counter = 0
    first_letter = key[0]
    for i in values:
      temp_counter += 1
    if not result.get(first_letter):
      result[first_letter] = temp_counter
      continue
    result[first_letter] = result.get(first_letter) + temp_counter
  return result



