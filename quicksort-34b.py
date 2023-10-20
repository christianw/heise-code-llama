def quicksort(arr):
    if len(arr) <= 1:
        return arr
    pivot = arr[0]
    less = []
    greater = []
    for x in arr[1:]:
        if x < pivot:
            less.append(x)
        else:
            greater.append(x)
    return quicksort(less) + [pivot] + quicksort(greater)
