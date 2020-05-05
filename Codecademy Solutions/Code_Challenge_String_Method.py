# -*- coding: utf-8 -*-
"""
Created on Sun Apr  5 20:09:48 2020

@author: dlili
"""

"""
Write a function called unique_english_letters that takes the string word as a
parameter. The function should return the total number of unique letters in 
the string. Uppercase and lowercase letters should be counted as different 
letters.
"""
def unique_english_letters(word):
  temp_list = []
  result = 0
  for i in range(0, len(word)):
    if not word[i] in temp_list:
      temp_list.append(word[i])
      result += 1
  return result


"""
Write a function named count_char_x that takes a string named word and a 
single character named x as parameters. The function should return the number 
of times x appears in word.
"""
def count_char_x(word, x):
  result = 0
  for i in range(0, len(word)):
    if word[i] == x:
      result += 1
  return result

"""
Write a function named count_multi_char_x that takes a string named word and a 
string named x. This function should do the same thing as the count_char_x 
function you just wrote - it should return the number of times x appears in 
word. However, this time, make sure your function works when x is multiple 
characters long.

For example, count_multi_char_x("Mississippi", "iss") should return 2
"""
def count_multi_char_x(word, x):
  result = 0
  # Replace 'x' with a '#' so we can count the instances of 'x' easier
  temp = word.replace(x, "#") 
  for i in range(0, len(temp)):
    if temp[i] == "#":
      result += 1
  return result


"""
Write a function named substring_between_letters that takes a string named 
word, a single character named start, and another character named end. This 
function should return the substring between the first occurrence of start and 
end in word. If start or end are not in word, the function should return word.

For example, substring_between_letters("apple", "p", "e") should return "pl".
"""
def substring_between_letters(word, start, end):
  try:
    start_index = word.index(start)
    end_index = word.index(end)
    return word[start_index+1:end_index]
  except:
    return word


"""
Create a function called x_length_words that takes a string named sentence and
an integer named x as parameters. This function should return True if every 
word in sentence has a length greater than or equal to x.
"""
def x_length_words(sentence, x):
  temp_list = sentence.split()
  for word in temp_list:
    if not len(word) >= x:
      return False
  return True


"""
Write a function called check_for_name that takes two strings as parameters 
named sentence and name. The function should return True if name appears in 
sentence in all lowercase letters, all uppercase letters, or with any mix of 
uppercase and lowercase letters. The function should return False otherwise.

For example, the following three calls should all return True:

check_for_name("My name is Jamie", "Jamie")
check_for_name("My name is jamie", "Jamie")
check_for_name("My name is JAMIE", "Jamie")
"""
def check_for_name(sentence, name):
  i = 0
  flag = False
  temp_list = sentence.split()
  for word in temp_list:
    if len(word) != len(name):
      continue
    while i != len(word):
      temp_char = word[i]
      if not (temp_char.upper() == name[i]) or (temp_char.lower() == name[i]):
        flag = True
      i += 1
  return flag


"""
Create a function named every_other_letter that takes a string named word as 
a parameter. The function should return a string containing every other letter 
in word.
"""
def every_other_letter(word):
  result = ""
  for i in range(0, len(word), 2):
    result += word[i]
  return result


"""
Write a function named reverse_string that has a string named word as a 
parameter. The function should return word in reverse.
"""
def reverse_string(word):
  result = ""
  for i in range(1, len(word)+1):
    result += word[-i]
  return result


"""
A Spoonerism is an error in speech when the first syllables of two words are 
switched. For example, a Spoonerism is made when someone says “Belly Jeans” 
instead of “Jelly Beans”.

Write a function called make_spoonerism that takes two strings as parameters 
named word1 and word2. Finding the first syllable of a word is a difficult 
task, so for our function, we’re going to switch the first letters of each 
word. Return the two new words as a single string separated by a space.
"""
def make_spoonerism(word1, word2):
  # 'fp' stands for first part, 'lp' stands for last part
  word1_fp = word1[0]
  word1_lp = word1[1:(len(word1))]
  word2_fp = word2[0]
  word2_lp = word2[1:(len(word2))]
  return word2_fp + word1_lp + " " + word1_fp + word2_lp


"""
Create a function named add_exclamation that has one parameter named word. 
This function should add exclamation points to the end of word until word is 
20 characters long. If word is already at least 20 characters long, just 
return word.
"""
def add_exclamation(word):
  for i in range(0, (20 - len(word))):
    word += "!"
  return word
































