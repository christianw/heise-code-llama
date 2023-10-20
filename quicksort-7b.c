void quickSort(int arr[], int low, int high)
{
    int i, j, pivot, temp;

    if (low < high)
    {
        pivot = arr[low];

        i = low;
        j = high;

        while (i < j)
        {
            while (arr[i] <= pivot)
                i++;

            while (arr[j] > pivot)
                j--;

            if (i < j)
            {
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        arr[low] = arr[j];
        arr[j] = pivot;

        quickSort(arr, low, j - 1);
        quickSort(arr
, j + 1, high);
    }
}
