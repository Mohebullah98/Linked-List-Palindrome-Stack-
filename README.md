# Linked-List-Palindrome-Stack-
Palindrome detection for linked list using stack. (Optimal)

Check to see if a Linked List is a palindrome. A palindrome is a word or phrase that is the same thing backwards.
ex: TACO CAT --> TAC OCAT =True. White spaces are ignored.

For this algorithm, all we have to do is compare the second half of a list with it's first half to determine it's a palindrome.
So we iterate through the list with two pointers, fast and slow. When fast reaches the end, slow will be halfway through the list because fast is 2x the speed of slow.
We add all the elements from the first half of the list onto a stack. This is good because the stack will keep the elements in reverse order.
So all we have to do is compare the 2nd half of the list with the reverse of the first half (slow iterates from the middle to the end of list and compares elements with stack) and if all elements match, it's a palindrome.
