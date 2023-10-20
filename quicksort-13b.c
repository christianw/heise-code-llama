#include <stdio.h>
#include <stdlib.h>

void quicksort(int *arr, int left, int right)
{
    int i, j, tmp, pivot;
    if (left >= right) {
        return;
    }
    pivot = arr[left];
    i = left;
    j = right;
    while (i < j) {
        while (i < j && arr[j] >= pivot) {
            j--;
        }
        arr[i] = arr[j];
        while (i < j && arr[i] <= pivot) {
            i++;
        }
        arr[j] = arr[i];
    }
    arr[i] = pivot;
    quicksort(arr, left, i - 1);
    quicksort(arr, i + 1, right);
}

int main()
{
    int arr[] = {3, 2, 1, 5, 6, 4};
    int len = sizeof(arr) / sizeof(arr[0]);

    quicksort(arr, 0, len - 1);
    for (int i = 0; i < len; i++) {
        printf("%d ", arr[i]);
    }
    return 0;
}
