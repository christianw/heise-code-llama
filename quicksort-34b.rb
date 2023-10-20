  def quicksort(ary)
    return [] if ary.size <= 1
    pivot = ary.delete_at(rand(ary.size))
    less = quicksort(ary.select { |x| x <= pivot })
    greater = quicksort(ary.select { |x| x > pivot })
    less + [pivot] + greater
  end

