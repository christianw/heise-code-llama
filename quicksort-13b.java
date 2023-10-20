
public class Quicksort {
    public static void main(String[] args) {
        int[] arr = {5, 1, 3, 2, 4};
        quicksort(arr, 0, 4);
        for (int i = 0; i < 5; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void quicksort(int[] arr, int low, int high) {
        if (low < high) {
            int partition = partition(arr, low, high);
            quicksort(arr, low, partition - 1);
            quicksort(arr, partition + 1, high);
        }
    }

    public static int partition(int[] arr, int low, int high) {
        int pivot = arr[low];
        int i = low;
        for (int j = low + 1; j <= high; j++) {
            if (arr
[j] <= pivot) {
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, low, i);
        return i;
    }

    public static void swap(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }
}
