public class Sort {
    public static void quickSort(int[] a, int first, int last) {
        if (first < last) {
            int div = partition(a, first, last);
            quickSort(a, first, div - 1);
            quickSort(a, div + 1, last);
        }
    }
    private static int partition(int[] a, int first, int last) {
        int pivot = a[last];
        int l = first - 1;
        for (int i = first; i < last; i++) {
            if (a[i] <= pivot) {
                l++;
                int tmp = a[l];
                a[l] = a[i];
                a[i] = tmp;
            }
        }
        int tmp = a[l + 1];
        a[l + 1] = a[last];
        a[last] = tmp;
        return l + 1;
    }
    public
 static void main(String[] args) {
        int[] a = new int[10];
        for (int i = 0; i < 10; i++) {
            a[i] = i * i;
        }
        quickSort(a, 0, a.length - 1);
    for (int i = 0; i < 10; i++)
      System.out.println(a[i]);
    }
}
