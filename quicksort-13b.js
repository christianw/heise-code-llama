function quicksort(arr) {
  if (arr.length <= 1) {
    return arr;
  }
  var pivot = arr[0];
  var less = [];
  var greater = [];
  for (var i = 1; i < arr.length; i++) {
    if (arr[i] < pivot) {
      less.push(arr[i]);
    } else {
      greater.push(arr[i]);
    }
  }
  return quicksort(less).concat([pivot], quicksort(greater));
}
