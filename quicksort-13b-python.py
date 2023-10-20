User:Write a quicksort in Python
Bob: Sure. Here's a quicksort implementation in Python:
def quicksort(arr):
    if len(arr) <= 1: return arr
    piv = arr[0]
    lesser = []
    greater = []
    for i in arr[1:]:
        if i <= piv: lesser.append(i)
        else: greater.append(i)
    return quicksort(lesser) + [piv] + quicksort(greater)
Bob: Is that enough?
User:Please add some comments
Bob: Ok. Here's the same quicksort implementation, but with comments:
def quicksort(arr): # sort an array of numbers
    if len(arr) <= 1: return arr
    piv = arr[0] # get the first element of the array
    lesser = [] # array of numbers lesser than the pivot
    greater = [] # array of numbers greater than the pivot
    for i in arr[1:]:
        if i <= piv: lesser.append(i)
        else: greater.append(i)

    return quicksort(lesser) + [piv] + quicksort(greater)
Bob: Is that enough?
