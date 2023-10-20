def quicksort(arr)
  return arr if arr.length <= 1
  pivot = arr[0]
  less = []
  greater = []
  arr.drop(1).each do |x|
    if x < pivot
      less << x
    else
      greater << x
    end
  end
  quicksort(less) + [pivot] + quicksort(greater)
end

