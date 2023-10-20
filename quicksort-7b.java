public class QuickSort {
public static void main(String[] args) {
int[] arr = {34, 56, 74, 12, 19};
int[] temp;

// Sort the array
sort(arr);

// Print the sorted array
print(arr);
}

public static void sort(int[] arr) {
    int i, j;
    int pivot;

    // If there are no more than 1 element in the array
    // return
    if(arr.length <= 1) {
        return;
    }

    // set the pivot to the middle element
    pivot = arr[arr.length / 2];

    // move all elements less than the pivot
    // to the left of pivot
    i = 0;
    j = arr.length - 1;
    while(i <= j) {
        if(arr[i] < pivot) {
            // swap arr[i] with arr[j]

 temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        } else {
            i++;
        }
    }

    // swap pivot with arr[j]
    temp = arr[j];
    arr[j] = pivot;
    pivot = temp;

    // sort the subarray to the left of pivot
    sort(arr, 0, j - 1);

    // sort the subarray to the right of pivot
    sort(arr, j + 1, arr.length - 1);
}

public static void sort(int[] arr, int low, int high) {
    // recursively sort the subarray
    sort(arr, low, high);
}
}
